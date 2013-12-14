package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Project")
public class Project extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	//@Column(name = "project")
	//private Project project;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "author")
	private String author;

	@Column(name = "addate")
	private Date addate;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "endate")
	private Date endate;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getAddate() {
		return addate;
	}
	public void setAddate(Date addate) {
		this.addate = addate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getEndate() {
		return endate;
	}
	public void setEndate(Date endate) {
		this.endate = endate;
	}
	
	

}
