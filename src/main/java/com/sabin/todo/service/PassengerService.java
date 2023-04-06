package com.sabin.todo.service;

import java.util.List;

import com.sabin.todo.entity.Passenger;

public interface PassengerService {
	public Passenger save(Passenger passenger);
	 List<Passenger> getAllPassengers();

}
