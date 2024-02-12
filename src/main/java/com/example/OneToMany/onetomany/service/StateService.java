package com.example.OneToMany.onetomany.service;

import java.util.List;

import com.example.OneToMany.onetomany.model.City;
import com.example.OneToMany.onetomany.model.State;

public interface StateService {
    List<State> getAllStates();

    State getStateById(Integer id);

    State saveState(State state);

    State updateState(State state);

    void deleteState(Integer id);

    void addCitiesToState(Integer stateId, List<City> cities);

}
