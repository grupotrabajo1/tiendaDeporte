package tiendaDeporte;

public class Cliente extends Persona{

    /**
     * Atributo ENUM con los valores validos
     */
    enum TipoCliente
    {
        Potencial,
        Nuevo,
        Vip,
        Moroso
    }

    TipoCliente tipo;

    /**
     * Constructor vacío
     */
    public Cliente(){
        super();
    }


    /**
     * Constructor de Cliente con los parametros necesarios
     * @param nombre String nombre del cliente
     * @param direccion String direccion del cliente
     * @param telefono String telefono del cliente
     * @param tipo TipoCliente tipo de cliente
     */
    public Cliente(String nombre, String direccion, String telefono, TipoCliente tipo){
        super(nombre, direccion, telefono);
        this.tipo = tipo;
    }

    /**
     * Método para dar de alta a un cliente
     * @param nombre String nombre del cliente
     * @param direccion String direccion del cliente
     * @param telefono String telefono del cliente
     */
    public void alta(String nombre, String direccion, String telefono){
        super.setDireccion(direccion);
        super.setNombre(nombre);
        super.setTelefono(telefono);
    }

    /**
     * Metodo to string que se utilizara en la clase principal para mostrar todos los datos por pantalla
     * @return
     */
    @Override
    public String toString() {
    	return "Nombre: "+getNombre()+" Direccion: "+getDireccion()+" Telefono: "+getTelefono()+" Tipo Cliente: "+ tipo+ "\n";
    }
}
