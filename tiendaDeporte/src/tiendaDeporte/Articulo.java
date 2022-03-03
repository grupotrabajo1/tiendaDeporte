package tiendaDeporte;

public class Articulo{
    private String codigo, descripcion;
    private double precio;

    public Articulo(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Articulo() {
        codigo = "''";
        descripcion = "''";
        precio = 0;
    }

    /**
     * Introduce los datos para un nuevo cliente
     * @param codigo String codigo del producto
     * @param descripcion String descripcion del articulo
     * @param precio double precio del articulo
     */

    public void alta(String codigo, String descripcion, double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /************************************
     * Visualiza los datos del articulo *
     ***********************************/
    public void visualizarDatos(){
        System.out.println("Codigo:" + codigo+ ", descripcion: " + descripcion+", precio: " +precio);
    }

    /**
     * Funcion para devolver los valores de un Articulo (como hacer un toString)
     * @return String de los valores del articulo
     */
    public String devolverDatos(){
        return "Codigo:" + codigo+ ", descripcion: " + descripcion+", precio: " +precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
