package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Employee;
import com.app.exception.ResourceNotFoundExecption;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
//depen: emp repo
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllListOfEmps() {
		return empRepo.findAll();
	}

	@Override
	public Employee addEmpDetails(Employee emp) {
		System.out.println("in the add emp method of empserviceimpl: " + getClass());
		return empRepo.save(emp);
	}

	@Override
	public String deleteEmp(Long empid) {
		System.out.println("in delete emp : " + getClass());
		String mesg = "employee does not exist with empid: " + empid;
		if (empRepo.existsById(empid)) {
			empRepo.deleteById(empid);
		}
		mesg = " employee with id: " + empid + " deleted successfully!!";
		return mesg;
	}

	@Override
	public Employee getEmpDetails(Long empid) {
		System.out.println("in thefirst step to update the empdetails: " + getClass());
		return empRepo.findById(empid).orElseThrow(() -> new ResourceNotFoundExecption("invalid empid"));
	}

	@Override
	public Employee updateEmpDetails(Employee employ) {
		System.out.println("in the update emp details: " + getClass());
		return empRepo.save(employ);
	}

}
