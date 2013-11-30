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
	@Column(name = "cpf")
	private String cpf;

	@Column(name = "voterRegistration")
	private String voterRegistration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getVoterRegistration() {
		return voterRegistration;
	}

	public void setVoterRegistration(String voterRegistration) {
		this.voterRegistration = voterRegistration;
	}

}
