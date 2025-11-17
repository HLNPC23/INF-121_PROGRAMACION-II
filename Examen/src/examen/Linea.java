package examen;
import java.util.ArrayList;
public class Linea {
    private String color;
    private ArrayList<Persona>filaPersonas;
    private ArrayList<Cabina>cabinas;
    private int cantidadCabinas;

    public Linea(String color) {
        this.color = color;
        this.filaPersonas = new ArrayList<Persona>();
        this.cabinas = new ArrayList<Cabina>();
        
    }
    public void agregarPersona(Persona p){
        this.filaPersonas.add(p);
    }
    public void agregarCabina(Cabina nroCab)
    {
        this.cabinas.add(nroCab);
    }
    
    
    
    
}
