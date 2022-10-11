package com.jsfcourse.calc;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@RequestScoped
//@SessionScoped
public class CreditBB {
	private String amount;
	private String time;
	private String rate;
	private Double result;
	
	@Inject
	FacesContext ctx;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	
	public String calc() {
		//konwersja
		int amount = Integer.parseInt(this.amount);
		int time = Integer.parseInt(this.time);
		double rate = Double.parseDouble(this.rate);
		// obliczenia
		double n = time * 12;
		double r = rate/100;
		this.result = amount * ((r / 12 * Math.pow((1+r/12),n))) / ((Math.pow((1 + r/12),n)-1));
//		String resultFinal = String.valueOf(this.result);
		return "showresult";
	}
}
