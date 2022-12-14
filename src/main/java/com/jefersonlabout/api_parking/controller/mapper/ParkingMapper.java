package com.jefersonlabout.api_parking.controller.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.jefersonlabout.api_parking.controller.dto.ParkingDTO;
import com.jefersonlabout.api_parking.model.Parking;

@Component
public class ParkingMapper {

	private static final ModelMapper MODEL_MAPPER = new ModelMapper();
	
	public ParkingDTO toParkingDTO(Parking parking) {
		
		return MODEL_MAPPER.map(parking, ParkingDTO.class);
	}
	
	
	
	public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList){
		return parkingList.stream().map(this::toParkingDTO).collect(Collectors.toList());
		
		
	}

}
