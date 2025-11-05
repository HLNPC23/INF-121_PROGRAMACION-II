package pr_5;
/**
* 
* Clase Horario
* @author Helen Pérez Condori
* @version 1.0 5/11/2025
*
*/
public class Horario {
    private String diasApertura;
    private String horaApertura;
    private String horaCierre;

    public Horario(String diasApertura, String horaApertura, String horaCierre) {
        this.diasApertura = diasApertura;
        this.horaApertura = horaApertura;
       this.horaCierre = horaCierre;
    }

    public String getDiasApertura() {
        return diasApertura;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }
    
    
    public void mostrarHorario() {
        System.out.println("======== HORARIO ========");
        System.out.println("Dias de Apertura: " + diasApertura);
        System.out.println("Hora de Apertura: " + horaApertura);
        System.out.println("Hora de Cierre: " + horaCierre);
        System.out.println();
    }   
}
