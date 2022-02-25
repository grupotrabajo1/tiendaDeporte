package tiendadeporte;

import java.util.ArrayList;
import java.util.Scanner;

/**

 * <H2>Clase Principal</H2>

 * Crea una lista de clientes, proveedores y art�culos y los muestra por pantalla.

 *

 * @author Lagartijo676

 * @version 0.1

 */
public class Principal {
    
	/**

	 * <H2>Atributo escaner</H2>

	 * Lee por pantalla

	 * @param System.in

	 */
    static Scanner escaner = new Scanner(System.in);
    
    /**

     * <H2>Atributos Cliente, Articulo y Proveedor</H2>

     * Listas de clientes, art�culos y proveedores

     */
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList<Articulo> articulos = new ArrayList<Articulo>();
    static ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
    
    /**

     * <H2>M�todo introducirClientes</H2>

     * Introduce clientes en la lista de clientes

     * @param n n�mero de clientes a introducir

     */
    public static void introducirClientes(int n){
        for(int i=0;i<n;i++){
            System.out.println("Vamos a introducir " + n + " clientes:");
            System.out.println("Introduce el nombre del cliente " + (i+1) + ":");
            clientes.add(new Cliente(escaner.nextLine()));
        }
    }
    /**

 	/**

     * <H2>M�todo introducirProveedores</H2>

     * Introduce proveedores en la lista de proveedores

     * @param n n�mero de proveedores a introducir

     */
    public static void introducirProveedores(int n){
        for(int i=0;i<n;i++){
            System.out.println("Vamos a introducir " + n + " proveedores:");
            System.out.println("Introduce el nombre del proveedor " + (i+1) + ":");
            proveedores.add(new Proveedor(escaner.nextLine()));
        }
    }
    
    /**

     * <H2>M�todo introducirArticulos</H2>

     * Introduce art�culos en la lista de art�culos

     * @param n n�mero de art�culos a introducir

     */
    public static void introducirArticulos(int n){
        for(int i=0;i<n;i++){
            System.out.println("Vamos a introducir " + n + " articulos:");
            System.out.println("Introduce el nombre del articulo " + (i+1) + ":");
            articulos.add(new Articulo(escaner.nextLine()));
        }
    }
    
    /**

     * <H2>M�todo main</H2>

     * Introduce los clientes, proveedores y art�culos en sus listas correspondientes y los muestra por pantalla.

     */
    public static void main(String[] args){
        
        introducirClientes(4);
        
        introducirProveedores(3);
        
        introducirArticulos(2);
        
        System.out.println("Lista de clientes: " + clientes);
        
        System.out.println("Lista de proveedores: " + proveedores);
        
        System.out.println("Lista de articulos: " + articulos);
    }
}
