package com.nubi.fws.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class FrontSlider {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int frontSliderId;
	private String title;
	private String description;
	private String imageName;
	private LocalDate date;
}
