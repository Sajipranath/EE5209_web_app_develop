package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
//@Table(name="User")
public class User {
	 
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(nullable=false,updatable = false)
		private Long id;
		private String firstName;
		private String lastName;
		private String birthYear;
		private String address;
		private String nearestTown;
		private String province;
		private String email;
		private String phoneNo;
		private String userName;
		private String password;
		User(){}
		
		 public User(Long id, String firstName, String lastName, String birthYear, String address, String nearestTown,
				String province, String email, String phoneNo, String userName, String password) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.birthYear = birthYear;
			this.address = address;
			this.nearestTown = nearestTown;
			this.province = province;
			this.email = email;
			this.phoneNo = phoneNo;
			this.userName = userName;
			this.password = password;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
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

		public String getBirthYear() {
			return birthYear;
		}

		public void setBirthYear(String birthYear) {
			this.birthYear = birthYear;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getNearestTown() {
			return nearestTown;
		}

		public void setNearestTown(String nearestTown) {
			this.nearestTown = nearestTown;
		}

		public String getProvince() {
			return province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}	
		 
}
