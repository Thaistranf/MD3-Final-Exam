package service;

import model.NhanVien;

import java.sql.SQLException;
import java.util.List;

public interface INhanVienDAO {
    public void insert(NhanVien nhanVien) throws SQLException;

    public NhanVien findById(int id);

    public List<NhanVien> findAll();

    public boolean delete(int id) throws SQLException;

    public boolean update(NhanVien nhanVien) throws SQLException;
}
