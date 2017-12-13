
package ejer_cole;

public class Ejer_Cole {

    public static void main(String[] args) {
        
        Estudante est1=new Estudante("Pepito", "Calle de abajo", "Cole1", 8);
        Ensinante ens1=new Ensinante("Manuel", "Calle de arriba", "Ciencias");
        E_Internacional ei1=new E_Internacional("Rusia", "Vasilov", "Calle del centro", "Cole1", 8);

        System.out.println(est1.toString());
        System.out.println(ens1.toString());
        System.out.println(ei1.toString());
        
        est1.setNivel(10);
        ens1.setMateria("Biología");
        System.out.println("\n");
        System.out.println(est1.toString());
        System.out.println(ens1.toString());
    }
    
}
