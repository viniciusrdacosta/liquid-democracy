package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "candidate")
public class Candidate extends Citizen implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "number")
	Integer number;
	
	@Column(name = "name_in_the_urn")
	String nameInTheUrn;
	
	@Column(name = "city")
	String city;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getNameInTheUrn() {
		return nameInTheUrn;
	}

	public void setNameInTheUrn(String nameInTheUrn) {
		this.nameInTheUrn = nameInTheUrn;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
