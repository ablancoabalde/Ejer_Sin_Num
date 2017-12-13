
package ejerprog_caja;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class EjerProg_caja {

    public static void main(String[] args) {
        
        int numCoca,numAgua;
        float preCoca=2.55F, preAgua=1.10F, total, entregado;
        
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("Bar");
        
        System.out.println("¿Cocacolas consumidas?");
        numCoca= entrada.nextInt();
        System.out.println("¿Aguas consumidas?");
        numAgua= entrada.nextInt();        
        
        total= numCoca*preCoca + numAgua*preAgua;
        System.out.println("Total a pagar " + total);
        
        System.out.println("Dinero entregado");
        entregado = entrada.nextFloat();
        
        BigDecimal bd = new BigDecimal(entregado - total);// objeto para reducir decimales
        bd = bd.setScale(2, RoundingMode.HALF_UP);//ponemos el valor de los decimales que queremos poner, y luego legimos el modo
        // de redondeo
        
        System.out.println("Su cambio " + bd + " euros, Gracias por venir");
        
        
    }
    
}
