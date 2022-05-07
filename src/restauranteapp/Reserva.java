
package restauranteapp;

import java.util.Date;


class Reserva {
    
    //ATRIBUTOS
    private Date fecha;
    private int numMesa;
    
    //CONSTRUCTOR POR DEFECTO
    public Reserva(){}
    
    //CONSTRUCTOR ALTERNATIVO
    public Reserva(Date fecha, int numMesa){
        
        this.fecha = fecha;
        this.numMesa = numMesa;
        
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
    
    
}
