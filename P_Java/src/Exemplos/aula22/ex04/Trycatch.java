package Exemplos.aula22.ex04;

import java.util.InputMismatchException;


public class Trycatch {
    
    public static void main(String[] args) {
        try {
             System.out.print("Digite um numero: ");
            int n1 = 1;
            int n2 = 0;
            int teste = n1/n2;
        } catch ( InputMismatchException erro) {
            System.out.println("nao da letra");
        }
        catch ( ArithmeticException erro){
            System.out.println("não da pra dividir");
        }
       
        
     
    }
    
}
