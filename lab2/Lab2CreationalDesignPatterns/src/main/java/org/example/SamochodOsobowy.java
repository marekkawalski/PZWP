package org.example;
public class SamochodOsobowy implements ISamochod {
	public void zatankuj() {
		System.out.println(this+" Tankowanie samochodu ");
	}
	public void sprawdzPlyny() { 
		System.out.println(this+" Sprawdzanie p�yn�w samochodu ");
	}
	public void test() {
		System.out.println("Samoch�d "+this+" gotowy");
	}
	
}


