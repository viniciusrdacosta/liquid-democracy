package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "citizen")
@Inheritance(strategy = InheritanceType.JOINED)
public class Citizen extends Candidate implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "candidate")
	private Boolean candidate;


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getCandidate() {
		return candidate;
	}

	public void setCandidate(Boolean candidate) {
		this.candidate = candidate;
	}

}
