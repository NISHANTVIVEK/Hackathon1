package com.Medconfer.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Medconfer.api.services.HospitalService;
import com.Medconfer.constants.RestURIs;
import com.Medconfer.dtos.HospitalDto;
import com.Medconfer.dtos.HospitalSearchDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Hospitals", tags = {"Access all Hospital APIs here"})
public class HostpitalController {

	@Autowired
	HospitalService hospitalService;
	
	
	@GetMapping(RestURIs.SEARCH_HOSPITALS)
	@ApiOperation(value = "Find all Hospitals for given search criteria",
    response = HospitalDto.class,
    responseContainer = "List")
	public List<HospitalDto> searchHospitals(HospitalSearchDto searchDto) {
		return hospitalService.searchHospitals(searchDto);
	}
}
