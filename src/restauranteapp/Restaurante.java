
package restauranteapp;

import java.util.List;


public class Restaurante {
    
    //ATRIBUTOS
    private List<Mesa> mesa;
    private List<Producto> plato;
    private List<ClientePreferencial> preferencial;
    private List<Producto> producto;
    private Pedido pedido;
    private Factura cuenta;
    
    
    //CONSTRUCTOR POR DEFECTO
    public Restaurante(){}
    
    
    //METODOS
    public void crearMenu(String s){
        
    
    }
    
    public void modificarMenu(){}
    
    public void disponibilidadPlatos(Producto p){}
    
    public void crearClientePreferencial(){}
    
    public void modificarClientePreferencial(ClientePreferencial anterior, ClientePreferencial modificar, Restaurante r){
     
            
            for (int i = 0; i < r.getPreferencial().size(); i++) {
                
                if(anterior == r.getPreferencial()){
                   
                    r.getPreferencial().remove(i);
                    r.getPreferencial().add(modificar);
                    
                }
            
            }
            
    }
    
    public void gestionarPedido(){}
    
    public void gestionarFactura(){}

    public void gestionarReserva(){}

    
    //GETTERS Y SETTERS
    public List<Mesa> getMesa() {
        return mesa;
    }

    public void setMesa(List<Mesa> mesa) {
        this.mesa = mesa;
    }

    public List<Producto> getPlato() {
        return plato;
    }

    public void setPlato(List<Producto> plato) {
        this.plato = plato;
    }

    public List<ClientePreferencial> getPreferencial() {
        return preferencial;
    }

    public void setPreferencial(List<ClientePreferencial> preferencial) {
        this.preferencial = preferencial;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Factura getCuenta() {
        return cuenta;
    }

    public void setCuenta(Factura cuenta) {
        this.cuenta = cuenta;
    }

    void crearClientePreferencial(ClientePreferencial cp, Restaurante r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
    
    
    
}
