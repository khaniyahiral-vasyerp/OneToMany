package com.example.OneToMany.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OneToMany.onetomany.model.City;

public interface CityRepository extends JpaRepository<City, Integer> {

}
