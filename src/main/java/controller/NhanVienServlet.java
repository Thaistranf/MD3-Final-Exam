package controller;

import model.NhanVien;
import service.INhanVienDAO;
import service.NhanVienDAO;

import java.io.*;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "nvServlet", value = "/nv-servlet")
public class NhanVienServlet extends HttpServlet {
    INhanVienDAO nhanVienDAO = new NhanVienDAO();
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("act");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                try {
                    save(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }

    private void save(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nvName = request.getParameter("nvName");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String salary = request.getParameter("salary");
        String departmentName = request.getParameter("departmentName");

        nhanVienDAO.insert(new NhanVien(id, nvName, email, address, phone, salary, departmentName));

        response.sendRedirect("/nv-servlet");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("act");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreateForm(request, response);
            default:
                showList(request, response);
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/nhanvien/list.jsp");
        List<NhanVien> nhanViens = nhanVienDAO.findAll();
        request.setAttribute("dsnv", nhanViens);
        requestDispatcher.forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/nhanvien/create.jsp");
        requestDispatcher.forward(request, response);
    }

}