package com.exemplo.juarez_goes.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class Supplier implements Serializable{
	
	
	@Id
	@Column(name="cnpj")	
	private String cnpj;
	
	private String name;
	
	private Date last_buy;


	private String quality_rate;

	private String probability_of_new_deals;
	
	
	

	
	
	public Supplier(String cnpj, String name, Date last_buy, String quality_rate, String probability_of_new_deals) {
		super();
		this.cnpj = cnpj;
		this.name = name;
		this.last_buy  = last_buy;
		this.quality_rate  = quality_rate;
		this.probability_of_new_deals  = probability_of_new_deals;
	}
	
	@Override
	public String toString() {
	return "Supplier [CNPJ=" + cnpj + ", name=" + name + ", Last Buy=" + last_buy + ", Quality Rate=" + quality_rate + ", Probability of new deals" + probability_of_new_deals + "]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLast_buy() {
		return last_buy;
	}

	public void setLast_buy(Date last_buy) {
		this.last_buy = last_buy;
	}

	public String getQuality_rate() {
		return quality_rate;
	}

	public void setQuality_rate(String quality_rate) {
		this.quality_rate = quality_rate;
	}

	public String getProbability_of_new_deals() {
		return probability_of_new_deals;
	}

	public void setProbability_of_new_deals(String probability_of_new_deals) {
		this.probability_of_new_deals = probability_of_new_deals;
	}

	
	
}
