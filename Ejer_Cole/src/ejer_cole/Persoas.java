
package ejer_cole;

public class Persoas {
    
    private String nome;
    private String dir;
    private String nCole;
    private int nivel;

    public Persoas(String nome, String dir) {
        this.nome=nome;
        this.dir=dir;
    }

    public Persoas(String nome, String dir, String nCole, int nivel) {
        this.nome=nome;
        this.dir=dir;
        this.nCole=nCole;
        this.nivel=nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir=dir;
    }

    public String getnCole() {
        return nCole;
    }

    public void setnCole(String nCole) {
        this.nCole=nCole;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel=nivel;
    }

    @Override
    public String toString() {
        return "nome="+nome+", dir="+dir+", nCole="+nCole+", nivel="+nivel;

    }
}
