package br.edu.uniritter.liquid.democracy.model;

import java.io.Serializable;
import java.util.Date;

//@Entity
//@Table(name = "candidate")
public class Delegation implements Serializable {

	private static final long serialVersionUID = 1L;

	// @Column(name = "number")
	private Candidate delegate;
	private Candidate proxy;
	private Date initialDate;
	private Date finalDate;

	public Candidate getDelegate() {
		return delegate;
	}

	public void setDelegate(Candidate delegate) {
		this.delegate = delegate;
	}

	public Candidate getProxy() {
		return proxy;
	}

	public void setProxy(Candidate proxy) {
		this.proxy = proxy;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

}
