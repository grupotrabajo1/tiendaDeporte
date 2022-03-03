package tiendaDeporte;

public class Proveedor extends Persona
{
	public Proveedor() {};
	public Proveedor(String nombre, String direccion, String telefono) 
	{
		super(nombre, direccion, telefono);
	}
	
	public void AltaProveedor() 
	{
		Proveedor proveedor = new Proveedor();
	}	
}
