package org.jsp.fourteen_boot.repository;

import org.jsp.fourteen_boot.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
