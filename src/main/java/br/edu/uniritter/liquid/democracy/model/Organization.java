package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "citizen")
public class Organization extends Candidate implements Serializable {

	private static final long serialVersionUID = 1L;

	private String description;
	private List<Citizen> members;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Citizen> getMembers() {
		return members;
	}

	public void setMembers(List<Citizen> members) {
		this.members = members;
	}

}
