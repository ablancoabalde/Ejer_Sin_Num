
package ejer_cole;

public class Ensinante extends Persoas{
        private String materia;

    public Ensinante(String materia, String nome, String dir) {
        super(nome, dir);
        this.materia=materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia=materia;
    }

    @Override
    public String toString() {
        return super.toString()+"materia="+materia;
    }
}
