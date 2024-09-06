package Exemplos.aula31.ex01;

public abstract class Figura {
    
    private String nomeFigura;

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
            
     public abstract double calcularArea();
     
     public abstract  double calcularPerimetro();
}
