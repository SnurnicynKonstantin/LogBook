package ru.ks_on_v.dao;

import java.util.List;

import ru.ks_on_v.model.Employee;

public interface EmployeeDao {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

}