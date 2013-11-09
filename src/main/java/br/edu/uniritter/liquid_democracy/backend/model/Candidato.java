package br.edu.uniritter.liquid_democracy.backend.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name = "Candidato")
@RequestScoped

public class Candidato extends Citizen {

	int numero;
	String nomeNaUrna;
	String cidade;
	
	
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNomeNaUrna() {
		return nomeNaUrna;
	}
	public void setNomeNaUrna(String nomeNaUrna) {
		this.nomeNaUrna = nomeNaUrna;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
}
