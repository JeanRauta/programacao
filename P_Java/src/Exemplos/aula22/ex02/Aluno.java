package Exemplos.aula22.ex02;

public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String obterDados(){
        return "Nome: "+ getNome() + " Sobrenome: " + getSobrenome();
    }    
    
    @Override
    
    public String toString(){
        return "Nome: "+ getNome() + " Sobrenome: " + getSobrenome();
    }
}
