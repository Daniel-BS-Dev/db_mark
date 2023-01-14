package com.db_mark.demo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.db_mark.demo.enums.typeOptionHaircut;

@Entity
@Table(name = "tb_haircut")
public class Haircut implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date hour;
	private typeOptionHaircut option;
	private Double price;
	
	 @ManyToOne
	 @JoinColumn(name="user_id")
	 private Hairdresser styleHair;
	
	public Haircut() {
	}

	public Haircut(Long id, Date hour, typeOptionHaircut option, Double price, Hairdresser styleHair) {
		this.id = id;
		this.hour = hour;
		this.option = option;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getHour() {
		return hour;
	}

	public void setHour(Date hour) {
		this.hour = hour;
	}

	public typeOptionHaircut getOption() {
		return option;
	}

	public void setOption(typeOptionHaircut option) {
		this.option = option;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Hairdresser getStyleHair() {
		return styleHair;
	}

	public void setStyleHair(Hairdresser styleHair) {
		this.styleHair = styleHair;
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
		Haircut other = (Haircut) obj;
		return Objects.equals(id, other.id);
	}
}
