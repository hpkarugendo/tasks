package com.hpkarugendo.tasks;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {
	List<Task> findAll();
	List<Task> findByDepartment(Department department);
	List<Task> findByFrequency(String frequency);
	List<Task> findByDepartmentAndFrequency(Department department, String frequency);
}
