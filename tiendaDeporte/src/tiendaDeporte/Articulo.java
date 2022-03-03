package tiendaDeporte;
public class Articulo
{
	/*
	 * Atributos
	 */
	String codigo;
	String descripcion;
	double precio;
	/*
	 * Getters y Setters
	 */
	//Getters
	public String getCodigo()
	{
		return codigo;
	}
	public String getDescripcion()
	{
		return descripcion;
	}
	public double getPrecio()
	{
		return precio;
	}
	//Setters
	public void setCodigo(String codigo)
	{
		this.codigo=codigo;
	}
	public void setDescripcion(String descripcion)
	{
		this.descripcion=descripcion;
	}
	public void setPrecio(double precio)
	{
		this.precio=precio;
	}
	/*
	 * Constructores
	 */
	public Articulo()
	{
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.precio=precio;
	} //Cierre del constructor sin parámetros
	public Articulo(String code, String descrip, double pre)
	{
		this.codigo=code;
		this.descripcion=descrip;
		this.precio=pre;
	} //Cierre del constructor con parámetros
	/*
	 * Funciones
	 */
	public Articulo alta(String code, String descrip, double pre)
	{
		Articulo nuevoArt=null;
		nuevoArt.codigo=code;
		nuevoArt.descripcion=descrip;
		nuevoArt.precio=pre;
		return nuevoArt;
	}
	public String visualizarDatos()
	{
		return "Code: "+codigo+"\n"
				+"Description: "+descripcion+"\n"
				+"Price: "+precio+";";
	} //Cierre de la función visualizarDatos (que vendría siendo un ToString)
}
