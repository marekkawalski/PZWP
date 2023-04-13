package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zupa {
	List<Skladnik> skladniki = new ArrayList<>();
	
	String nazwa;

	public void przygotuj() {
		System.out.println("Przygotowanie zupy ze sk�adnik�w: "+skladniki);
		System.out.println("Nalewam wod� do garnka");
		System.out.println("Wrzucam kostk� roso�ow�");
		nazwa = "ros�";
		for(Skladnik skladnik:skladniki) {
			if(skladnik instanceof Marchewka) {
				Marchewka marchewka = (Marchewka)skladnik;
				marchewka.obierz();
				marchewka.pokroj();
			}
			if(skladnik instanceof Makaron) {
				Makaron makaron = (Makaron)skladnik;
				makaron.gotuj();
			}
			if(skladnik instanceof Ryz){
				Ryz ryz = (Ryz) skladnik;
				ryz.gotuj();
			}
			
		}
			
	}

	public void przygotujZuperPomidorowa() {
		System.out.println("Przygotowanie zupy ze sk�adnik�w: "+skladniki);
		System.out.println("Nalewam wod� do garnka");
		System.out.println("Wrzucam koncentrat pomidorowy");
		nazwa = "ros�";
		for(Skladnik skladnik:skladniki) {
			if(skladnik instanceof Marchewka) {
				Marchewka marchewka = (Marchewka)skladnik;
				marchewka.obierz();
				marchewka.pokroj();
			}
			if(skladnik instanceof Makaron) {
				Makaron makaron = (Makaron)skladnik;
				makaron.gotuj();
			}
			if(skladnik instanceof Ryz){
				Ryz ryz = (Ryz) skladnik;
				ryz.gotuj();
			}

		}

	}
	
	public void podaj() {
		System.out.println("Podanie obiadu");
		System.out.println("Podaj� "+nazwa+ " do sto�u");
	}
	public void wyslij(String adres) {
		System.out.println("Wyslanie obiadu na adres" + adres + "\n");
		System.out.println("Wyslij� "+nazwa+ " na adres");
	}
}
