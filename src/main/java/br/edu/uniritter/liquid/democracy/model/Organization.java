package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "organization")
@Inheritance(strategy = InheritanceType.JOINED)
public class Organization extends Candidate implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String description;
	
	//@ElementCollection(targetClass = Citizen.class)
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(	name = "organization_members")
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
