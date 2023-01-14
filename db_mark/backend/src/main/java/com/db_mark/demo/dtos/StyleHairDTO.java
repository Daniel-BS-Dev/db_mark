package com.db_mark.demo.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.db_mark.demo.entities.Haircut;
import com.db_mark.demo.entities.StyleHair;

public class StyleHairDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name_user;
	private Date dayoff;
	private Date start_work;
	private Date finished_work;
	private Date hour_meal;
	
	private List<HaircutDTO> haircuts = new ArrayList<>();

	public StyleHairDTO() {}
	
	public StyleHairDTO(String name_user, Date dayoff, Date start_work, Date finished_work, Date hour_meal) {
		this.name_user = name_user;
		this.dayoff = dayoff;
		this.start_work = start_work;
		this.finished_work = finished_work;
		this.hour_meal = hour_meal;
	}
	
	public StyleHairDTO(StyleHair entity) {
		this.name_user = entity.getName_user();
		this.dayoff = entity.getDayoff();
		this.start_work = entity.getStart_work();
		this.finished_work = entity.getFinished_work();
		this.hour_meal = entity.getHour_meal();
		entity.getHaircuts().forEach(x -> haircuts.add(new HaircutDTO(x)));
	}
	
	public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public Date getDayoff() {
		return dayoff;
	}

	public void setDayoff(Date dayoff) {
		this.dayoff = dayoff;
	}

	public Date getStart_work() {
		return start_work;
	}

	public void setStart_work(Date start_work) {
		this.start_work = start_work;
	}

	public Date getFinished_work() {
		return finished_work;
	}

	public void setFinished_work(Date finished_work) {
		this.finished_work = finished_work;
	}

	public Date getHour_meal() {
		return hour_meal;
	}

	public void setHour_meal(Date hour_meal) {
		this.hour_meal = hour_meal;
	}

	public List<HaircutDTO> getHaircuts() {
		return haircuts;
	}
	
	
}