package com.jsp.twentyboot_eventapp.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.jsp.twentyboot_eventapp.entity.Event;

public interface EventService {

	ResponseEntity<?> saveEvent(Event event);
	ResponseEntity<?> updateEvent(int id,Event event);
	ResponseEntity<?> findEventById(int id);
	ResponseEntity<?> findAllEvents();
	ResponseEntity<?> findAllUpcomingEvents();
	ResponseEntity<?> findAllOngoingEvents();
	ResponseEntity<?> findAllCompletedEvents();
	ResponseEntity<?> findAllDeletedEvents();
	ResponseEntity<?> setEventStatusToOngoing(int id);
	ResponseEntity<?> setEventStatusToUpcoming(int id);
	ResponseEntity<?> setEventStatusToCompleted(int id);
	ResponseEntity<?> setEventStatusToDeleted(int id);
	ResponseEntity<?> findEventsBetweenDates(LocalDateTime fromDateTime, LocalDateTime toDateTime);
}
