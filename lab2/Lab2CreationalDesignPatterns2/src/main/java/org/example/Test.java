package org.example;

public class Test {
public static void main(String[] args) {
	final Faktura faktura = new Faktura();
	faktura.setKontrahent("Krzaczek Sp. z o.o.");
	faktura.getPozycje().add(new Pozycja.Builder("komputer",1).ku("sdafs").cena(2.0).vat(1).build());

	//example with Java bean
	final PozycjaJavaBean pozycjaJavaBean = new PozycjaJavaBean();
	pozycjaJavaBean.setOpis("komputer");
	pozycjaJavaBean.setIlosc(1);
	pozycjaJavaBean.setKu("sdafs");
	pozycjaJavaBean.setCena(2.0);
	pozycjaJavaBean.setVat(1);
	faktura.getPozycjeJavaBeans().add(pozycjaJavaBean);

	System.out.println(faktura.getPozycje().get(0).toString());
	System.out.println(faktura.getPozycjeJavaBeans().get(0).toString());
}


}
