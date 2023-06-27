package com.app.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.entities.Employee;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class EmployeeRepositoryTest {
// dep: empRepo
	@Autowired
	private EmployeeRepository empRepo;

	@Test
	void test() {
		/*
		 * private String firstName;
		 * 
		 * @Column(name = "last_name", length = 20) private String lastName;
		 * 
		 * @Column(length = 20, unique = true) private String email;
		 * 
		 * @Column(length = 20) private String location;
		 * 
		 * @Column(length = 30) private String department;
		 * 
		 * @Column(name = "join_date") private LocalDateTime joinDate; private double
		 * salary;
		 * 
		 * @Column(length = 20, nullable = false) private String password;
		 * 
		 */
		List<Employee> list1 = List.of(
				new Employee("abc", "def", "abc@def", "pune", "RND", LocalDate.parse("2020-10-10"), 123045, "12345"),
				new Employee("ghi", "jkl", "ghi@jkl", "mumbai", "IT", LocalDate.parse("2020-06-09"), 125045, "54321"));
		List<Employee> list2 = empRepo.saveAll(list1);
		assertEquals(2, list2.size());
	}

}
