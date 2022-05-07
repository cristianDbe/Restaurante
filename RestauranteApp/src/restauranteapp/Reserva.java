
package restauranteapp;

import java.io.Serializable;
import java.util.Date;


public class Reserva implements Serializable {
    
    //ATRIBUTOS
    private Date fecha;
    private int numMesa;
    private int hora;
    private String nombreCliente;
    
    //CONSTRUCTOR POR DEFECTO
    public Reserva(){}
    
    //CONSTRUCTOR ALTERNATIVO
    public Reserva(Date fecha, int numMesa, int hora, String nombreCliente){
        
        this.fecha = fecha;
        this.numMesa = numMesa;
        this.hora = hora;
        this.nombreCliente = nombreCliente;
        
    }
    
    
    //GETTERS Y SETTERS
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
}
