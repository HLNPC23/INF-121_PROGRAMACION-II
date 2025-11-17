package examen;
import java.util.ArrayList;
public class Cabina {
    private int nroCabina;
    private ArrayList<Persona>personasAbordo;

    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personasAbordo = new ArrayList<Persona>();        
    }
    public void agregarPersona(Persona p){
        this.personasAbordo.add(p);        
    } 
}
