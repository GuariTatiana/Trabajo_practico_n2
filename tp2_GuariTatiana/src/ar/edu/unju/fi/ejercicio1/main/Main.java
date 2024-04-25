package ar.edu.unju.fi.ejercicio1.main;
import java.util.ArrayList;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio1.model.Producto;


public class Main {

	public static void main(String[] args) {
	
		ArrayList <Producto> listado = new ArrayList<>();
		
		Scanner lector =new Scanner (System.in);
		
		int op;
		
		 System.out.println("Menú de opciones:");
         System.out.println("1 – Crear Producto");
         System.out.println("2 – Mostrar productos");
         System.out.println("3 – Modificar producto");
         System.out.println("4 – Salir");
         System.out.println("Ingrese una opción:");
         op = lector.nextInt();
		
		while (op >= 4 ) {
			
            switch (op) {
                case 1:
                    crearProducto(listado, lector);
                    break;
                case 2:
                    mostrarProductos(listado);
                    break;
                case 3:
                    modificarProducto(listado, lector);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }}				
	
		
	}	   
}
	    
