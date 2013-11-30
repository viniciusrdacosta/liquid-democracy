package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;


@Table(name = "area")
public class Area implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	Integer id;

	@Column(name = "name")
	String name;

	@Column(name = "description")
	String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
	}

}
