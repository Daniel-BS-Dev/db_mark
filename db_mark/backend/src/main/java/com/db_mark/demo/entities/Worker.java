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
@Table(name = "tb_worker")
public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Date dayoff;
	private Date start_work;
	private Date finished_work;
	private Date hour_meal;

	@Column(unique = true)
	private String email;
	private String password;

	public Worker() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		Worker other = (Worker) obj;
		return Objects.equals(id, other.id);
	}
}