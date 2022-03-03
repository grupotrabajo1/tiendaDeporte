package tiendaDeporte;

public class Cliente extends Persona{

    //atributo de tipoCliente de la clase tipo ENUM
    enum TipoCliente
    {
    	Potencial,
    	Nuevo,
    	Vip,
    	Moroso
    }
	
    TipoCliente tipo;
    
    public Cliente(){
        super();
    }

    //Contructor de la clase cliente
    public Cliente(String nombre, String direccion, String telefono, TipoCliente tipo){
        super(nombre, direccion, telefono);
        this.tipo = tipo;
    }

    //metodo para dar de alta a un cliente
    public void alta(String nombre, String direccion, String telefono){
        super.setDireccion(direccion);
        super.setNombre(nombre);
        super.setTelefono(telefono);
    }
    


    //metodo to string que se utilizará en la clase principal para mostrar todos los datos por pantalla
    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" Direccion: "+getDireccion()+" Telefono: "+getTelefono()+" Tipo Cliente: "+ tipo+ "\n";
    }
}