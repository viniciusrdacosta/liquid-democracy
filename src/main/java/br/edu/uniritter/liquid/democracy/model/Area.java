package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;
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
	}

}
