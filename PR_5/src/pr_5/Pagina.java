package pr_5;
/**
* 
* Clase Pagina
* @author Helen Pérez Condori
* @version 1.0 5/11/2025
*
*/
public class Pagina {
    private int nroPagina;
    private String contenido;

    public Pagina(int nroPagina, String contenido) {
        this.nroPagina = nroPagina;
        this.contenido = contenido;
    }

    public int getNroPagina() {
        return nroPagina;
    }

    public String getContenido() {
        return contenido;
    }
    
    public void mostrarContenido() {
        System.out.println("======= PAGINA =======");
        System.out.println("Numero de Paginas : " + nroPagina);
        System.out.println("Contenido : " + contenido);
        System.out.println();
    }    
}
