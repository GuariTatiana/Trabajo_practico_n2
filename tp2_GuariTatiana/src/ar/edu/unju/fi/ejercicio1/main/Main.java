package ar.edu.unju.fi.ejercicio1.main;
import java.util.ArrayList;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio1.model.*;

public class Main {

public static void main(String[] args) {
	
		        ArrayList<Producto> listaProductos = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);
		        
		        int opcion = 0;
		        while (opcion != 4) {
		            System.out.println("Menú de opciones:");
		            System.out.println("1 - Crear Producto");
		            System.out.println("2 - Mostrar productos");
		            System.out.println("3 - Modificar producto (sólo puede modificar: descripción, precio unitario, origen fabricación o categoría)");
		            System.out.println("4 - Salir");
		            System.out.print("Elija una opción: ");
		            opcion = scanner.nextInt();
		            
		            switch (opcion) {
		                case 1:
		                    Producto producto = new Producto();
		                    // Lógica para crear un nuevo producto
		                    listaProductos.add(producto);
		                    break;
		                case 2:
		                    // Lógica para mostrar los productos
		                    for (Producto p : listaProductos) {
		                        System.out.println(p.toString());
		                    }
		                    break;
		                case 3:
		                    // Lógica para modificar un producto
		                    // Mostrar opciones de origen de fabricación y categoría
		                    System.out.println("------ Origen de fabricación ------");
		                    System.out.println("1 - Argentina");
		                    System.out.println("2 - China");
		                    System.out.println("3 - Brasil");
		                    System.out.println("4 - Uruguay");
		                    System.out.print("Elija una opción: ");
		                    int opcionOrigen = scanner.nextInt();
		                    
		                    System.out.println("------ Categoría ------");
		                    System.out.println("1 - Telefonía");
		                    System.out.println("2 - Informática");
		                    System.out.println("3 - Electro hogar");
		                    System.out.println("4 - Herramientas");
		                    System.out.print("Elija una opción: ");
		                    int opcionCategoria = scanner.nextInt();
		                    
		                    // Lógica para modificar el producto seleccionado
		                    break;
		                case 4:
		                    System.out.println("Saliendo del programa...");
		                    break;
		                default:
		                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
		                    break;
		            }
		        }
		        
		        scanner.close();
 
		
	}
}
