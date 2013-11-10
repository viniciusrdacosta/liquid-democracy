package br.edu.uniritter.liquid_democracy.backend.model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


@ManagedBean(name = "Citizen")
@RequestScoped
public class Citizen {

	private String name;
	private String socialCC;
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
	
	public Boolean isFilled() {
		return (!this.getName().isEmpty() && !this.getSocialCC().isEmpty() && !this.getVoterRegistration().isEmpty());
	}
	
	public void savePerson(ActionEvent actionEvent) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " + name + " " + socialCC  + voterRegistration + "!"));  
    }  
	

	
	
}
