package Exemplos.aula22.ex05;

public class Calc {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        try{
            System.out.println(op.divide(5, 0));
            
        }catch(ArithmeticException error){
            System.out.println("nao da!");
        }
    }
}
