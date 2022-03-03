package tiendaDeporte;

public class Cliente extends Persona
{
	/*
	 * Atributos
	 */
	String tipoEmpleado[]={"POTENCIAL","NUEVO","VIP","MOROSO"};
	/*
	 * Constructor
	 */
	public Cliente()
	{ //CHECK si necesitamos añadir parámetros al constructor
		this.tipoEmpleado=tipoEmpleado;
	} //Cierre del constructor sin parámetros
	public Cliente(String tipo)
	{
		this.tipoEmpleado=tipoEmpleado;
	} //Cierre del constructor con parámetros
	/*
	 * Funciones
	 */
	public static void darAlta()
	{
		Cliente nuevoCliente=new Cliente();
	} //Cierre de darAlta
}
