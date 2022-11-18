package com.jefersonlabout.api_parking.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jefersonlabout.api_parking.controller.dto.ParkingDTO;
import com.jefersonlabout.api_parking.controller.mapper.ParkingMapper;
import com.jefersonlabout.api_parking.model.Parking;
import com.jefersonlabout.api_parking.service.ParkingService;

@RestController
public class ParkingController {
	

	private final ParkingService parkingService;
	private final ParkingMapper parkingMapper;
	
	public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
		this.parkingService = parkingService;
		this.parkingMapper = parkingMapper;
	}
	
	@GetMapping
	public ResponseEntity<List<ParkingDTO>> findAll(){
		 
		List<Parking> parkingList = parkingService.findAll();
		List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
		return ResponseEntity.ok(result);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<ParkingDTO> findById( @PathVariable String id){		 
		Parking parking =  parkingService.findById(id);
		ParkingDTO result = parkingMapper.toParkingDTO(parking);
		return ResponseEntity.ok(result);
		
	}

}
