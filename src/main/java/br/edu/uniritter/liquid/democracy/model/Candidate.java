package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

<<<<<<< HEAD
//@Entity
@Table(name = "candidate")
public abstract class Candidate  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//@Column(name = "number")
	private String name;
=======

@Entity
@Table(name = "candidate")
public abstract class Candidate extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "name")
	String name;

>>>>>>> d12b6f7ffe4ef480b23002679731bca770915afa
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
