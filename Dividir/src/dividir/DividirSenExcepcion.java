package dividir;

public class DividirSenExcepcion {

    private int numerador;
    private int denominador;

    public DividirSenExcepcion(int numerador, int denominador) {
        this.numerador=numerador;
        this.denominador=denominador;
    }

    public void dividiSenExcepcion() {
        try {
            int resposta=numerador/denominador;
            System.out.println(numerador+" / "+denominador+" = "+resposta);
        } catch (Exception e) {
            System.out.println("Non se pode dividir entre 0");
        }finally{
            System.out.println("Bloque final que se ejecuta siempre, su objetivo es evitar "
                    + "acciones no deseadas");
        }

    }

    public void sumar() {
        System.out.println("suma = "+(numerador+denominador));
    }
}
