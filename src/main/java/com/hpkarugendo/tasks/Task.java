package com.hpkarugendo.tasks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Task {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String frequency, shift;
	@ManyToOne
	private Department department;
	
	public Task() {
		this.department = new Department();
		this.frequency = "DAILY";
		this.name = "task";
		this.shift = "DAY";
	}
	public Task(String name, String frequency, String shift, Department department) {
		this.name = name;
		this.frequency = frequency;
		this.department = department;
		this.shift = shift;
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
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", frequency=" + frequency + ", shift=" + shift + ", department="
				+ department.getName() + "]";
	}
}
