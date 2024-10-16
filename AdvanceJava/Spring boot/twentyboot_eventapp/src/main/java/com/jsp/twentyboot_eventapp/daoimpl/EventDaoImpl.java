package com.jsp.twentyboot_eventapp.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jsp.twentyboot_eventapp.dao.EventDao;
import com.jsp.twentyboot_eventapp.entity.Event;
import com.jsp.twentyboot_eventapp.repository.EventRepository;

//@Component
@Repository
public class EventDaoImpl implements EventDao {
	@Autowired// we can not make use Autowired without using Component annotation
	private EventRepository eventRepository;
	
	
	@Override
	public Event saveEvent(Event event) {
		
		return eventRepository.save(event);
	}

	@Override
	public Event updateEvent(Event event) {
		
		return eventRepository.save(event);
	}

	@Override
	public Optional<Event> findEventById(int id) {
		// TODO Auto-generated method stub
		return eventRepository.findById(id);
	}

	@Override
	public List<Event> findAllEvents() {
		// TODO Auto-generated method stub
		return eventRepository.findAll();
	}

	@Override
	public List<Event> findAllUpcomingEvents() {
		// TODO Auto-generated method stub
		return eventRepository.findAllUpcomingEvents();
	}

	@Override
	public List<Event> findAllOngoingEvents() {
		// TODO Auto-generated method stub
		return eventRepository.findAllOngoingEvents();
	}

	@Override
	public List<Event> findAllCompletedEvents() {
		// TODO Auto-generated method stub
		
		return eventRepository.findAllCompletedEvents();
	}

	@Override
	public List<Event> findAllDeletedEvents() {
		// TODO Auto-generated method stub
		return eventRepository.findAllDeletedEvents();
	}

}
