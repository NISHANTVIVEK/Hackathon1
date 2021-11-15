package com.Medconfer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_HOSPITAL")
public class Hospital {
	@Id
    @GeneratedValue
    private Long id;
	
	private String name;
	

	private Long price;
	
	private Long treatmentid;

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

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getTreatementId() {
		return treatmentid;
	}

	public void setTreatementId(Long treatementId) {
		this.treatmentid = treatementId;
	}
}
