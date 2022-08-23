package s03t02;

import java.util.*;

public class Agencia implements Observer{
	
	private String nom;


	public Agencia(String nom)
	{
		this.nom = nom;
	}


	@Override
	public void update(double price) {
		System.out.println(this.nom + " el precio de Bolsa " + " ha cambiado a " + price);
		
	}
	
	

}
