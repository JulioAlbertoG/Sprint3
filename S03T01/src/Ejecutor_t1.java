import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor_t1 {

	static ArrayList<String> listado = new ArrayList <String>();
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Scanner add = new Scanner(System.in);
		Scanner remove = new Scanner(System.in);
		Undo u = Undo.getInstancia();
		boolean salir = false;
		int opcion;
		
		while(!salir) {
			System.out.println("1. Agregar comanda");
			System.out.println("2. Borrar comanda");
			System.out.println("3. listar comandas");
			System.out.println("4. Salir");
			
			System.out.println("Elige entre las 4 opciones:");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:{
				System.out.println("Introduce la comanda");        		
        		String comanda_agregar = add.nextLine();      		
        		listado = u.agregar(listado, comanda_agregar);
        		
        		break;
			}
			case 2:{
				System.out.println("Introduce la comanda para borrar");        		
        		String comanda = remove.nextLine();      		
        		listado = u.eliminar(listado, comanda);
        		
        		break;
				
				
			}
			case 3:{
				System.out.println("Aquí están las comandas"); 
				u.listar(listado);
        		break;
			}
			case 4:{
				salir=true;
				System.out.println("Has salido de la app");
				break;
			}
			default: {
        		System.out.println("Algo ha ido mal, revisa los datos introducidos");
        	};
			
		}
			
			
		}

	}

}
