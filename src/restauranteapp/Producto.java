
package restauranteapp;


class Producto {
    
    //ATRIBUTOS
    private String nombre;
    private String tipo;
    private double precio;
    private boolean disponibilidad;
    
    
    //CONTRUCTOR POR DEFECTO
    public Producto(){}
    
    
    //CONSTRUCTO ALTERNATIVO
    public Producto(String nombre, String tipo, double precio, boolean disponibilidad){
        
        this.nombre = nombre;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }
    
    //METODOS
    public void agregarPlato(Producto p){
   
        Restaurante r = new Restaurante();
        r.getPlato().add(p);
        
    }
   
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
