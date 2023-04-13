package org.example;

public class Test {
public static void main(String[] args) {
	Faktura faktura = new Faktura();
	faktura.setKontrahent("Krzaczek Sp. z o.o.");
	faktura.getPozycje().add(new Pozycja.Builder("komputer",1).ku("sdafs").cena(2.0).vat(1).build());
	System.out.println(faktura.getPozycje().get(0).toString());
}


}
