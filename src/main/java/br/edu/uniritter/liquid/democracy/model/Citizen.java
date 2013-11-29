package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "citizen")
public class Citizen extends BaseEntity implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "name")
	private String name;
	@Column(name = "socialCC")
	private String socialCC;
	@Column(name = "voterRegistration")
	private String voterRegistration;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSocialCC() {
		return socialCC;
	}
	public void setSocialCC(String socialCC) {
		this.socialCC = socialCC;
	}
	public String getVoterRegistration() {
		return voterRegistration;
	}
	public void setVoterRegistration(String voterRegistration) {
		this.voterRegistration = voterRegistration;
	}
	
	
	
	

}
