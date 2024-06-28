package Exercicios.ex01_aula21;

import java.util.Scanner;

public class Banco {

	public static String leString(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.next();
	}

	public static float leFloat(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextFloat();
	}

	public static ContaCorrente acessaCC(ContaCorrente c1){
		//Aqui vai teu código
		return c1;
	}

	public static ContaPoupanca acessaCP(ContaPoupanca c1){
		//Aqui vai teu código
		return c1;
	}
        
	
	public static void main(String[] args) {
                Scanner ler = new Scanner(System.in);
		ContaCorrente[] listaCC = new ContaCorrente[20];
		ContaPoupanca[] listaCP = new ContaPoupanca[20];
		int contCC = 0;
		int contCP = 0;
		String opc;
		do{
			System.out.println("Selecione uma opção");
			System.out.println("cc - cadastrar conta corrente");
			System.out.println("cp - cadastrar conta poupança");
			System.out.println("ac - acessar conta corrente");
			System.out.println("ap - acessar conta poupança");
			System.out.println("e - sair");
			opc = leString("");
         
                        switch (opc) {
                        case "cc" -> {
                            System.out.print("\ndigite seu nome: ");
                            String titularcc = ler.next();
                            System.out.print("\ndigite sua senha: ");
                            String senhacc = ler.next();
                            listaCC[contCC].setSenha(senhacc);
                            contCC++;
                        }
                        
                        case "cp" -> {
                            String titularcp = ler.next();
                            listaCP[contCP].setTitular(titularcp);
                            String senhacp = ler.next();
                            listaCP[contCP].setSenha(senhacp);
                            contCP++;
                        }
                                
                        default -> throw new AssertionError();
                    }
		}
		while(!opc.equals("e"));
	}
}