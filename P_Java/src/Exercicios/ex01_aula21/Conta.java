package Exercicios.ex01_aula21;

public class Conta {
    private String titular;
    private String identificador;
    protected float saldo;
    private String senha;

    public Conta(String titular, String senha) {
        this.titular = titular;
        this.senha = senha;
    }
    
   
        
    public void depositar(float valor){
        
    }
    
    private String gerarIdentificador(){
        
        return null;
        
    }
    
    public String getIdentificador(){
        
        return null;
        
    }
    
    public boolean validarAcesso(String identificador , String senha){
        
        return false;
        
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
