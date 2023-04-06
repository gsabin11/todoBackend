package com.sabin.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabin.todo.entity.Passenger;
import com.sabin.todo.service.PassengerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/passenger")
@CrossOrigin
public class PassengerController {

	@Autowired
	private PassengerService passengerService;
	
	@PostMapping("/add")
	public String add(@Valid @RequestBody Passenger passenger) {
		passengerService.save(passenger);
		return "New Passenger is added Successfully!!";
	}
	
	@GetMapping("/getAll")
	public List<Passenger> getAll() {
		return passengerService.getAllPassengers();
	}
}
