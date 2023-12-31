package com.app.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee_new")
public class Employee extends BaseEntity {
	/*
	 * <tr key={employee.id}> <td>{employee.firstName}</td>
	 * <td>{employee.lastName}</td> <td>{employee.email}</td>
	 * <td>{employee.location}</td> <td>{employee.department}</td>
	 * <td>{employee.joinDate}</td> <td>{employee.salary}</td> <td>
	 */
	@Column(name = "first_name", length = 20)
	private String firstName;
	@Column(name = "last_name", length = 20)
	private String lastName;
	@Column(length = 20, unique = true)
	private String email;
	@Column(length = 20)
	private String location;
	@Column(length = 30)
	private String department;
	@Column(name = "join_date")
	private LocalDate joinDate;
	private double salary;
	@Column(length = 20, nullable = false)
	private String password;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee(String firstName, String lastName, String email, String location, String department,
			LocalDate localDate, double salary, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.location = location;
		this.department = department;
		this.joinDate = localDate;
		this.salary = salary;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", location="
				+ location + ", department=" + department + ", joinDate=" + joinDate + ", salary=" + salary + "]";
	}

}
