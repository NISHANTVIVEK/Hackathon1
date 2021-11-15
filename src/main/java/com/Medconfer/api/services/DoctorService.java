package com.Medconfer.api.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Medconfer.dtos.DoctorDto;

@Service
public class DoctorService {
	public List<DoctorDto> getDoctors(Long id){
		DoctorDto dummyDoctor = new DoctorDto();
		dummyDoctor.setDoctorID(200001L);
		return Arrays.asList(new DoctorDto[]{dummyDoctor});
	}
}
