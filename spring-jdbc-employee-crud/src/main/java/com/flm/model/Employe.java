package com.flm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

// @data create all Setters(), Getters(), ToString().

public class Employe {
	private Long id;
	private String name;
	private Double salary;
	private Long banch;
	
	//We have only  all and null constructers
	
	public Employe(String name, Double salary, Long banch) {
		super();
		this.name = name;
		this.salary = salary;
		this.banch = banch;
	}
	
}
