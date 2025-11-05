package pr_5;
/**
* 
* Clase Autor
* @author Helen Pérez Condori
* @version 1.0 5/11/2025
*
*/
public class Autor {
    private String nombreA;
    private String nacionalidad;

    public Autor(String nombreA, String nacionalidad) {
        this.nombreA = nombreA;
        this.nacionalidad = nacionalidad;
    }
    public void mostrarInfo() {
        System.out.println("======= DATOS DEL AUTOR =======");
        System.out.println("Nombre : " + nombreA);
        System.out.println("Nacionalidad : " + nacionalidad);  
        System.out.println();
    }

    public String getNombreA() {
        return nombreA;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
