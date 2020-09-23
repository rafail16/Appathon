package models;

public class Country {
	//protected int id;
	protected String country;
	protected double vat;
	
	public Country() {
	}
	
	public Country(int id, String country, double vat) {
		super();
		//this.id = id;
		this.country = country;
		this.vat = vat;
	}
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
	public String getCountry() {
		return country;
	}
	public void setName(String country) {
		this.country = country;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
}