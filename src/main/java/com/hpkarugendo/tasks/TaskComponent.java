package com.hpkarugendo.tasks;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskComponent implements CommandLineRunner {
	@Autowired
	private DepartmentRepository dRepo;
	@Autowired
	private EmployeeRepository eRepo;
	@Autowired
	private TaskRepository tRepo;

	@Override
	public void run(String... args) throws Exception {
		//Department Data
		if(dRepo.findAllByOrderById().isEmpty()) {
			Department d = new Department("RECEPTION");
			System.out.println(dRepo.save(d));
			d = new Department("RESTAURANT");
			System.out.println(dRepo.save(d));
			d = new Department("KITCHEN");
			System.out.println(dRepo.save(d));
			d = new Department("HOUSE KEEPING");
			System.out.println(dRepo.save(d));
			d = new Department("ACCOUNTING");
			System.out.println(dRepo.save(d));
			d = new Department("RESERVATIONS");
			System.out.println(dRepo.save(d));
			d = new Department("SALES");
			System.out.println(dRepo.save(d));
			d = new Department("NONE");
			System.out.println(dRepo.save(d));
			d = new Department("MANAGEMENT");
			System.out.println(dRepo.save(d));
		}
		
		//Employee Data
		if(eRepo.findAllByOrderById().isEmpty()) {
			Employee e = new Employee(TaskGlobal.makeCode(), "Peter", "Collin", "MANAGER", dRepo.findByName("MANAGEMENT"));
			System.out.println(eRepo.save(e));
			e = new Employee(TaskGlobal.makeCode(), "Henry Patrick", "Karugendo", "REGULAR", dRepo.findByName("RECEPTION"));
			System.out.println(eRepo.save(e));
		}
		
		//Task Data
		if(tRepo.findAll().isEmpty()) {
			Task t = new Task("Sweep Hotel Perimeter", "DAILY", "NIGHT", dRepo.findByName("RECEPTION"));
			System.out.println(tRepo.save(t));
			t = new Task("Clear Floors 1st Morning", "DAILY", "DAY", dRepo.findByName("RECEPTION"));
			System.out.println(tRepo.save(t));
			t = new Task("Clean Coffee Machine", "DAILY", "DAY", dRepo.findByName("RESTAURANT"));
			System.out.println(tRepo.save(t));
			t = new Task("Clean Vents", "MONTHLY", "ALL", dRepo.findByName("RECEPTION"));
			System.out.println(tRepo.save(t));
		}
	}

}
