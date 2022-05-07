
package restauranteapp;


public class Tarjeta {
    
    //ATRIBUTOS
    private String nombre;
    private long id;
    
   
    //CONSTRUCTOR POR DEFECTO
    public Tarjeta(){}
    
    
    //CONSTRUCTOR ALTERNATIVO
    public Tarjeta(String nombre, long id){
        
        this.id = id;
        this.nombre = nombre;
        
    }
    
    //METODOS
    public float descuentoPagar(){
        return 0;
    }
    
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
