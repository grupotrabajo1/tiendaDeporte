package tiendaDeporte;

public class Proveedor extends Persona {

    private String nombreProveedor;
    private String apellido1;
    private String apellido2;

    /**
     * @param nombreProveedor nombre del proveedor
     * @param apellido1 apellido 1 del susodicho
     * @param apellido2 apellido 2 del susodicho
     */

    public Proveedor(String nombreProveedor,String apellido1, String apellido2){
        this.setNombreProveedor(nombreProveedor);
        this.setApellido1(apellido1);
        this.setApellido2(apellido2);
    }

    /**
     *
     *
     * @return devuelve los datos del nuevo proveedor
     */

    public Proveedor alta() {
    Proveedor nuevoProveedor = new Proveedor("Pepe","Gomez","Perez");
        return nuevoProveedor;

    }

    /**
     *Todas estas funciones son setters y getters de los atributos
     **/

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }


    void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    /**
     * Funcion que devuelve la informacion de proveedor
     * @return String infromacion
     */
    public String mandarDatos()
    {
    	return "Nombre: "+nombreProveedor+" Apellidos: "+apellido1+" "+apellido2+"\n";
    }

}