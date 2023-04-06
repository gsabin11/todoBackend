package com.sabin.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sabin.todo.entity.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

}
