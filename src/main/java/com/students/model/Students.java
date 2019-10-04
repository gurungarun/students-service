package com.students.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
 private int userId;



@Column(name="name")
 private String name;

@Column(name="address")
 private String address;

@Column(name="age")
 private int  age;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Students [userId=" + userId + ", name=" + name + ", address=" + address + ", age=" + age + "]";
}
 
 
 
}
