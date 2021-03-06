package org.delta.springmvc.dao;

import java.util.List;

import org.delta.springmvc.model.Employee;

public interface EmployeeDao {

	Employee findById(int id);
	 
    void saveEmployee(Employee employee);
     
    void deleteEmployeeBySsn(String ssn);
     
    List<Employee> findAllEmployees();
 
    Employee findEmployeeBySsn(String ssn);
    
}
