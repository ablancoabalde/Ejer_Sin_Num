
package tiroria;

public class datosPersonales {
    private String direccion;
    private String telefono;
    
    public datosPersonales(){
        
    }
    public datosPersonales(String dir, String telf){
        direccion=dir;
        telefono=telf;
    }
    
    public void setDireccion(String direc){
        direccion=direc;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setTelefono(String telf){
        telefono=telf;
    }
    
    public String getTelefono(){
        return telefono;
    }
    

    @Override
    public String toString(){
        return direccion + " " + telefono;
    }
    
}
