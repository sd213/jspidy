package org.jsp.eightboot_pms.repository;

import org.jsp.eightboot_pms.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
