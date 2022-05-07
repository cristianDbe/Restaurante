
package restauranteapp;


public class Mesa {
    
    //ATRIBUTOS
    private int numMesa;
    
    //CONSTRUCTOR POR DEFECTO
    public Mesa(){}
    
    //CONSTRUCTOR ALTERNATIVO
    public Mesa(int numMesa){
    
        this.numMesa = numMesa;
        
    }
    
    //GETTERS Y SETTERS
    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }
    
    
}
