
package restauranteapp;


public class ClientePreferencial extends Cliente{
    //ATRIBUTOS
    private Reserva reserva;
    
    
    
    //METODOS
    public void crearReserva(){}
    
    public void modificarReserva(){}
    
    public void eliminarReserva(){}
    
    
    //CONSTRUCTOR POR DEFECTO
    public ClientePreferencial(){}
    
    
    //CONSTRUCTOR ALTERNATIVO
    public ClientePreferencial(Reserva r, String nombre, String telefono, String cedula, boolean isPreferencial){
        
        super(nombre, telefono, cedula, isPreferencial);
        this.reserva = r;

    }

    //GETTERS Y SETTER
    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
