package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		
		//Creazione del Prodotto
		Prodotto prodotto = new Prodotto("Prodottowow", "Prodotto del secolo", 49.99, 20);
		
		//Test dei Getter
		System.out.println("Codice: " + prodotto.getCode());
	    System.out.println("Nome: " + prodotto.getName());
	    System.out.println("Descrizione: " + prodotto.getDescription());
	    System.out.println("Prezzo base: " + prodotto.getBasePrice());
	    System.out.println("Prezzo con IVA: " + prodotto.getPriceWithTax());
	    System.out.println("Nome esteso: " + prodotto.getExtendedName());
	    
	    //Test dei Setter
	    prodotto.setName("Prodotto2");
        prodotto.setDescription("Un prodotto migliore");
        prodotto.setPrice(105);
        prodotto.setTax(20.0);
        
        //Test dei Getter dopo l'uso dei Setter
        System.out.println("Nome (dopo set): " + prodotto.getName());
        System.out.println("Descrizione (dopo set): " + prodotto.getDescription());
        System.out.println("Prezzo base (dopo set): " + prodotto.getBasePrice());
        System.out.println("Prezzo con IVA (dopo set): " + prodotto.getPriceWithTax());
        System.out.println("Nome esteso (dopo set): " + prodotto.getExtendedName());
	
        
	}
}
