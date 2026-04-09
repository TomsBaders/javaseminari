package lv.venta.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {
	// Mainīgie.
	@Setter(value = AccessLevel.NONE)
	private int id;
	private String nosaukums;
	private String apraksts;
	private double cena;
	private int prodSkaits;
	private ProductType prodTips;
	private static int autoincremental;
	
	// Konstruktori. Bezargumenta konstruktors ir no lombok bibliotēkas.
	public Product(String inputNosaukums, String inputApraksts, double inputCena, int inputProdSkaits, ProductType inputProdTips){
		this.id = autoincremental++;
		setNosaukums(inputNosaukums);
		setApraksts(inputApraksts);
		setCena(inputCena);
		setProdSkaits(inputProdSkaits);
		setProdTips(inputProdTips);
	}
	
	// Get funkcijas. No lombok bibliotēkas.
	// Set funkcijas. No lombok bibliotēkas.
	// ToString funkcija. No lombok bibliotēkas.
}
