package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
//@Table(name="Doctor")
public class Doctor implements Serializable{
	

@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable=false,updatable = false)
  private long id;
  private String name;
  private String specialization;
  private String availableDay;
  private String availableTime;
  private String remainingBookingCount;
  public Doctor() {}
  
   public Doctor(long id, String name, String specialization, String availableDay, String availableTime,
			String remainingBookingCount) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.availableDay = availableDay;
		this.availableTime = availableTime;
		this.remainingBookingCount = remainingBookingCount;
	}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSpecialization() {
	return specialization;
}

public void setSpecialization(String specialization) {
	this.specialization = specialization;
}

public String getAvailableDay() {
	return availableDay;
}

public void setAvailableDay(String availableDay) {
	this.availableDay = availableDay;
}

public String getAvailableTime() {
	return availableTime;
}

public void setAvailableTime(String availableTime) {
	this.availableTime = availableTime;
}

public String getRemainingBookingCount() {
	return remainingBookingCount;
}

public void setRemainingBookingCount(String remainingBookingCount) {
	this.remainingBookingCount = remainingBookingCount;
}
	
}
