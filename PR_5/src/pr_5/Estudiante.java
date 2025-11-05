package pr_5;
/**
* 
* Clase Estudiante
* @author Helen Pérez Condori
* @version 1.0 5/11/2025
*
*/
public class Estudiante {
    private String codEstudiante;
    private String nombre;

    public Estudiante(String codEstudiante, String nombre) {
        this.codEstudiante = codEstudiante;
        this.nombre = nombre;
    }
    public void mostrarInfo() {
        System.out.println("======= DATOS DEL ESTUDIANTE =======");
        System.out.println("Codigo : " + codEstudiante);
        System.out.println("Nombre : " + nombre);
        System.out.println();
    }
    public String getCodEstudiante() {
        return codEstudiante;
    }

    public String getNombre() {
        return nombre;
    }
    
}
