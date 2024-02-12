package com.example.OneToMany.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OneToMany.onetomany.model.City;
import com.example.OneToMany.onetomany.model.State;
import com.example.OneToMany.onetomany.service.StateService;

@RestController
@RequestMapping("/states")
public class StateController {
    @Autowired
    private StateService stateservice;

    @GetMapping("/getAllState")
    public List<State> getAllStates() {
        return stateservice.getAllStates();
    }

    @GetMapping("/statebyid/{id}")
    public State getStateById(@PathVariable Integer id) {
        return stateservice.getStateById(id);
    }

    @PostMapping
    public State saveState(@RequestBody State state) {
        return stateservice.saveState(state);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteState(@PathVariable Integer id) {
        stateservice.deleteState(id);
    }

    @GetMapping("/{stateid}/cities")
    public String addCitytoState(@PathVariable Integer stateid, @RequestBody List<City> city) {
        stateservice.addCitiesToState(stateid, city);
        return "Sucess :City is  addes to the state list";
    }

}
