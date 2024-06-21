package Exercicios.aula20;

import java.util.Scanner;

public class Banco {
    
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        Conta conta = new Conta();
        boolean finalizar = false;
        String senhaProvisoria;
        String opition;
        float deposito, saque;
        String identify = conta.gerarLetrarAleatoria();
        System.out.print(identify);

        
        System.out.println("<COMEÇE CRIANDO SUA CONTA>");
        System.out.print("Digite seu nome: ");
        conta.titular = scan.next();
        
        System.out.print("\nCrie sua senha: ");
        conta.senha = scan.next();
                
        System.out.print("\nConfirme sua senha: ");
        senhaProvisoria = scan.next();
        
        while(!conta.senha.equals(senhaProvisoria)){

            System.out.print("\n\nConformação de senha errada. Digite novamente");

            System.out.print("\nConfirme sua senha: ");
            senhaProvisoria = scan.next();        
        }
        
        System.out.print("\nCONTA CRIADA COM SUCESSO!");
        
        do{
        
        System.out.println("\n\n\nO que vc deseja fazer?");
        System.out.println("d - depositar");
        System.out.println("s - sacar");
        System.out.println("v - verificar seu saldo");
        System.out.println("e - sair");
        opition = scan.next();
        
        boolean verifyd = false;
        if(opition.equals("d")){
            System.out.print("\nDigite o valor do deposito:");
            deposito = scan.nextFloat();
            do{
            System.out.println("Digite sua senha para confirmar o deposito:");
            senhaProvisoria = scan.next();
            if(senhaProvisoria.equals(conta.senha)){
            conta.depositar(deposito);
            verifyd = true;
            }else{
                System.out.print("senha errada\n");
            }
            }while(verifyd == false);
            
        }
        
        if(opition.equals("s")){
            System.out.print("\nDigite o valor do saque:");
            saque = scan.nextFloat();
            do{
            System.out.println("Digite sua senha para confirmar o saque:");
            senhaProvisoria = scan.next();
            if(senhaProvisoria.equals(conta.senha)){
            conta.sacar(saque);
            verifyd = true;
            }else{
                System.out.print("senha errada\n");
            }
            }while(verifyd == false);
            
        }
        
         if(opition.equals("v")){
           
           do{
            System.out.println("Digite sua senha para confirmar o saque:");
            senhaProvisoria = scan.next();
            if(senhaProvisoria.equals(conta.senha)){
                String res = conta.verificarSaldo();
                System.out.print(res);
            verifyd = true;
            }else{
                System.out.print("senha errada\n");
            }
            }while(verifyd == false);
        }
         
         
        if(opition.equals("e")){
            finalizar = true;
        }
    }while(finalizar == false);
    }
}
