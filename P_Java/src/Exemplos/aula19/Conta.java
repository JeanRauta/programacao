package Exercicios.aula19;

public class Conta {
   
    String titular;
    String senha;
    float saldo;
    
    public void depositar(float valor){
        this.saldo+=valor;
        System.out.print("valor depositado com sucesso!");
    };
    
    public void sacar(float valor){
        this.saldo-=valor;
        System.out.print("valor sacado com sucesso!");
    }
    
    public String verificarSaldo(){
        String teste = "Titular: " + this.titular + "\n" + "Saldo: " + this.saldo;
        return teste;
    }
    
    
    
}
