package com.jsp.twentyboot_eventapp.dao;

import java.util.List;
import java.util.Optional;

import com.jsp.twentyboot_eventapp.entity.Event;

public interface EventDao {
	Event saveEvent(Event event);
	
	Event updateEvent(Event event);
	
	Optional<Event> findEventById(int id);
	
	List<Event> findAllEvents();
	
	List<Event> findAllUpcomingEvents();
	
	List<Event> findAllOngoingEvents();
	
	List<Event> findAllCompletedEvents();
	
	List<Event> findAllDeletedEvents();
	
//	Event setEventStatusToOngoing(int id);
}
