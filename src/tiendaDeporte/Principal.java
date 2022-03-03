package tiendaDeporte;
import java.util.ArrayList;
import java.util.Scanner;

import tiendaDeporte.Cliente.TipoCliente;



public class Principal {
	
	static Scanner sc=new Scanner(System.in);
	
	/**
	 * Funcion para pedir cadena de caracteres
	 * @param peticion String mensaje de peticion
	 * @return String cadena
	 */
	public static String pedirCadena(String peticion)
	{
		System.out.print(peticion);
		String cadena=sc.nextLine();
		return cadena;
	}
	
	/**
	 * Funcion para pedir el precio de un producto
	 * @return String precio
	 */
	public static String pedirPrecio()
	{
		System.out.print("Introduce el precio del producto: ");
		String precio=sc.nextLine();
		return  precio;
	}
	
	/**
	 * Funcion para indicar cual va a ser el tipo de cliente
	 * @return TipoCliente
	 */
	public static TipoCliente tipo()
	{
		System.out.print("Elige el tipo de cliente: VIP|MOROSO|NUEVO|POTENCIAL --> ");
		String elige=sc.nextLine();
		if(elige.toLowerCase().equals("vip"))
		{
			return TipoCliente.Vip;
		}else if(elige.toLowerCase().equals("moroso"))
		{
			return TipoCliente.Moroso;
		}else if(elige.toLowerCase().equals("nuevo"))
		{
			return TipoCliente.Nuevo;
		}else if(elige.toLowerCase().equals("potencial"))
		{
			return TipoCliente.Potencial;
		}else
		{
			return TipoCliente.Nuevo;
		}
	}

	public static void main(String[] args) 
	{
		/**
		 * Creacion de la lista de articulos
		 */
		ArrayList<Articulo>articulos=new ArrayList<Articulo>();
		articulos.add(new Articulo(pedirCadena("Introduce el codigo del articulo 1: "),pedirCadena("Introduce la descripcion: "),pedirPrecio()));
		articulos.add(new Articulo(pedirCadena("Introduce el codigo del articulo 2: "),pedirCadena("Introduce la descripcion: "),pedirPrecio()));
		/**
		 * Creacion de la lista de clientes
		 */
		ArrayList<Cliente>clientes=new ArrayList<Cliente>();
		clientes.add(new Cliente(pedirCadena("Introduce el nombre del cliente 1: "),pedirCadena("Introduce la direccion: "),pedirCadena("Introduce el numero de telefono: "),tipo()));
		clientes.add(new Cliente(pedirCadena("Introduce el nombre del cliente 2: "),pedirCadena("Introduce la direccion: "),pedirCadena("Introduce el numero de telefono: "),tipo()));
		clientes.add(new Cliente(pedirCadena("Introduce el nombre del cliente 3: "),pedirCadena("Introduce la direccion: "),pedirCadena("Introduce el numero de telefono: "),tipo()));
		clientes.add(new Cliente(pedirCadena("Introduce el nombre del cliente 4: "),pedirCadena("Introduce la direccion: "),pedirCadena("Introduce el numero de telefono: "),tipo()));
		/**
		 * Creacion de la lista de proveedores
		 */
		ArrayList<Proveedor>proveedores=new ArrayList<Proveedor>();
		proveedores.add(new Proveedor(pedirCadena("Introduce el nombre del primer proveedor: "),pedirCadena("Introduce el primer apellido: "),pedirCadena("Introduce el segundo apellido: ")));
		proveedores.add(new Proveedor(pedirCadena("Introduce el nombre del segundo proveedor: "),pedirCadena("Introduce el primer apellido: "),pedirCadena("Introduce el segundo apellido: ")));
		proveedores.add(new Proveedor(pedirCadena("Introduce el nombre del tercer proveedor: "),pedirCadena("Introduce el primer apellido: "),pedirCadena("Introduce el segundo apellido: ")));
		
		/**
		 * Informacion mostrada por pantalla
		 */
		System.out.println();
		System.out.print("--LISTA CLIENTES--"+"\n");
		for(Cliente c:clientes)
		{
			System.out.print(c.toString());
		}
		System.out.println();
		System.out.print("--LISTA ARTICULOS--"+"\n");
		for(Articulo a:articulos)
		{
			System.out.print(a.devolverDatos()+"\n");
		}
		System.out.println();
		System.out.print("--LISTA PROVEEDORES--"+"\n");
		for(Proveedor p:proveedores)
		{
			System.out.print(p.mandarDatos());
		}
	}

}
