package pr_5;
/**
* 
* Main
* @author Helen Pérez Condori
* @version 1.0 5/11/2025
*
*/
public class PR_5 {
    public static void main(String[] args) {
        Horario h1 = new Horario("Lunes a Viernes", "08:00", "12:00");
        Horario h2 = new Horario("Lunes a Viernes", "14:00", "18:00");
        Horario h3 = new Horario("Sabado", "09:00", "13:00");
        Horario h4 = new Horario("Domingo", "10:00", "14:00");
        
        Biblioteca b1 = new Biblioteca(" CENTRAL", h1);
        Biblioteca b2 = new Biblioteca(" NORTE", h2);
        Biblioteca b3 = new Biblioteca(" SUR", h3);
        Biblioteca b4 = new Biblioteca(" ESTE", h4); 
        
        Autor a1 = new Autor("Gabriel Garcia Marquez", "Colombiano");
        Autor a2 = new Autor("Isabel Allende", "Chilena");
        Autor a3 = new Autor("J.K. Rowling", "Britanica");
        Autor a4 = new Autor("Mario Vargas Llosa", "Peruano");
        
        b1.agregarAutor(a1);
        b1.agregarAutor(a2);
        b2.agregarAutor(a3);
        b3.agregarAutor(a4);
        
        Libro l1 = new Libro("Cien Anios de Soledad", "123-456");
        l1.agregarPagina(new Pagina(1, "Prologo de Cien Anios de Soledad"));
        l1.agregarPagina(new Pagina(2, "Capitulo 1: Mucho despues"));

        Libro l2 = new Libro("La Casa de los Espiritus", "789-012");
        l2.agregarPagina(new Pagina(1, "Prologo de La Casa de los Espiritus"));
        l2.agregarPagina(new Pagina(2, "Capitulo 1: Rosa del Valle"));

        Libro l3 = new Libro("Harry Potter y la Piedra Filosofal", "345-678");
        l3.agregarPagina(new Pagina(1, "Capítulo 1: El niño que vivio"));
        l3.agregarPagina(new Pagina(2, "Capítulo 2: La cicatriz"));

        Libro l4 = new Libro("La ciudad y los perros", "901-234");
        l4.agregarPagina(new Pagina(1, "Capítulo 1: La llegada"));
        l4.agregarPagina(new Pagina(2, "Capítulo 2: El colegio"));
        
        b1.agregarLibro(l1);
        b1.agregarLibro(l2);
        b2.agregarLibro(l3);
        b3.agregarLibro(l4);
        
        Estudiante e1 = new Estudiante("E001", "Juan Perez");
        Estudiante e2 = new Estudiante("E002", "Maria Gomez");
        
        b1.prestarLibro(e1, l2);
        b2.prestarLibro(e2, l3);
        
        b1.mostrarEstado();
        b2.mostrarEstado();
        b3.mostrarEstado();
        b4.mostrarEstado();
        
        b1.cerrarBiblioteca();
        b2.cerrarBiblioteca();
        
        b1.mostrarEstado();
        b2.mostrarEstado();
        

    }
    
}
