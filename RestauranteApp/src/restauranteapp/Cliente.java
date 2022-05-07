
package restauranteapp;

import java.io.Serializable;


public class Cliente implements Serializable {
    
    //ATRIBUTOS
    private String nombre;
    private String telefono;
    private String cedula;
    private boolean isPreferencial;
    
    //CONSTRUCTOR POR DEFECTO
    public Cliente(){}
    
    //CONSTRUCTOR ALTERNATIVO
    public Cliente(String nombre, String telefono, String cedula, boolean isPreferencial){
       
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
        this.isPreferencial = isPreferencial;
    }

    
    
  
    //SETTER Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isIsPreferencial() {
        return isPreferencial;
    }

    public void setIsPreferencial(boolean isPreferencial) {
        this.isPreferencial = isPreferencial;
    }

}
