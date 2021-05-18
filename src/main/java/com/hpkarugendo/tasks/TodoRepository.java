package com.hpkarugendo.tasks;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer>{
	List<Todo> findAll();
	List<Todo> findByEmployee(Employee employee);
	List<Todo> findByDone(boolean done);
}
