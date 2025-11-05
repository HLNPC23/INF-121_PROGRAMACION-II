package pr_5;
/**
* 
* Clase Biblioteca
* @author Helen Pérez Condori
* @version 1.0 5/11/2025
*
*/
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombreB;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamo;
    private Horario horario;

    public Biblioteca(String nombreB, Horario horario) {
        this.nombreB = nombreB;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamo = new ArrayList<>();
        this.horario = horario;
    }
    public void agregarLibro(Libro libro)
    {
        libros.add(libro);
        System.out.println("Libro Agregado!");
    }
    public void agregarAutor(Autor autor)
    {
        autores.add(autor);
        System.out.println("Autor Agregado!");
    }
    public void prestarLibro(Estudiante estudiante, Libro libro)
    {
        String fechaPrestamo = "00/00/0000";
        String fechaDevolucion = "00/00/0000";
        Prestamo p1 = new Prestamo(fechaPrestamo, fechaDevolucion, estudiante, libro);
        prestamo.add(p1);
        System.out.println("Pretamo exitoso!");
    }
    public void mostrarEstado(){
        System.out.println("======= BIBLIOTECA"+ this.nombreB+" =======");
        horario.mostrarHorario();
        System.out.println("======= LIBROS DISPONIBLES =======");
        for(Libro l : libros){
            System.out.println("- "+l.getTituloL());
            System.out.println("  ISBN: "+l.getiSBN());
        }
        System.out.println("======= AUTORES REGISTRADOS =======");
        for(Autor a : autores){
            System.out.println("- "+a.getNombreA());
            System.out.println("  Nacionalidad: "+a.getNacionalidad());
        }
        System.out.println("======= PRESTAMOS EN CURSO =======");
        for(Prestamo p : prestamo){
            p.mostrarInfo();
        }
    }
    public void cerrarBiblioteca()
    {
        prestamo.clear();
        System.out.println("La biblioteca Cerro");        
    }
    
    
}
