package model;

public class NhanVien {
    private int id;
    private String nvName;
    private String email;
    private String address;
    private String phone;
    private String salary;
    private String departmentName;

    public NhanVien() {
    }

    public NhanVien(int id, String nvName, String email, String address, String phone, String salary, String departmentName) {
        this.id = id;
        this.nvName = nvName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.departmentName = departmentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNvName() {
        return nvName;
    }

    public void setNvName(String nvName) {
        this.nvName = nvName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
