package org.example;

import java.util.ArrayList;
import java.util.List;

public class Faktura {
	private String kontrahent;
	private List<Pozycja> pozycje = new ArrayList<>();
	private List<PozycjaJavaBean> pozycjeJavaBean = new ArrayList<>();
	public String getKontrahent() {
		return kontrahent;
	}
	public void setKontrahent(String kontrahent) {
		this.kontrahent = kontrahent;
	}
	public List<Pozycja> getPozycje() {
		return pozycje;
	}
	public List<PozycjaJavaBean> getPozycjeJavaBeans(){
		return pozycjeJavaBean;
	}
	
}
