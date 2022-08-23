package s03t02;

public class Ejecutor_nivell1 {

	public static void main(String[] args) 
	{
		
	Agencia agencia1 = new Agencia("Nombre_agencia_1");
	Agencia agencia2 = new Agencia("Nombre_agencia_2");
	
	Agent agent_borsa = new Agent();
	
	//Se registran las agencias que quieran recibir la información
	agent_borsa.attach(agencia1);
	agent_borsa.attach(agencia2);
	
	//se cambia el precio de la bolsa y automáticamente notifica a las agencias registradas
	agent_borsa.setPrice(20.45);
	
	
	}

}
