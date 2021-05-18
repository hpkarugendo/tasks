package com.hpkarugendo.tasks;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.lang.NonNull;

@Entity
public class Department {
	@Id
	@GeneratedValue
	private int id;
	@NonNull
	@Column(unique = true)
	private String name;
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;
	@OneToMany(mappedBy = "department")
	private List<Task> tasks;
	
	public Department() {
		this.name = "NONE";
		this.employees = new ArrayList<Employee>();
		this.tasks = new ArrayList<Task>();
	}
	public Department(String name) {
		this.name = name;
		this.employees = new ArrayList<Employee>();
		this.tasks = new ArrayList<Task>();
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
