package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

<<<<<<< HEAD
@Entity
@Table(name = "candidate")
=======
//@Entity
//@Table(name = "candidate")
>>>>>>> 5eb408aa5145ed5336c4712bc59ea628dd0154bd
@MappedSuperclass
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
