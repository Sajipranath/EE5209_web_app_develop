package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctor;
import com.example.demo.repository.DoctorRepo;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepo doctorRepo;  
	
	public DoctorService(DoctorRepo doctorRepo) {
		this.doctorRepo = doctorRepo;
	}

    public Doctor addDoctor(Doctor doctor) {
    	return doctorRepo.save(doctor);
    }
	
	public List<Doctor> findDoctors(){
		return doctorRepo.findAll();
	}

	public Doctor updateDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}
	
	public Optional<Doctor> findDoctorById(long id) {
		return doctorRepo.findById(id);
	}
	
	public void deleteDoctorById(long id) {
		doctorRepo.deleteById(id);
	}
}
