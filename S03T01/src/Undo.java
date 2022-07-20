import java.util.ArrayList;

public class Undo {
	
	private static Undo instancia = null;


	//La creación del objeto lo hacemos con un método
	public static Undo getInstancia() {
		
		if(instancia == null) {
			instancia = new Undo();
		}
		return instancia;
		
	}
	/*El constructor debe ser privado para seguir el patrón, sino, se podrían instanciar
	más objetos de esta clase, y eso es l contrario de loq ue se quiere conseguir en singleton
	Aquí se trata de que muchos usuarios logren utilizar este objeto
	*/
	private Undo() {
		
	}
	
	public void listar(ArrayList<String> listado) {
		for(String comanda : listado) {
			System.out.println(comanda);
		}
		
	}

	public ArrayList<String> agregar(ArrayList<String> listado, String comanda_agregar) {
		listado.add(comanda_agregar);
		return listado;
		
	}

	public ArrayList<String> eliminar(ArrayList<String> listado, String comanda_quitar) {
		listado.remove(comanda_quitar);
		return listado;
		
	}

	

}
