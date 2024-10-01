package org.jsp.fourteen_boot.controller;

import java.util.List;
import java.util.Optional;

import org.jsp.fourteen_boot.entity.Vehicle;
import org.jsp.fourteen_boot.repository.VehicleRepository;
import org.jsp.fourteen_boot.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class VehicleDAO {
	@Autowired
	private VehicleRepository vrepos;
	
	public List<Vehicle> findAllVehiclesDAO(){
		return vrepos.findAll();
	}
	public Optional<Vehicle> findSpecificVehicleDAO(int id){
		return vrepos.findById(id);
	}
	public Vehicle saveVehicleDAO(Vehicle vh){
		
		return vrepos.save(vh);
	}
	public void saveVehiclesDAO(List<Vehicle> vhl) {
		vrepos.saveAll(vhl);
	}
	public void deleteByIdDAO(int id) {
		vrepos.deleteById(id);
	}
	public void deleteALLDAO() {
		vrepos.deleteAll();
	}
	

}
