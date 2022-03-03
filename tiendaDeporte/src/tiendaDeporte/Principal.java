package tiendaDeporte;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Cliente[] cli=new Cliente[4];
		Proveedores[] prove=new Proveedores[3]; //ToDo Pablo tiene que hacer esto
		Articulo[] art=new Articulo[2];
		for(int i=0;i<cli.length;i++) //Bucle FOR para generar los clientes
		{
			System.out.println("Client "+(i+1)+" will be authorized:");
			cli[i].darAlta();
		}
		for(int i=0;i<prove.length;i++) //Bucle FOR para generar los proveedores
		{
			//ToDo, necesito el código de Pablo otra vez para crear a los proveedores
		}
		for(int i=0;i<art.length;i++) //Bucle FOR para generar los artículos
		{
			System.out.println("Article"+(i));
			System.out.println("Article "+i+ " Code:");
			art[i].setCodigo(sc.nextLine());
			System.out.println("Article "+i+" Description:");
			art[i].setDescripcion(sc.nextLine());
			System.out.println("Article "+i+" Price:");
			art[i].setPrecio(sc.nextDouble());
			sc.nextLine();
		}
	}
}
