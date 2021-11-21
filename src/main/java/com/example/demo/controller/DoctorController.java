package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Doctor;
import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("/Doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

	
	@GetMapping("/Doctors")
	public List<Doctor> getDoctors(){
		List<Doctor> doctors = doctorService.findDoctors();
		return doctors;
	}
	@GetMapping("/Doctor/{id}")
	public Optional<Doctor> getDoctorById(@PathVariable Long id){
		return doctorService.findDoctorById(id);
		
	}
	
	@PostMapping("/add")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctorService.addDoctor(doctor);
		
	}
	
	@PostMapping("/update")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		return doctorService.updateDoctor(doctor);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletDoctorById(@PathVariable Long id){
		doctorService.deleteDoctorById(id);
		
	}
}
