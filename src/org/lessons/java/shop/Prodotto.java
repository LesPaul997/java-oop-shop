package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int code;
	private String name;
	private String description;
	private double price;
	private double tax;
	
	//Costruttore
	public Prodotto(String name, String description, double price, double tax) {
		Random rand = new Random();
		this.code = rand.nextInt(1000000);
		this.name = name;
		this.description = description;
		this.price = price;
		this.tax = tax;
	}
	
	//Getter per codice
	public int getCode() {
		return code;
	}
	
	//Getter e Setter per Nome
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter e setter per Descrizione
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Getter e Setter per prezzo
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Getter e Setter per prezzo con IVA
	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	//Metodo per ottenere il prezzo base
	public double getBasePrice() {
		return price;
	}
	
	//Metodo per ottenere il prezzo comprensivo di IVA
	public double getPriceWhitTax() {
		return price + (price * tax / 100);
	}
	
	//Metodo per ottenere il nome esteso
	public String getExtendedName() {
		return code + "-" + name;
	}
}
