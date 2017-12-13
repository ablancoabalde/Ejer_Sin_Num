
package tiroria;

public class Titoria {

    public static void main(String[] args) {
        datosPersonales dtp12 = new datosPersonales("c/raposa","986474747");
        datosAcademicos dta1 = new datosAcademicos("A45451",8);
        datosAlumno alumno1 = new datosAlumno("Alberto",dta1,dtp12);
        datosAlumno metodo1 = new datosAlumno ();
        
        
        System.out.println(alumno1.toString());
        
        metodo1.busquedaAlumno(alumno1,"Alberto");
        
    }
    
}
