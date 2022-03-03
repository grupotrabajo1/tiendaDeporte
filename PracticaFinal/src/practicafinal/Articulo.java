/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicafinal;

/**
 *
 * @author Portatil
 */
import java.util.Scanner;
public class Articulo {
    //------atributos----------
    String codigo,descripcion;
    Double precio;

    //------contructor----------
    public Articulo(String codigo, String descripcion, double precio){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precio=precio;
    }
    //---------setter & getter---------------
    public String getCodigo(){
        return codigo;}
    
    public void setCodigo(String codigo){
     this.codigo=codigo;
    }
    
     public String getDescripcion(){
        return descripcion;}
    
    public void setDescripcion(String descripcion){
     this.descripcion=descripcion;
    }
    public Double getPrecio(){
        return precio;}
    
    public void setPrecio(Double precio){
     this.precio=precio;
    }
    public static void VisualizarDatos(Articulo miarticulo){
        System.out.println("codigo de articulo:"+miarticulo.getCodigo());
        System.out.println("descripcion de articulo:"+miarticulo.getDescripcion());
        System.out.println("precio de articulo:"+miarticulo.getPrecio());
 
    }
    
     public static Articulo Alta()
     {
       Scanner sc = new Scanner(System.in);
       String codigo,descripcion;
       Double precio;
        System.out.println("Introduce el código para este artículo: ");
        codigo=sc.nextLine();
        System.out.println("Introduce la descripción para este artículo: ");
        descripcion =sc.nextLine();
        System.out.println("Introduce el precio para este artículo: ");
        precio=sc.nextDouble();
        Articulo miArticulo= new Articulo(codigo, descripcion, precio);
        return miArticulo;
     }  //fin Funcion articulo
    
    
}//fin clase articulo
