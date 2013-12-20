package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public abstract class Candidate extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "name")
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
