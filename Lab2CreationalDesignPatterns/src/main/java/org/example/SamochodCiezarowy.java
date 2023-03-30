package org.example;
public class SamochodCiezarowy implements ISamochod {
	public void zatankuj() {
		System.out.println(this+" Tankowanie ci�ar�wki ");
	}
	public void sprawdzPlyny() { 
		System.out.println(this+" Sprawdzanie p�yn�w ci�ar�wki");
	}
	public void test() {
		System.out.println("Ci�ar�wka "+this+" gotowa");
	}
}
