package com.sheryians.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheryians.major.model.Roles;

public interface RoleRepository extends JpaRepository<Roles,Integer> {

}
