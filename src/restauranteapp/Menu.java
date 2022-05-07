
package restauranteapp;


public class Menu {
   
    //ATRIBUTOS
    private String plato;
    
    
    //CONTRUCTOR POR DEFECTO
    public Menu(){}

    
    //CONSTRUCTOR ALTERNATIVO
    public Menu(String plato){
        
        this.plato = plato;
        
    }
   
    //SETTERS Y GETTERS
    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }
    
    
    
}
