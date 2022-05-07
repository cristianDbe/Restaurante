
package restauranteapp;

import java.io.Serializable;
import java.util.ArrayList;


public class Pedido implements Serializable{

    //ATRIBUTOS
    private ArrayList<Producto> productos   = new ArrayList<>();
    private ArrayList<Integer> cantidades = new ArrayList<>();
    private int mesa;
    
    //CONSTRUCTOR POR DEFECTO
    public Pedido(){}

    //CONSTRUCTOR ALTERNATIVO
    public Pedido(int mesa){
        this.mesa = mesa;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
    
    //agragar productos individuales
    public void addProducto(Producto p)
    {
        productos.add(p);
    }
    
    public void addCantidad(int c)
    {
        cantidades.add(c);
    }
    
    //cantidad de productos del pedido
    public int nProductos()
    {
        return productos.size();
    }
    
    public String getProducto(int index)
    {
        return productos.get(index).getNombre() + " " + cantidades.get(index) + " " + productos.get(index).getPrecio()*cantidades.get(index);
    }
    
    public double calcularTotal()
    {
        double total = 0;
        
        for(int i=0; i<productos.size(); i++)
        {
            total += productos.get(i).getPrecio()*cantidades.get(i);
        }
        
        return total;
    }
    
}
