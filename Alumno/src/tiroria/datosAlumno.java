
package tiroria;

public class datosAlumno {
    private String nombre;
    private datosAcademicos dAca;
    private datosPersonales dPer;
    
    public datosAlumno(){
        
    }
    
    public datosAlumno(String nom,datosAcademicos datosAca, datosPersonales datosPer){
        nombre=nom;
        dAca=datosAca;
        dPer=datosPer;
    }
    
    public void setNombre(String nom){
        nombre=nom;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setdAca(datosAcademicos datos){
        dAca=datos;
    }
    
    public datosAcademicos getdAca(){
        return dAca;
    }
    
    public void setdPer(datosPersonales datos){
        dPer=datos;
    }
    
    public datosPersonales getdPer(){
        return dPer;
    }  
  
    @Override
    public String toString(){
        return nombre + " " + dAca + " " + dPer;
    }
    
    public void busquedaAlumno(datosAlumno dA,String nomb){
        
        
        if(dA.getNombre().equals(nomb)){
            System.out.println("La nota de " + dA.getNombre() + " es " + dA.getdAca().getnota());
        }else{
            System.out.println("Alumno no encontrado");
        }
        
         
    }
    
    
}
