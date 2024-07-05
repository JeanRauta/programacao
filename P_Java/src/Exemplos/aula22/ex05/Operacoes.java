package Exemplos.aula22.ex05;

public class Operacoes {
    public int divide(int n1, int n2) throws ArithmeticException{
        if(n2==0){
            throw new ArithmeticException("nao pd dividir por zero");
        }
        return n1/n2;
    }
}
