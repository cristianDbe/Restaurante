
package restauranteapp;


public class RestauranteApp {

 
    public static void main(String[] args) {
            
            Restaurante r = new Restaurante();
            Reserva re = new Reserva();
            ClientePreferencial cp = new ClientePreferencial(re, "Edwin", "33333");
            
            r.crearClientePreferencial(cp, r);
           
      
            
    }
    
}
