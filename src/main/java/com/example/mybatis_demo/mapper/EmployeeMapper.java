package com.example.mybatis_demo.mapper;


import com.example.mybatis_demo.DaoMain.Employee;

public interface EmployeeMapper {
    public Employee getEmp(Integer id);
    public void insertEmp(Employee employee);
}
