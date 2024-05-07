package ar.edu.unju.fi.ejercicio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.producto;
import ar.edu.unju.fi.ejercicio1.model.constantes.categoria;
import ar.edu.unju.fi.ejercicio1.model.constantes.paises;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		producto producto = new producto();
		
		ArrayList<producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("Menú");
            System.out.println("1 - Crear Producto");
            System.out.println("2 - Mostrar productos");
            System.out.println("3 - Modificar producto");
            System.out.println("4 - Salir");
            System.out.print("Elija una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        crearProducto(productos, scanner);
                        break;
                    case 2:
                        mostrarProductos(productos);
                        break;
                    case 3:
                        modificarProducto(productos, scanner);
                        break;
                    case 4:
                        System.out.println("fin del programa");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido.");
                scanner.nextLine();
            }
        } while (opcion != 4);
    }

    private static void crearProducto(ArrayList<producto> productos, Scanner scanner) {
    	
    	productos.add(new producto());
    	
    	System.out.println("Ingrese codigo de producto: ");
    	String codigo = scanner.nextLine();
    	System.out.println("Descripcion del producto: ");
    	String descripcion = scanner.nextLine();
    	System.out.println("Ingrese precio unitario: ");
    	String preunitario = scanner.nextLine();
    	System.out.println("--Origen de fabricacion--");
    	System.out.println("1-Argentina");
    	System.out.println("2-China");
    	System.out.println("3-Brasil");
    	System.out.println("4-Uruguay");
    	System.out.println("Elija opcion: ");
    	
    	int opcion =scanner.nextInt();
    	switch(opcion) {
    		case 1: paises origen1 = paises.argentina;
    		break;
    		case 2: paises origen2 = paises.china;
    		break;
    		case 3: paises origen3 = paises.brasil;
    		break;
    		case 4: paises origen4 = paises.uruguay;
    		break;
    	}
    	System.out.println("--Categoria--");
    	System.out.println("1-Telefonia");
    	System.out.println("2-Informatica");
    	System.out.println("3-Electro hogar");
    	System.out.println("4-Herramientas");
    	System.out.println("Elija opcion: ");
    	int cat = scanner.nextInt();
    	switch(cat) {
    		case 1: categoria categoria1 = categoria.telefonia;
    		break;
    		case 2: categoria categoria2 = categoria.informatica;
    		break;
    		case 3: categoria categoria3 = categoria.electrohogar;
    		break;
    		case 4: categoria categoria4 = categoria.herramientas;
    		break;
    	}
    }

    private static void mostrarProductos(ArrayList<producto> productos) {
    	
    	for (int i =0; i < productos.size() ; i ++) {
    		System.out.println("Productos: ");
    		System.out.println(productos.get(i).getDescripcion());
    		System.out.println(productos.get(i).getCodigo());
    		System.out.println(productos.get(i).getPreunitario());
    		System.out.println(productos.get(i).getOrigen());
    		System.out.println(productos.get(i).getCategoria());
    		}
    }

    private static void modificarProducto(ArrayList<producto> productos, Scanner scanner) {
    	int pos = -1;
    	System.out.println("Ingrese codigo del producto a modificar: ");
    	int n = scanner.nextInt();
    	
    	for (int i =0; i < productos.size() ; i ++) {
    		if(producto.getCodigo() == n) {
    			
    		}
    	}
    }
}



