package Exemplos.aula31.ex03;

public class VeiculoUtilitario implements VeiculoCarga, VeiculoPasseio{

    @Override
    public void carregar() {
        System.out.println("carregando...");
    }

    @Override
    public void descarregar() {
        System.out.println("descarregando...");
    }

    @Override
    public void andar() {
        System.out.println("andando...");
    }

    @Override
    public void parar() {
        System.out.println("parando...");
    }

    @Override
    public void embarcar() {
        System.out.println("embaracar...");
    }

    @Override
    public void desembarcar() {
        System.out.println("desembarcar...");
    }
    
    
}
