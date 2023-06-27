package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
//depen: empservice
	@Autowired
	private EmployeeService empService;

	public EmployeeController() {
		System.out.println("in the constr of employeecontroller: " + getClass());
	}

	@GetMapping
	public List<Employee> getEmpList() {
		System.out.println("in the get emp list : " + getClass());
		return empService.getAllListOfEmps();
	}

	@PostMapping
	public ResponseEntity<?> addEmp(@RequestBody Employee empl) {
		System.out.println("in the ADD EMP method : " + empl);
		return new ResponseEntity<>(empService.addEmpDetails(empl), HttpStatus.CREATED);

	}

	@DeleteMapping("/{empid}")
	public ApiResponse deleteEmpDetails(@PathVariable Long empid) {
		System.out.println("in the delete emp : " + getClass());
		return new ApiResponse(empService.deleteEmp(empid));
	}

	@GetMapping("/{empID}")
	public Employee getEmpDetails(@PathVariable Long empID) {
		System.out.println("in the get emp details class : " + getClass());
		return empService.getEmpDetails(empID);
	}

	@PutMapping
	public Employee updateEmpDetails(@RequestBody Employee employee) {
		System.out.println("in the upadte emp class : " + getClass());
		return empService.updateEmpDetails(employee);
	}

}
