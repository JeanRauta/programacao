package Exemplos.aula31.ex01;

public class Retangulo extends Figura{
    
    private double base;
    private double altura;

    public Retangulo() {
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double calc = this.base * this.altura;
        return calc;
    }

    @Override
    public double calcularPerimetro() {
        double calc = (this.base * 2) + (this.altura * 2);
        return calc;
    }
    
}
