package com.hpkarugendo.tasks;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Todo {
	@Id
	@GeneratedValue
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	@OneToOne
	private Task task;
	private boolean done;
	@ManyToOne
	private Employee employee;
	
	public Todo() {
		this.date = new Date();
		this.done = false;
		this.employee = new Employee();
		this.task = new Task();
	}
	public Todo(Date date, Task task, boolean done, Employee employee) {
		this.date = date;
		this.task = task;
		this.done = done;
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", date=" + date + ", task=" + task + ", done=" + done + ", employee=" + employee.getFirstName()
				+ "]";
	}
	
}
