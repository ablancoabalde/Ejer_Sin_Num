
package ejer_cole;

public class E_Internacional extends Persoas {
    
    private String Pais;

    public E_Internacional(String Pais, String nome, String dir, String nCole, int nivel) {
        super(nome, dir, nCole, nivel);
        this.Pais=Pais;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais=Pais;
    }

    @Override
    public String toString() {
        return super.toString()+"Pais="+Pais;
    }
}
