package com.example.OneToMany.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OneToMany.onetomany.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
