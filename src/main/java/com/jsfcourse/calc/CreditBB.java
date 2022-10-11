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
	private String x;
	private String y;
	private Double result;
	//kwota, oprocentowanie, lat -> rata

	@Inject
	FacesContext ctx;

	public String calc() {
		// obliczenia
		return null;
	}
}
