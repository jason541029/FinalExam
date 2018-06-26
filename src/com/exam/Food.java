package com.exam;

public class Food {
	String id ;
	String name ;
	int number;
	int kcal;

	
		
	

	
	public Food(String id, String name, int number, int kcal) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.kcal = kcal;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	}



