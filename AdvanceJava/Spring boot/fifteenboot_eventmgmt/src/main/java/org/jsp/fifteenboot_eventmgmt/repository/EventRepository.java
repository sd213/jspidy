package org.jsp.fifteenboot_eventmgmt.repository;

import java.util.List;
import java.util.Optional;

import org.jsp.fifteenboot_eventmgmt.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EventRepository extends JpaRepository<Event, Integer> {
	@Query("select e from Event e where e.title=:title")
	Optional<Event> findEventByTitle(String title);

//	List<Event> findEventsByEventStatus();
	
	@Query("select e from Event e where e.status=EventStatus.UPCOMING")
	List<Event> findUpcomingEvents();
//	@Query("select e from Event e where e.status='EventStatus.ONGOING'")
//	List<Event> findOngoingEvents();
	
	@Query("select e from Event e where e.status=EventStatus.ONGOING")
	List<Event> findOngoingEvents();

	@Query("select e from Event e where e.status=EventStatus.COMPLETE")
	List<Event> findCompletedEvents();
}
