
package contabancaria;

public class Conta {
    private String nome;
    private String nConta;
    private double saldo;
    // Constructores
    public Conta(){
        
    }
    public Conta(String nome, String nConta, double saldo){
        this.nome=nome;
        this.nConta=nConta;
        this.saldo=saldo;   
    }
    // Metodos SET y GET
    public void setnome(String nome){
      this.nome=nome;
     }
  
    public void setnConta(String nConta){
      this.nConta=nConta;
     }
  
    public String getnConta(){
      return nConta;
    }
    public void setsaldo (double saldo){
      this.saldo=saldo;
     }
  
    public double getsaldo(){
      return saldo;
    }
    // Funciones
    
    public void metodIngreso(double ingreDinero){
        this.saldo += ingreDinero;
//        System.out.println("Su saldo es: " + saldo + " ingresa " + ingreDinero + " euros " + 
//            " su saldo total es "+ this.saldo);
        
         
    }
    public void metodRetirar(double retirDinero){
        this.saldo -= retirDinero;
//        System.out.println("Su saldo es: " + saldo + " retira " + retirDinero + " euros " + 
//           " su saldo total es " + this.saldo);    
    }  
   
    public String tostring(){
        return ("Nombre " + this.nome + " nCuenta " + this.nConta + " saldo " + this.saldo);
    
    }
    public void anularConta(){
        nome=null;
        this.nConta=null;
        this.saldo=0;
    }
    public void anularConta(Conta obj){
        nome=null;
        this.nConta=null;
        this.saldo=0;
    }
}
