package com.pineapple.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.pineapple.entities.EnumRole;
import com.pineapple.entities.Role;


@RepositoryRestResource(collectionResourceRel = "role", path = "role")
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	
	Optional<Role> findByName(EnumRole name);
	
}
