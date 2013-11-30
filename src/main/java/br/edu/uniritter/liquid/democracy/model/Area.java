package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.Date;

//@Entity
//@Table(name = "candidate")
public class Area implements Serializable {

	private static final long serialVersionUID = 1L;

	// @Column(name = "number")
	private Candidate voter;
	private Project project;
	private Date date;
	private Long weight;

	public Candidate getVoter() {
		return voter;
	}

	public void setVoter(Candidate voter) {
		this.voter = voter;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
=======

import javax.persistence.Column;
import javax.persistence.Table;


@Table(name = "area")
public class Area extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	String name;

	@Column(name = "description")
	String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
>>>>>>> 43e97e1daa1b84065b60d38293e193d3cf015397
	}

}
