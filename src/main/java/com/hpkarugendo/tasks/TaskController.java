package com.hpkarugendo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
	@Autowired
	private DepartmentRepository dRepo;
	@Autowired
	private EmployeeRepository eRepo;
	@Autowired
	private TaskRepository tRepo;
	
	@GetMapping("projects/tasks/dashboard")
	public String dashboard(Model m) {
		m.addAttribute("departments", dRepo.findAllByOrderById());
		m.addAttribute("employees", eRepo.findAllByOrderById());
		m.addAttribute("tasks", tRepo.findAll());
		return "projects/tasks/dashboard";
	}
}
