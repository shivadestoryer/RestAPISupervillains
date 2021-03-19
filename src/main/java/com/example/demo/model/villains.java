package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="villains")
public class villains {
	
	
@Id

	private int age;
	private String Name;
	private String powers;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPowers() {
		return powers;
	}
	public void setPowers(String powers) {
		this.powers = powers;
	}
	@Override
	public String toString() {
		return "villains [age=" + age + ", Name=" + Name + ", powers=" + powers + "]";
	}
	
	
	
}
