package com.Medconfer.api.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Medconfer.dtos.DoctorDto;
import com.Medconfer.dtos.HospitalDto;

@Service
public class HospitalService {
	public List<HospitalDto> searchHospitals(){
		HospitalDto dummyHospital = new HospitalDto();
		DoctorDto dummyDoctor = new DoctorDto();
		dummyDoctor.setDoctorID(200001L);
		dummyHospital.setHospitalID(100001L);
		dummyHospital.setDoctorDtos(Arrays.asList(new DoctorDto[]{dummyDoctor}));
		return Arrays.asList(new HospitalDto[]{dummyHospital});
	}
}
