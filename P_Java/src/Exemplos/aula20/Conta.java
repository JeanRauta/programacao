package Exercicios.aula20;

import java.util.Random;

public class Conta {
   
    String titular;
    String identificador;
    String senha;
    float saldo;
    
    public void depositar(float valor){
        this.saldo+=valor;
        System.out.print("valor depositado com sucesso!");
    };
    
    public String gerarLetrarAleatoria(){
        String identify = "";
        Random ren = new Random();
        int intmax = 65+26; 
        for(int i = 0; i < 4; i++){
            identify += (char)ren.nextInt(65, intmax);
        }
        identify += ren.nextInt(100,500);
        this.identificador = identify;
        return identify;
    }
    
    
    public void sacar(float valor){
        this.saldo-=valor;
        System.out.print("valor sacado com sucesso!");
    }
    
    public String verificarSaldo(){
        String teste = "Titular: " + this.titular + "\n" + "Saldo: " + this.saldo;
        return teste;
    }
    
    
    
}
