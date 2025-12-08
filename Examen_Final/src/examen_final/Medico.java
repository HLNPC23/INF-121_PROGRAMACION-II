
package examen_final;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Medico {
    private int idMed;
    private String nombreMed, apellidoMed;
    private int aniosExperiencia;

    public Medico(int idMed, String nombreMed, String apellidoMed, int aniosExperiencia) {
        this.idMed = idMed;
        this.nombreMed = nombreMed;
        this.apellidoMed = apellidoMed;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Medico() {
        this.idMed = 0;
        this.nombreMed = "";
        this.apellidoMed = "";
        this.aniosExperiencia = 0;
    }
    public void alta() {
        String m = "archivosMedico/med" + this.idMed + ".txt";

        try {
            FileWriter w = new FileWriter(m);
            BufferedWriter es = new BufferedWriter(w);

            es.append(this.idMed + "\n");
            es.append(this.nombreMed + "\n");
            es.append(this.apellidoMed + "\n");
            es.append(this.aniosExperiencia + "");

            es.close();
            w.close();
            System.out.println("\t\t======= ALTA DE MEDICOS CORRECTA =======");

        } catch (Exception e) {
            System.out.println("ERROR EN ALTA DE MEDICOS\n\n" + e);
        }
    }
    
    public void carga(String ruta) {
        try {
            FileReader r = new FileReader(ruta);
            BufferedReader lector = new BufferedReader(r);

            this.idMed = Integer.parseInt(lector.readLine());
            this.nombreMed = lector.readLine();
            this.apellidoMed = lector.readLine();
            this.aniosExperiencia = Integer.parseInt(lector.readLine());
            lector.close();
            r.close();
            System.out.println("\t\t---CARGA DE MEDICO CORRECTA---");

        } catch (Exception e) {
            System.out.println("ERROR EN CARGA DE MEDICOS\n\n" + e);
        }
    }
    
    public void baja() {
        String ruta = "archivosProducto/producto" + this.idMed + ".txt";

        File archivo = new File(ruta);

        if (archivo.delete()) {
            System.out.println("SE HA ELIMINADO CORRECTAMENTE EL ARCHIVO " + archivo.getPath());
        } else {
            System.out.println("ERROR EN LA ELIMINACION DEL ARCHIVO " + archivo.getPath());
        }
    }
    
    
    
    
    
    
    
    
    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public String getNombreMed() {
        return nombreMed;
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    public String getApellidoMed() {
        return apellidoMed;
    }

    public void setApellidoMed(String apellidoMed) {
        this.apellidoMed = apellidoMed;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    
    
}
