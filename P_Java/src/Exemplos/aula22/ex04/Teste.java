package Exemplos.aula22.ex04;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Teste {
    
    public static float lerNumero (String mensagem){
        Scanner scan = new Scanner(System.in);
        System.out.print(mensagem);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        float teste = n1/n2;
        return teste;
    }
    
    public static void main(String[] args) {
        boolean teste = true;
        do{
         try {
            float res = lerNumero("digite dois numeros: ");
            teste = true;
        } catch ( InputMismatchException erro) {
            System.out.println("nao da letra");
            teste = false;
        }
        catch ( ArithmeticException erro){
            System.out.println("não da pra dividir");
            teste = false;
        }
        }while(!teste);

    }
}
