package com.jsp.twentyboot_eventapp.entity;

import java.time.LocalDateTime;

import com.jsp.twentyboot_eventapp.util.EventStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String organizer;
	private String chiefGuest;
	private String description;  
	private LocalDateTime fromDateTime;
	private LocalDateTime toDateTime;
//	private int capacity;         // Maximum number of participants

//    private int registeredAttendees;
	@Enumerated(EnumType.STRING)
	private EventStatus status;
	@OneToOne
	private Profile profile;
}
