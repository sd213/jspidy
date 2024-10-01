package org.jsp.fourteen_boot.controller;

import java.util.List;
import java.util.Map;

import org.jsp.fourteen_boot.entity.Vehicle;
import org.jsp.fourteen_boot.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class VehicleController {
	@Autowired
	private VehicleService vservices;
	
	@GetMapping("/vehicles")
	public  ResponseStructure<List<Vehicle>> findAllVehiclesController() {
		return vservices.findAllVehiclesService();
	}
	@GetMapping("/vehicles/{id}")
	public ResponseStructure<Vehicle> findVehicleByIdController(@PathVariable int id) {
		return vservices.findSpecificVehicleService(id);
	}
	@PostMapping("/vehicle")
	public ResponseStructure<Vehicle> saveVehicleController(  @RequestParam("regno") String regno,@RequestParam("type") String type, @RequestParam("color") String color) { //x-www-form-encoded
		Vehicle newVehicle = new Vehicle();
	
		newVehicle.setRegno(regno);
		newVehicle.setColor(color);
		newVehicle.setType(type);
		return vservices.saveVehicleService(newVehicle);
	}
	@PostMapping("/vehicles")
	public ResponseStructure<List<Vehicle>> saveVehiclesController(@RequestBody List<Vehicle> vehiclelist) {
		System.out.println(vehiclelist);
		return vservices.saveVehiclesService(vehiclelist);
		
	}
	@DeleteMapping("/vehicle")
	public ResponseStructure<String> deleteByIdController(@RequestParam int id){
		return vservices.deleteByIdController(id);
	}
	
	@DeleteMapping("/vehicles")
	public ResponseStructure<String> deleteALLController(){
		return vservices.deleteAllService();
	}
	
	@PutMapping("/vehicle")
	public ResponseStructure<String> updateVehicleByIdController(@RequestParam int id, @RequestBody Vehicle UpdatedVehicle){
		return vservices.updateVehicleByIdService(id, UpdatedVehicle);
	}
	
	@PatchMapping("/vehicle")
	public ResponseStructure<String> patchVehicleByIdController(@RequestParam int id,@RequestBody Vehicle patchedVehicle){
		return vservices.patchVehicleByIdService(id, patchedVehicle);
	}
	
}
