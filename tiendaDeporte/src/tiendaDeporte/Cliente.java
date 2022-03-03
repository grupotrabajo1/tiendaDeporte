package tiendaDeporte;

public class Cliente extends Persona{

    //atributo de tipoCliente de la clase tipo ENUM
    private TipoCliente tipoCliente;

    public Cliente(){
        super();
    }

    //Contructor de la clase cliente
    public Cliente(String nombre, String direccion, String telefono, TipoCliente tipoCliente){
        super(nombre, direccion, telefono);
        this.tipoCliente = tipoCliente;
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
        return "Cliente{" +
                "nombre='" + nombre + ''' +
        ", direccion='" + direccion + ''' +
        ", telefono='" + telefono + ''' +
        '}';
    }
}