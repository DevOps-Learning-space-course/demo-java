package com.example.model;

public class Person {
	//Test comment added
	//add comment 2
	//test adding email notification 3
	// age calculator (Date of Birth - current date)
	String id;
	String firstName;
	String lastName;
	int    age;
	int DateofBirth;
	int CurrentDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void AgeCalculator(int DateofBirth ,int CurrentDate, int age)
	{
		age=(DateofBirth-CurrentDate);
		
	}

}
