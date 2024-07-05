package Exemplos.aula22.ex03;

public class Teste {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        System.out.print("Somando dois numeros " + op.soma(5,7));
        System.out.print("Somando tres numeros " + op.soma(1, 2 , 3));
        System.out.print("Palvras" + op.soma("teste","teste"));
    }
}
