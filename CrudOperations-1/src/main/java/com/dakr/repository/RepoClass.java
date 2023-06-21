package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.entity.EntityClass;

@Repository
public interface RepoClass extends JpaRepository<EntityClass, Integer>{

}
