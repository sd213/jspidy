package com.jsp.twentyboot_eventapp.serviceimpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.twentyboot_eventapp.dao.EventDao;
import com.jsp.twentyboot_eventapp.entity.Event;
import com.jsp.twentyboot_eventapp.exceptionclasses.AlreadyCompletedEventException;
import com.jsp.twentyboot_eventapp.exceptionclasses.AlreadyDeletedEventException;
import com.jsp.twentyboot_eventapp.exceptionclasses.AlreadyOngoingEventException;
import com.jsp.twentyboot_eventapp.exceptionclasses.AlreadyUpcomingEventException;
import com.jsp.twentyboot_eventapp.exceptionclasses.InvalidIdEventIdException;
import com.jsp.twentyboot_eventapp.exceptionclasses.NoEventFoundException;
import com.jsp.twentyboot_eventapp.responsestructure.ResponseStructure;
import com.jsp.twentyboot_eventapp.service.EventService;
import com.jsp.twentyboot_eventapp.util.EventStatus;
@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventDao eventDao;
	
	@Override
	public ResponseEntity<?> saveEvent(Event event) {
		event.setStatus(EventStatus.UP_COMING);
		Event dbEvent = eventDao.saveEvent(event);
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).mesg("Event Saved Successfully....").body(dbEvent).build());
	}

	@Override
	public ResponseEntity<?> updateEvent(int id,Event newEvent) {
		Optional<Event> optionalE = eventDao.findEventById(id);
		if(optionalE.isEmpty()) {
//			throw NoEventFoundException.builder().message("No Events Found By This Id...").build();
			eventDao.saveEvent(newEvent);
		}
		Event oldEvent = optionalE.get();
		System.out.println(newEvent.getId());
		if(newEvent.getTitle()!=null) {
			oldEvent.setTitle(newEvent.getTitle());
		}
		if(newEvent.getDescription()!=null) {
			oldEvent.setDescription(newEvent.getDescription());
		}
		if(newEvent.getOrganizer()!=null) {
			oldEvent.setOrganizer(newEvent.getOrganizer());
		}
		if(newEvent.getProfile()!=null) {
			oldEvent.setProfile(newEvent.getProfile());
		}
		if(newEvent.getChiefGuest()!=null) {
			oldEvent.setChiefGuest(newEvent.getChiefGuest());
		}
		if(newEvent.getStatus()!=null && (newEvent.getStatus()==EventStatus.UP_COMING||
				newEvent.getStatus()==EventStatus.ON_GOING||
				newEvent.getStatus()==EventStatus.COMPLETED||
				newEvent.getStatus()==EventStatus.DELETED)&&
				newEvent.getStatus()!= oldEvent.getStatus()) {
			oldEvent.setTitle(newEvent.getTitle());
		}
		if(!newEvent.getTitle().isEmpty()) {
			oldEvent.setTitle(newEvent.getTitle());
		}
		if(newEvent.getFromDateTime()!=null) {
			oldEvent.setFromDateTime(newEvent.getFromDateTime());
		}
		if(newEvent.getToDateTime()!=null) {
			oldEvent.setToDateTime(newEvent.getToDateTime());
		}
		Event dbEvent = eventDao.updateEvent(oldEvent);
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).mesg("Event Updated Successfully....").body(dbEvent).build());
		
	}

	@Override
	public ResponseEntity<?> findEventById(int id) {
		Optional<Event> optionalE = eventDao.findEventById(id);
		if(optionalE.isEmpty()) {
			throw NoEventFoundException.builder().message("No Events Found By This Id...").build();
		}
		Event dbEvent = optionalE.get();
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value()).mesg("Event Associated with Id Found Successfully").body(dbEvent).build());
	}

	@Override
	public ResponseEntity<?> findAllEvents() {
		
		List<Event> listEvents = eventDao.findAllEvents();
		if(listEvents.isEmpty()) {
			throw NoEventFoundException.builder().message("No Events Present in the Database").build();
			
		}
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value()).mesg("List Of Events Found Successfully").body(listEvents).build());

	}

	@Override
	public ResponseEntity<?> findAllUpcomingEvents() {
		List<Event> listUpcomingEvents = eventDao.findAllUpcomingEvents();
		if(listUpcomingEvents.isEmpty()) {
			throw NoEventFoundException.builder().message("No Upcoming Events Found").build();
			
		}
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value()).mesg("List Of UP_COMING Events Found in the Database Table... ").body(listUpcomingEvents).build());

	}

	@Override
	public ResponseEntity<?> findAllOngoingEvents() {
		List<Event> listOngoingEvents = eventDao.findAllOngoingEvents();
		if(listOngoingEvents.isEmpty()) {
			throw NoEventFoundException.builder().message("No Ongoing Events Found").build();
			
		}
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value()).mesg("List Of Ongoing Events Found ").body(listOngoingEvents).build());


	}

	@Override
	public ResponseEntity<?> findAllCompletedEvents() {
		List<Event> listCompletedEvents = eventDao.findAllCompletedEvents();
		if(listCompletedEvents.isEmpty()) {
			throw NoEventFoundException.builder().message("No Completed Events Found").build();
			
		}
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value()).mesg("List Of Completed Events Found ").body(listCompletedEvents).build());


	}

	@Override
	public ResponseEntity<?> findAllDeletedEvents() {
		List<Event> listDeletedEvents = eventDao.findAllDeletedEvents();
		if(listDeletedEvents.isEmpty()) {
			throw NoEventFoundException.builder().message("No Deleted Events Found").build();
			
		}
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value()).mesg("List Of Deleted Events Found ").body(listDeletedEvents).build());


	}

	@Override
	public ResponseEntity<?> setEventStatusToOngoing(int id) {
		Optional<Event> optionalEvent = eventDao.findEventById(id);
		if(optionalEvent.isEmpty())
			throw InvalidIdEventIdException.builder().
			message("Invalid Eventid Provided").
			build();
		Event e = optionalEvent.get();
		if(e.getStatus()== EventStatus.ON_GOING) {
			throw AlreadyOngoingEventException.builder()
			.message("Already Event is Ongoing").build();
		}
		e.setStatus(EventStatus.ON_GOING);
		e=eventDao.updateEvent(e);
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value())
						.mesg("Event Status Updated ON_GOING")
						.body(e)
						.build());
	}

	@Override
	public ResponseEntity<?> setEventStatusToUpcoming(int id) {
		Optional<Event> optionalEvent = eventDao.findEventById(id);
		if(optionalEvent.isEmpty())
			throw InvalidIdEventIdException.builder().
			message("Invalid Eventid Provided").
			build();
		Event e = optionalEvent.get();
		if(e.getStatus()== EventStatus.UP_COMING) {
			throw AlreadyUpcomingEventException.builder()
			.message("Already Event is UP_COMING").build();
		}
		e.setStatus(EventStatus.UP_COMING);
		e=eventDao.updateEvent(e);
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value())
						.mesg("Event Status Updated UP_COMING")
						.body(e)
						.build());
	}

	@Override
	public ResponseEntity<?> setEventStatusToCompleted(int id) {
		Optional<Event> optionalEvent = eventDao.findEventById(id);
		if(optionalEvent.isEmpty())
			throw InvalidIdEventIdException.builder().
			message("Invalid Eventid Provided").
			build();
		Event e = optionalEvent.get();
		if(e.getStatus()== EventStatus.COMPLETED) {
			throw AlreadyCompletedEventException.builder()
			.message("Already Event is Completed").build();
		}
		e.setStatus(EventStatus.COMPLETED);
		e=eventDao.updateEvent(e);
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value())
						.mesg("Event Status Updated to COMPLETED")
						.body(e)
						.build());
	}

	@Override
	public ResponseEntity<?> setEventStatusToDeleted(int id) {
		Optional<Event> optionalEvent = eventDao.findEventById(id);
		if(optionalEvent.isEmpty())
			throw InvalidIdEventIdException.builder().
			message("Invalid Eventid Provided").
			build();
		Event e = optionalEvent.get();
		if(e.getStatus()== EventStatus.DELETED) {
			throw AlreadyDeletedEventException.builder()
			.message("Already Event is Deleted").build();
		}
		e.setStatus(EventStatus.DELETED);
		e=eventDao.updateEvent(e);
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value())
						.mesg("Event Status Updated.DELETED")
						.body(e)
						.build());
	}

	@Override
	public ResponseEntity<?> findEventsBetweenDates(LocalDateTime fromDateTime, LocalDateTime toDateTime) {
		// TODO Auto-generated method stub
		List<Event> events = eventDao.findAllEvents();
//		List<Events> foundEvents = eventDao.find
		if(events.isEmpty()) {
			throw NoEventFoundException.builder().message("No Event Found In the Database Table ...").build();
			
		}
		Iterator<Event> eventIterator = events.iterator();
		List<Event> eventsinRange = new ArrayList();
		Event temp;
		while(eventIterator.hasNext()) {
			temp = eventIterator.next();
			if(temp.getFromDateTime()!=null && temp.getToDateTime()!=null&&temp.getFromDateTime().isAfter(fromDateTime) && temp.getToDateTime().isBefore(toDateTime)) {
				eventsinRange.add(temp);
			}
		}
		return ResponseEntity.status(HttpStatus.OK)
		.body(ResponseStructure.builder()
				.status(HttpStatus.OK.value())
				.mesg("Event Found In Given Date Range")
				.body(eventsinRange)
				.build());
	}
	
	
	
	
	
}
