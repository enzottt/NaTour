package com.natour.natour.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.natour.natour.model.entity.ApplicationUser;

@Repository
public interface ApplicationUserRepository 
    extends CrudRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);
    boolean existsByUsername(String username);
}