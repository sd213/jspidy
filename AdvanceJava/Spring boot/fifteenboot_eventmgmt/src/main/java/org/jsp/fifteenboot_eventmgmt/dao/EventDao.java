package org.jsp.fifteenboot_eventmgmt.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.fifteenboot_eventmgmt.entity.Event;
import org.jsp.fifteenboot_eventmgmt.repository.EventRepository;
import org.jsp.fifteenboot_eventmgmt.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class EventDao {
	@Autowired
	private EventRepository repos;
	
	public Event saveEvent(@RequestBody Event e){
		return repos.save(e);
	}
	
	public Optional<Event> findEventById(int id){
		return repos.findById(id);
	}

	public Optional<Event> findEventByTitle(String title) {
		// TODO Auto-generated method stub
		return repos.findEventByTitle(title);
	}

	public List<Event> findAllEvent() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	public List<Event> findUpcomingEvents() {
		// TODO Auto-generated method stub
		return repos.findUpcomingEvents();
	}
	public List<Event> findOngoingEvents(){
//		return repos.findEventsByEventStatus();
		return repos.findOngoingEvents();
	}
	
	public List<Event> findCompletedEvents(){
		return repos.findCompletedEvents();
	}
	public void deleteEvent(int id) {
		repos.deleteById(id);
	}

	
		
}
