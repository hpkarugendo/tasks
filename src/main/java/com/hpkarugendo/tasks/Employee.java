package com.hpkarugendo.tasks;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	@Column(unique = true)
	private int code;
	private String firstName, lastName, role;
	@ManyToOne
	private Department department;
	private boolean signedIn;
	@OneToMany(mappedBy = "employee")
	private List<Todo> jobs;
	
	public Employee() {
		this.code = 1000;
		this.department = new Department();
		this.firstName = "firstName";
		this.jobs = new ArrayList<Todo>();
		this.lastName = "lastName";
		this.role = "REGULAR";
		this.signedIn = false;
	}
	public Employee(int code, String firstName, String lastName, String role, Department department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.department = department;
		this.code = code;
		this.jobs = new ArrayList<Todo>();
		this.signedIn = false;
	}
	public int getId() {
		return id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public boolean isSignedIn() {
		return signedIn;
	}
	public void setSignedIn(boolean signedIn) {
		this.signedIn = signedIn;
	}
	public List<Todo> getJobs() {
		return jobs;
	}
	public void setJobs(List<Todo> jobs) {
		this.jobs = jobs;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", code=" + code + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", role=" + role + ", department=" + department.getName() + ", signedIn=" + signedIn + "]";
	}
	
}
