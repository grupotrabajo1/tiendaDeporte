package tiendaDeporte;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Cliente[] cli=new Cliente[4];
		Proveedor[] prove=new Proveedor[3];
		Articulo[] art=new Articulo[2];
		for(int i=0;i<cli.length;i++) //Bucle FOR para generar los clientes
		{
			System.out.println("Client "+(i+1)+" will be authorized:");
			cli[i]=new Cliente();
			cli[i].darAlta();
		}
		for(int i=0;i<prove.length;i++) //Bucle FOR para generar los proveedores
		{
			System.out.println("Provider "+(i+1)+" will be authorized:");
			prove[i]=new Proveedor();
			prove[i].AltaProveedor();
		}
		for(int i=0;i<art.length;i++) //Bucle FOR para generar los artículos
		{
			System.out.println("Article"+(i));
			art[i]=new Articulo();
			System.out.println("Article "+i+ " Code:");
			art[i].setCodigo(sc.nextLine());
			System.out.println("Article "+i+" Description:");
			art[i].setDescripcion(sc.nextLine());
			System.out.println("Article "+i+" Price:");
			art[i].setPrecio(sc.nextDouble());
			sc.nextLine();
		}
		//Tras estos tres bucles ya tendríamos creados todos los objetos Cliente, Proveedor y Artículo
	}
}
