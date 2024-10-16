package com.jsp.twentyboot_eventapp.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.twentyboot_eventapp.entity.Event;
import com.jsp.twentyboot_eventapp.service.EventService;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(value="/events")
//@CrossOrigin(origins = "http://localhost:3000")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@Operation(summary="To Save Event ",description="This Api Will Accept an Event JSON Object and saves it to Database Table and Returns the Saved Event Entity Object in a Response Format")
	@ApiResponses(value= {@ApiResponse(responseCode="200",description="Event Saved Successfully")})
	@Hidden
	@PostMapping
	public ResponseEntity<?> saveEvent(@RequestBody Event event){
		return eventService.saveEvent(event);
	}
	
	@Hidden
	@PutMapping
	public ResponseEntity<?> updateEvent(@RequestParam int id,@RequestBody Event event){
		return eventService.updateEvent(id,event);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> findEventById(@RequestParam int id){
		return eventService.findEventById(id);
	}
	@Operation(summary = "To Fetch All Events", description="This API will fetch all the Events available in the Database Table...")
	@ApiResponses(value = {@ApiResponse(responseCode="200",description="List Of Events Found Successfully"),@ApiResponse(responseCode = "404",description = "No Events Present in the Database")})
	@GetMapping
	public ResponseEntity<?> findAllEvents(){
		return eventService.findAllEvents();
	}
	@Operation(summary = "To Fetch All UP_COMING Events", description="This API will fetch all the Up_coming Events available in the Database Table...")
	@ApiResponses(value = {@ApiResponse(responseCode="200",description="List Of Upcoming Events Found Successfully"),@ApiResponse(responseCode = "404",description = "No Upcoming Events Present in the Database")})
	
	@GetMapping("upcoming")
	public ResponseEntity<?> findAllUpcomingEvents(){
		return eventService.findAllUpcomingEvents();
	}
	@GetMapping("ongoing")
	public ResponseEntity<?> findAllOngoingEvents(){
		return eventService.findAllOngoingEvents();
	}
	@GetMapping("completed")
	public ResponseEntity<?> findAllCompletedEvents(){
		return eventService.findAllCompletedEvents();
	}
	@GetMapping("deleted")
	public ResponseEntity<?> findAllDeletedEvents(){
		return eventService.findAllDeletedEvents();
	}
	@Operation(summary="To Set Event Status to ON_GOING", description="This API Will Accept the Event Id as Path Variable and Set the EventStatus to ON_GOING")
	@ApiResponses(value= {@ApiResponse(responseCode="200",description="Event Status Updated ON_GOING"),@ApiResponse(responseCode="404",description="Invalid Event Id Provided"),@ApiResponse(responseCode = "400",description = "Already Event is ON_GOING")})
	@PatchMapping(value="/ongoing/{id}")
	public ResponseEntity<?> setEventStatusToOngoing(@PathVariable int id){
		return eventService.setEventStatusToOngoing(id);
	}
	@Operation(summary="To Set Event Status to UP_COMING", description="This API Will Accept the Event Id as Path Variable and Set the EventStatus to UP_COMING")
	@ApiResponses(value= {@ApiResponse(responseCode="200",description="Event Status Updated UP_COMING"),@ApiResponse(responseCode="404",description="Invalid Event Id Provided"),@ApiResponse(responseCode = "400",description = "Already Event is UP_COMING")})
	@PatchMapping(value="/upcoming/{id}")
	public ResponseEntity<?> setEventStatusToUpcoming(@PathVariable int id){
		return eventService.setEventStatusToUpcoming(id);
	}

	@Operation(summary="To Set Event Status to COMPLETED", description="This API Will Accept the Event Id as Path Variable and Set the EventStatus to COMPLETED")
	@ApiResponses(value= {@ApiResponse(responseCode="200",description="Event Status Updated COMPLETED"),@ApiResponse(responseCode="404",description="Invalid Event Id Provided"),@ApiResponse(responseCode = "400",description = "Already Event is COMPLETED")})
	@PatchMapping(value="/completed/{id}")
	public ResponseEntity<?> setEventStatusToCompleted(@PathVariable int id){
		return eventService.setEventStatusToCompleted(id);
	}
	
	@Operation(summary="To Set Event Status to DELETED", description="This API Will Accept the Event Id as Path Variable and Set the EventStatus to DELETED")
	@ApiResponses(value= {@ApiResponse(responseCode="200",description="Event Status Updated DELETED"),@ApiResponse(responseCode="404",description="Invalid Event Id Provided"),@ApiResponse(responseCode = "400",description = "Already Event is DELETED")})
	@Hidden
	@PatchMapping(value="/deleted/{id}")
	public ResponseEntity<?> setEventStatusToDeleted(@PathVariable int id){
		return eventService.setEventStatusToDeleted(id);
	}
	
	@GetMapping(value="/in-date")
	public ResponseEntity<?> findEventsBetweenDates(
			@RequestParam LocalDateTime fromDateTime,
			@RequestParam LocalDateTime toDateTime){
		return eventService.findEventsBetweenDates(fromDateTime,toDateTime);
	}
	
}
