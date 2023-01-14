package com.db_mark.demo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_styles_hair")
public class StyleHair implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String name_user;
	private Date dayoff;
	private Date start_work;
	private Date finished_work;
	private Date hour_meal;

	public StyleHair() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameUser() {
		return name_user;
	}

	public void setNameUser(String name) {
		this.name_user = name;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StyleHair other = (StyleHair) obj;
		return Objects.equals(id, other.id);
	}
}