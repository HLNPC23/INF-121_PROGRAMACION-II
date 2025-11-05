package pr_5;
/**
* 
* Clase Libro
* @author Helen Pérez Condori
* @version 1.0 5/11/2025
*
*/
import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String tituloL;
    private String iSBN;
    private List<Pagina>paginas;

    public Libro(String tituloL, String iSBN) {
        this.tituloL = tituloL;
        this.iSBN = iSBN;
        this.paginas = new ArrayList<>();
    }

    public String getTituloL() {
        return tituloL;
    }

    public String getiSBN() {
        return iSBN;
    }
    public List<Pagina> getPaginas() {
        return paginas;
    }
    
    public void leer(){
        System.out.println("===== LEYENDO LIBRO =====");
        for(Pagina pag : paginas){
            pag.mostrarContenido();
        }
    }
    public void agregarPagina(Pagina pagina) 
    {
        paginas.add(pagina);
    }
}
