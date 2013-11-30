package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "citizen")
public class Citizen extends Candidate implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cpf;
	private String password;
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
