package com.exemplo.juarez_goes.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.ManyToOne;

public class Auditing implements Serializable {

	private static final long serialVersionUID = -4115655179109482884L;
	
	@javax.persistence.Id
	private int IDENTIFIER;
	@ManyToOne
	private String REGISTER_CODE;
	private Date DATETIME;

	public Auditing(int IDENTIFIER, String REGISTER_CODE, Date DATETIME) {
		super();
		this.IDENTIFIER = IDENTIFIER;
		this.REGISTER_CODE = REGISTER_CODE;
		this.DATETIME = DATETIME;
	}

	public int getIDENTIFIER() {
		return IDENTIFIER;
	}

	public void setIDENTIFIER(int IDENTIFIER) {
		this.IDENTIFIER = IDENTIFIER;
	}

	public String getREGISTER_CODE() {
		return REGISTER_CODE;
	}

	public void setREGISTER_CODE(String REGISTER_CODE) {
		this.REGISTER_CODE = REGISTER_CODE;
	}

	public Date getDATETIME() {
		return DATETIME;
	}

	public void setDATETIME(Date DATETIME) {
		this.DATETIME = DATETIME;
	}
}
