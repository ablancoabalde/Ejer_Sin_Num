package dividir;

public class Dividir {

    public static void main(String[] args) {

        DividirSenExcepcion ds1=new DividirSenExcepcion(5, 2);
        ds1.dividiSenExcepcion();
        ds1.sumar();

        System.out.println("\n************\n");

        DividirSenExcepcion ds2=new DividirSenExcepcion(5, 0);
        ds2.dividiSenExcepcion();
        ds2.sumar();

    }

}
