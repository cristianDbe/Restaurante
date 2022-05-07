
package restauranteapp;


public class Pedido {

    
    //ATRIBUTOS
    private String plato;
    private String bebida;
    private Producto producto;
    
    //CONSTRUCTOR POR DEFECTO
    public Pedido(){}

    //CONSTRUCTOR ALTERNATIVO
    public Pedido(String plato, String bebida, Producto p){
    
        this.plato = plato;
        this.bebida = bebida;
        this.producto = p;
        
    }
    
    //GETTERS Y SETTERS
    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
    
    
}
