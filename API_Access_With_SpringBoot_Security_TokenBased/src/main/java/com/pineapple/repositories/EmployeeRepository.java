package com.pineapple.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.pineapple.entities.Employee;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
	
	Optional<Employee> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

}
