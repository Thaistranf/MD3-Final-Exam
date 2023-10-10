package service;

import model.NhanVien;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO implements INhanVienDAO{

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlnv?useSSL=false", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void insert(NhanVien nhanVien) throws SQLException {
        try (
                Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into customer(id, name, email, address, phoneNumber, salary, departmentName) values (?, ?, ?, ?, ?, ?, ?)");) {

            preparedStatement.setInt(1, nhanVien.getId());
            preparedStatement.setString(2, nhanVien.getNvName());
            preparedStatement.setString(3, nhanVien.getEmail());
            preparedStatement.setString(4, nhanVien.getAddress());
            preparedStatement.setString(5, nhanVien.getPhone());
            preparedStatement.setString(6, nhanVien.getSalary());
            preparedStatement.setString(7, nhanVien.getDepartmentName());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {

        }
    }

    @Override
    public NhanVien findById(int id) {
        return null;
    }

    @Override
    public List<NhanVien> findAll() {
        List<NhanVien> nhanVien = new ArrayList<>();
        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement("SELECT nhan_vien.id, nhan_vien.name, nhan_vien.email, nhan_vien.address, nhan_vien.phoneNumber, nhan_vien.salary, department.departmentName \n" +
                     "FROM nhan_vien join department on nhan_vien.departmentId = department.departmentId;");) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String phoneNumber = rs.getString("phoneNumber");
                String salary = rs.getString("salary");
                String departmentName = rs.getString("departmentName");

                nhanVien.add(new NhanVien(id, name, email, address, phoneNumber, salary, departmentName));
            }
        } catch (SQLException e) {

        }
        return nhanVien;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(NhanVien nhanVien) throws SQLException {
        return false;
    }
}
