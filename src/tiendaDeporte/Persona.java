package tiendaDeporte;

/**
 * @author monse
 * Clase base de Persona
 *
 */
public class Persona {
	public String nombre;
	public String direccion;
	public String telefono;
	
	/* Constructores */
	public Persona() {};
	public Persona(String nombre, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	/* visualiza los datos de la persona por pantalla */
	public void visualizarDatos() {
		System.out.println ("Nombre:" + nombre);
		System.out.println("Direccion:" + direccion);
		System.out.println("Telefono:" + telefono);
	}
	/* Getters y Setters */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
