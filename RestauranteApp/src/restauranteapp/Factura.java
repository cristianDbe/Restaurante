
package restauranteapp;

import java.io.Serializable;


public class Factura implements Serializable{
  
    
    //ATRIBUTOS
    private long totalCuenta;
    private double iva;
    private long propina;
    
    
    //CONSTRUCTOR POR DEFECTO
    public Factura(){}
    
    //CONSTRUCTOR ALTERNATIVO
    public Factura(long totalCuenta, double iva, long propina){
    
        this.totalCuenta = totalCuenta;
        this.iva = iva;
        this.propina = propina;
        
    }
    
    
    //GETTERS Y SETTERS
    public long getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(long totalCuenta) {
        this.totalCuenta = totalCuenta;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public long getPropina() {
        return propina;
    }

    public void setPropina(long propina) {
        this.propina = propina;
    }
    
}
