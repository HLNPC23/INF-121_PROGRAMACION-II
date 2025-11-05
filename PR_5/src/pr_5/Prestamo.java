package pr_5;
/**
* 
* Clase Prestamo
* @author Helen Pérez Condori
* @version 1.0 5/11/2025
*
*/
public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(String fechaPrestamo, String fechaDevolucion, Estudiante estudiante, Libro libro) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estudiante = estudiante;
        this.libro = libro;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Libro getLibro() {
        return libro;
    }
    
    public void mostrarInfo(){
        System.out.println("======= PRESTAMO =======");
        System.out.println("======= DATOS DEL PRESTAMO =======");
        System.out.println("Fecha de prestamo: " + fechaPrestamo);
        System.out.println("Fecha de devolucion: " + fechaDevolucion);
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Codigo del estudiante: " + estudiante.getCodEstudiante());
        System.out.println("Nombre del Libro: " + libro.getTituloL());
        System.out.println("ISBN: " + libro.getiSBN());
    }

    
}
