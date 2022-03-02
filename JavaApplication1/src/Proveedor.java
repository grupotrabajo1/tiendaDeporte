/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author domen
 */
public class Proveedor extends Persona{
    public Proveedor() {
    }

    public Proveedor(String nombre, String direccion, String telefono) {
        super(nombre, direccion, telefono);
    }

    public void DarAlta(String nombre, String direccion, String telefono)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

    }
}
            
    
    
    
    


