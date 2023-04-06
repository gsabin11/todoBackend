package com.sabin.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="passenger")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@NotBlank(message = "Name is mandatory")
	@Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
	
	String name;
	
	@NotBlank(message = "Number is mandatory")
	@Size(min = 10, max = 13, message = "Number must be between 10 and 13 characters")
	
	String number;
	
	@NotBlank(message = "Address is mandatory")
	@Size(min = 3, max = 200, message = "Address must be between 3 and 200 characters")
	
	String address;
}
