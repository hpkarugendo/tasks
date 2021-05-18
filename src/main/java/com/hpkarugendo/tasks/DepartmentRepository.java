package com.hpkarugendo.tasks;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
	List<Department> findAllByOrderById();
	Department findByName(String name);
	
}
