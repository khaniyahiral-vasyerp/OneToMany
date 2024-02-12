package com.example.OneToMany.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OneToMany.onetomany.model.State;

public interface StateRepository extends JpaRepository<State, Integer> {

}
