
package tiroria;

public class datosAcademicos {
    private String referencia;
    private int nota;
    
    public datosAcademicos(){
        
    }
    
    public datosAcademicos(String ref, int nota){
        referencia= ref;
        this.nota=nota;
    }
    
    public void setReferencia(String ref){
        referencia=ref;
    }
    
    public String getReferencia(){
        return referencia;
    }
    
    public void setNota(int not){
        nota=not;
    }
    
    public int getnota(){
        return nota;
    }
    
    
    @Override
    public String toString(){
        return referencia + " " + nota;
    }
            
}
