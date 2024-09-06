package Exemplos.aula31.ex02;

public class Main {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(10);
        
        
        v1.adiciona("A");
        v1.adiciona("B");
        v1.adiciona("C");
        v1.adiciona("D");
        System.out.println("tamanho de v1: " + v1.getTamanho());
        System.out.println("Apagando elemento " + v1.remove());
        System.out.println("tamanho de v1: " + v1.getTamanho());
        System.out.println(v1);
        
        Lista l1 = new Vetor(5);
        
        l1.adiciona("teste");
        l1.remove();
    }
}
