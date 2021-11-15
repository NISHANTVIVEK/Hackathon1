package com.Medconfer.api.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Medconfer.dtos.DoctorDto;
import com.Medconfer.dtos.HospitalDto;
import com.Medconfer.dtos.HospitalSearchDto;
import com.Medconfer.entities.Hospital;
import com.Medconfer.repositories.HospitalRepository;

@Service
public class HospitalService {
	
	@Autowired
	HospitalRepository hospitalRepository;
	
	public final int pageSize = 2;
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public List<HospitalDto> searchHospitals(HospitalSearchDto searchDto){
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Hospital> query = cb.createQuery(Hospital.class);
		Root<Hospital> root = query.from(Hospital.class);
		query.select(root); 
		Predicate predicate = cb.equal(root.get("price"), searchDto.getPrice());
	    query.where(predicate);
		TypedQuery<Hospital> hospitalQuery = entityManager.createQuery(query);
		List<Hospital> hospitalList = hospitalQuery.getResultList();
		List<HospitalDto> hospitalDtos = new ArrayList<HospitalDto>();
		for (Hospital hospital : hospitalList) {
			HospitalDto hospitalDto = new HospitalDto();
			hospitalDto.setHospitalID(hospital.getId());
			hospitalDto.setHospitalName(hospital.getName());
			
			DoctorDto dummyDoctor = new DoctorDto();
			dummyDoctor.setDoctorID(200001L);
			hospitalDto.setDoctorDtos(Arrays.asList(new DoctorDto[]{dummyDoctor}));
			hospitalDtos.add(hospitalDto);
		}
		return hospitalDtos;
	}
	
	
}
