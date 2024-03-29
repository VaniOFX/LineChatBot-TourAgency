package com.example.bot.spring;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Customer {
	
	private String name;
	private String id;
	private int phone;
	private int age;
	
	public Customer(String name, String id, int phone, int age) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.age = age;
	}
	
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<String> nullValues(){
		ArrayList<String> nullValues = new ArrayList<>();
		if(name == null){
			nullValues.add("name: <your name>");
		}
		if(age == 0){
			nullValues.add("age: <your age> years old");
		}
		return nullValues;
	}
}
