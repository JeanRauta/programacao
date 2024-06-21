package Exemplos.aula20.teste4;

public class Principal {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("joao" , "silva", 123);
//        m1.setNome("joão");
//        m1.setSobrenome("silva");
//        m1.setMatricula(123);
//        m1.setSalario(1200);
        System.out.println("Nome motorista:" +m1.getNome()+" "+m1.getSobrenome());
        System.out.println("recebe "+ String.format("%.2f", m1.getSalario()));
        
        Engenheiro m2 = new Engenheiro("nick" , "lamb" , 124);
//        m2.setNome("nick");
//        m2.setSobrenome("lamb");
//        m2.setMatricula(124);
//        m2.setSalario(300000);
//        m2.setCrea("teste");
        System.out.println("Nome Engenheiro:" +m2.getNome()+" "+m2.getSobrenome());
        System.out.println("recebe "+ String.format("%.2f", m2.getSalario()));
    }
}
