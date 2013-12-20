package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "project")
public class Project extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
	//private Candidate author;
	
	@Column(name = "addte")
	@Temporal(TemporalType.TIMESTAMP)
	private Date addate;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "enddate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endate;
	
	@Column(name = "area")
	@JoinTable(name="area")//, joinColumns={@JoinColumn(name="area_id", referencedColumnName="id")})
	private Area area;
	
	@Column(name = "created")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	
	@Column(name = "finaldate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date finaldate;
	
	@Column(name = "identification")
	private String identification;
	
	@Column(name = "initialdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date initialdate;
	
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
	/*
	public Candidate getAuthor() {
		return author;
	}
	public void setAuthor(Candidate author) {
		this.author = author;
	}
	*/
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
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getFinaldate() {
		return finaldate;
	}
	public void setFinaldate(Date finaldate) {
		this.finaldate = finaldate;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public Date getInitialdate() {
		return initialdate;
	}
	public void setInitialdate(Date initialdate) {
		this.initialdate = initialdate;
	}
	  
	
}
