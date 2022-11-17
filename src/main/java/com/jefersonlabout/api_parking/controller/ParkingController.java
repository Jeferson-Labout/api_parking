package com.jefersonlabout.api_parking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jefersonlabout.api_parking.controller.dto.ParkingDTO;
import com.jefersonlabout.api_parking.controller.mapper.ParkingMapper;
import com.jefersonlabout.api_parking.model.Parking;
import com.jefersonlabout.api_parking.service.ParkingService;

@RestController
public class ParkingController {
	

	private final ParkingService parkingService;
	private final ParkingMapper parkingMapper;
	
	public ParkingController(ParkingService parkingService) {
		this.parkingService = parkingService;
	}
	
	@GetMapping
	public List<ParkingDTO>findAll(){
		 
		List<Parking> parkingList = parkingService.findAll();
		List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
	}

}
