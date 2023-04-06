package com.sabin.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabin.todo.entity.Passenger;
import com.sabin.todo.repository.PassengerRepo;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	private PassengerRepo passengerRepo;

	@Override
	public Passenger save(Passenger passenger) {
		
		return passengerRepo.save(passenger);
	}
	@Override
	public List<Passenger> getAllPassengers() {
	    return passengerRepo.findAll();
	}
	
	

}
