package s03t02;

import java.util.*;

public class Agent implements Observable {
	
	private ArrayList<Agencia> agencies = new ArrayList<>();
	private double price;
	


	@Override
	public void attach(Agencia a) {
		this.agencies.add(a);
		
	}

	@Override
	public void detach(Agencia a) {
		this.agencies.remove(a);
		
	}

	public void setPrice(double price)
	{
		this.price = price;
		
		for(Agencia a : this.agencies)
		{
			a.update(this.price);
		}
		
	}
	
	
}
