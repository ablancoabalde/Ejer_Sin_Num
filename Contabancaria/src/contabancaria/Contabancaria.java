
package contabancaria;

import java.util.Scanner;

public class Contabancaria {
// Codifica un programa para xestionar unha conta bancaria. Para iso crea una clase, Conta, con 3 atributos
    // nome, nConta, saldo (tipo double).
    // Constructores por defecto y por parametros. 
    // Metodos de acceso para o nº de conta, metodo para recibir o nome da conta e para mudar o saldo.
    // Metodo, que reciba una cantidad de cartos, e os ingrese na nosa conta e devolva o saldo final.
    // Metodo que reciba una cantida de cartos e os retire da nosa conta devolvendo o saldo total.( ainda que non
    // teña cartos na conta o banco lo da y quedaría el saldo negativo.
        
    public static void main(String[] args) {
        Conta cuenta = new Conta();
        cuenta.setnConta("1234");
        cuenta.setsaldo(5000000);
        
        System.out.println(cuenta.tostring()+ "\n");
                
        Conta cuenta2 = new Conta("Ana","22222",5000);
        Scanner entrada= new Scanner (System.in);
        
        System.out.println(cuenta2.tostring() + "\n");      
        
        Conta cuenta3 = new Conta();
        
        System.out.println("Nombre");
        cuenta3.setnome(entrada.nextLine());// el metodo nextline coge toda la linea
        System.out.println("Número de cuenta");
        cuenta3.setnConta(entrada.next());// el metodo next lo coge por columnas
        System.out.println("Saldo");
        cuenta3.setsaldo(entrada.nextDouble());      
        
        System.out.println("Dinero a ingresar \n");        
        
        cuenta3.metodIngreso(entrada.nextDouble());
        
        System.out.println("Saldo total " + cuenta3.getsaldo());
        
        System.out.println("Dinero a retirar \n" );
        
        cuenta3.metodRetirar(entrada.nextDouble());
        
        System.out.println("Saldo total " + cuenta3.getsaldo());
        
        cuenta3.anularConta();
        
        System.out.println(cuenta3.tostring());
        
        cuenta2.anularConta();
        
        System.out.println(cuenta2.tostring());
        
    }
    
}
