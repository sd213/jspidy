package com.jsp.twentyboot_eventapp.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.twentyboot_eventapp.entity.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

	@Query("select e from Event e where e.status='UP_COMING'")
	List<Event> findAllUpcomingEvents();


	@Query("select e from Event e where e.status='ON_GOING'")
	List<Event> findAllOngoingEvents();

	@Query("select e from Event e where e.status='COMPLETED'")
	List<Event> findAllCompletedEvents();

	@Query("select e from Event e where e.status='DELETED'")
	List<Event> findAllDeletedEvents();

//	@Query("select e from Event e where e.fromDateTime between ()")
//	List<Event> findEventsBetweenDates(LocalDateTime fromDateTime,LocalDateTime toDateTime);
}
