package com.Medconfer.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Medconfer.api.services.DoctorService;
import com.Medconfer.dtos.DoctorDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Doctors", tags = {"Access all Doctor APIs here"})
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	@GetMapping("/doctors")
	@ApiOperation(value = "Find all Hospitals for given search criteria",
		    response = DoctorDto.class)
	public List<DoctorDto> getDoctors(Long id) {
		return doctorService.getDoctors(id);
	}
}
