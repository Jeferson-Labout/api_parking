package com.jefersonlabout.api_parking.controller.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.jefersonlabout.api_parking.controller.dto.ParkingDTO;
import com.jefersonlabout.api_parking.model.Parking;

@Component
public class ParkingMapper {

	private static final ModelMapper MODEL_MAPPER = new ModelMapper();
	
	
	
	
	public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList){
		return null;
		
		
	}

}
