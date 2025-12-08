package examen_final;

import java.io.File;
import java.util.ArrayList;

public class Consultorio {
     private String consultas, medicos;
     
     public Consultorio(String consultas, String medicos) {
        this.consultas = consultas;
        this.medicos = medicos;
    }
    public Consultorio() {
        this.consultas = "";
        this.medicos = "";
    }

    public String getConsultas() {
        return consultas;
    }

    public void setConsultas(String consultas) {
        this.consultas = consultas;
    }

    public String getMedicos() {
        return medicos;
    }

    public void setMedicos(String medicos) {
        this.medicos = medicos;
    }
        public void agregarMedico(Medico m){
        m.alta();
    }
    
    public void agregarConsulta(Consulta c){
        c.alta();
    }
    
    public void mostrarMedico(){
        ArrayList<Medico> lista = new ArrayList<Medico>();
        
        File carpeta = new File(this.medicos);
        File[] archivos = carpeta.listFiles();
        
        for(File f: archivos){
            Medico nuevo = new Medico();
            nuevo.carga(f.getPath());
            lista.add(nuevo);
        }
        
        for(Medico f: lista){
            System.out.println(f);
        }
        
    }
    
    public void mostrarConsulta(){
        ArrayList<Consulta> lista = this.cargarConsulta();
        
        for(Consulta p: lista){
            System.out.println(p);
        }
    }
  
    public ArrayList<Medico> cargarMedico(){
        ArrayList<Medico> lista = new ArrayList<Medico>();
        
        File carpeta = new File(this.medicos);
        File[] archivos = carpeta.listFiles();
        
        for(File f: archivos){
            Medico nuevo = new Medico();
            nuevo.carga(f.getPath());
            lista.add(nuevo);
        }
        return lista;
    }
    public ArrayList<Consulta> cargarConsulta(){
        ArrayList<Consulta> lista = new ArrayList<Consulta>();
        
        File carpeta = new File(this.consultas);
        File[] archivos = carpeta.listFiles();
        for(File f: archivos){
            Consulta nuevo = new Consulta();
            nuevo.carga(f.getPath());
            lista.add(nuevo);
        }
        return lista;
    }
    
    public void incisoB(String nombreX, String apellidoY){
        ArrayList<Medico> med = this.cargarMedico();
        int idBuscado = -1;
        
        for(Medico m: med){
            if(m.getNombreMed().equals(nombreX)&& m.getApellidoMed().equals(apellidoY)){
                idBuscado = m.getIdMed();
                m.baja();
            }
        }
        
        if(idBuscado != -1){
            ArrayList<Consulta> cons = this.cargarConsulta();
            
            for(Consulta c: cons){
                if(c.getIdMed()== idBuscado){
                    c.baja();
                }
            }
        }else{
            System.out.println("--CONSULTA NO ENCONTRADA ("+nombreX+ " "+apellidoY+")");
        }
    }
}
