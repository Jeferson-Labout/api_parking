package com.jefersonlabout.api_parking.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jefersonlabout.api_parking.model.Parking;

@Service
public class ParkingService {
	
	private static Map<String, Parking> parkingMap = new HashMap<String, Parking>();
	
	static {
		
		var id = getUUID();
		var id1 = getUUID();
		Parking parking = new Parking(id , "WVM-3122", "SC","CELTA","PRETO");
		Parking parking1 = new Parking(id1 , "WVM-4526", "SP","GOL","CINZA");
		parkingMap.put(id, parking);
		parkingMap.put(id1, parking1);
	}

	
	public List<Parking>findAll(){
		
		return parkingMap.values().stream().collect(Collectors.toList());
	}
		
	private static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
		
	}

	public Parking findById(String id) {
		// TODO Auto-generated method stub
		return parkingMap.get(id);
	}
}
