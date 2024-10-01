package org.jsp.thirteen_boot.repository;

import java.util.List;
import java.util.Optional;

import org.jsp.thirteen_boot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Integer> {
//	@Query("select p from Person p where p.email = ?1 and p.password=?2")
//	@Query("select p from Person p where p.email = :email and p.password=:password")
//	Optional<Person> findByEmailAndPassword(String email,String password);
	Optional<Person> findByEmailAndPassword(String email,String password);

	@Query("select p from Person p where p.name=:name")
	List<Person> findByPersonName(String name);
}
