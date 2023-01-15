package com.db_mark.demo.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.db_mark.demo.enums.TypeOptionHaircut;

@Entity
@Table(name = "tb_haircut")
public class Haircut implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant hour;
	private TypeOptionHaircut option;
	private Double price;
	
	 @ManyToOne
	 @JoinColumn(name="hairdresser_id")
	 private Hairdresser hairdresser;
	
	 @OneToOne
	 @JoinColumn(name="client")
	 private Client client;
	 
	public Haircut() {
	}

	public Haircut(Long id, Instant hour, TypeOptionHaircut option, Double price, Hairdresser hairdresser, Client client) {
		this.id = id;
		this.hour = hour;
		this.option = option;
		this.price = price;
		this.hairdresser = hairdresser;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getHour() {
		return hour;
	}

	public void setHour(Instant hour) {
		this.hour = hour;
	}

	public TypeOptionHaircut getOption() {
		return option;
	}

	public void setOption(TypeOptionHaircut option) {
		this.option = option;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Hairdresser getHairdresser() {
		return hairdresser;
	}

	public void setHairdresser(Hairdresser hairdresser) {
		this.hairdresser = hairdresser;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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
