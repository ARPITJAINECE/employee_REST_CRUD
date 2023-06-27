package com.app.service;

import java.util.List;

import com.app.entities.Employee;

public interface EmployeeService {
// add a method to get a list of all the employees
	List<Employee> getAllListOfEmps();

	// add a method to insert the emplyees in the DB
	Employee addEmpDetails(Employee emp);

	// add a method to delete the emps
	String deleteEmp(Long empid);

	// for updation : 2 steps first save then update
	// 1. getempdetails
	Employee getEmpDetails(Long empid);

	// 2. updateempdetails
	Employee updateEmpDetails(Employee employ);
}
