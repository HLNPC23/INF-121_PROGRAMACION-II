package examen_final;
public class Examen_Final {
    public static void main(String[] args) {
        Medico m1 = new Medico(1, "Juan", "Martinez", 7);
        Medico m2 = new Medico(2, "Maria", "Torrez", 5);
        Medico m3 = new Medico(3, "Leo", "Flores", 1);
        Consulta c1 = new Consulta(8979879,"Jose", "Marquez",2, 23, "Julio", 2025);
        Consulta c2 = new Consulta(8979879,"Mar", "Soliz",1, 1, "Enero", 2025);
        Consulta c3 = new Consulta(8979879,"Sol", "Flores",2, 23, "Febrero", 2025);
        Consulta c4 = new Consulta(8979879,"Luna", "Romero",3, 23, "Marzo", 2025);
        Consulta c5 = new Consulta(8979879,"Josefina", "Quispe",2, 23, "Abril", 2025);
        Consulta c6 = new Consulta(8979879,"Luiz", "Lupe",1, 23, "Mayo", 2025);
        Consulta c7 = new Consulta(8979879,"Marco", "Remedios",1, 23, "Junio", 2025);
        Consulta c8 = new Consulta(8979879,"Jade", "Paz",1, 23, "Agosto", 2025);
        Consulta c9 = new Consulta(8979879,"Luiz", "Torrez",2, 23, "Septiembre", 2025);
        c1.alta();
        c2.alta();
        c3.alta();
        c4.alta();
        c5.alta();
        c6.alta();
        c7.alta();
        c8.alta();
        c9.alta();    
        m1.alta();
        m2.alta();
        m3.alta();
        Consultorio cons = new Consultorio("archivosMedico","archivosConsultas" );
        cons.mostrarConsulta();
        cons.mostrarMedico();
//
    }
    
}
