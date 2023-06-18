package org.example;

public class Pozycja {
	private Pozycja(final Builder builder) {
		this.opis = builder.opis;
		this.ilosc = builder.ilosc;
		this.cena = builder.cena;
		this.vat = builder.vat;
		this.ku = builder.ku;
	}
	private String opis;
	private int ilosc;
	private double cena;
	private int vat;
	private String ku;

	public static class Builder{
		private String opis;
		private int ilosc;
		private double cena;
		private int vat;
		private String ku;
		public Builder(final String opis, final int ilosc) {
			this.opis = opis;
			this.ilosc = ilosc;
		}
		public Builder cena(final double cena){
			this.cena = cena;
			return this;
		}
		public Builder vat(final int vat){
			this.vat = vat;
			return this;
		}
		public Builder ku(final String ku){
			this.ku = ku;
			return this;
		}
		public Pozycja build(){
			return new Pozycja(this);
		}
	}

	@Override
	public String toString() {
		return "Pozycja{" +
				"opis='" + opis + '\'' +
				", ilosc=" + ilosc +
				", cena=" + cena +
				", vat=" + vat +
				", ku='" + ku + '\'' +
				'}';
	}
}
