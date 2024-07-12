package Exemplos.aula23.exemplo02;

import java.io.*;
import java.util.Scanner;


public class EscreverObjeto {
    public static void main(String[] args) {
        File caminho = new File("/home/eu/Documentos/");
        
        if (!caminho.exists()){
            caminho.mkdirs();
        }
        
        
        File arquivo = new File(caminho, "pessoas.db");
        System.out.println(arquivo.getAbsolutePath());
        
        try{
            ObjectOutputStream arquivo2 = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            
            Pessoa[] lista = new Pessoa[10];
            Scanner scan = new Scanner(System.in);
            String opc;
            int cont = 0;
            
            do{
                System.out.println("Lendo informaçoes da pessoa" + (cont+1));
                System.out.println("Qual o nome: ");
                String nome = scan.next();
                System.out.println("Qual o sobrenome: ");
                String sobrenome = scan.next();
                lista[cont] = new Pessoa();
                lista[cont].setNome(nome);
                lista[cont].setSobrenome(sobrenome);
                System.out.println("Tem mais pessoas (s - sim/ n - não)");
                opc = scan.next().toLowerCase();
                cont++;
            }while(opc.equals("s"));
            
            arquivo2.writeObject(lista);
            arquivo2.close();
            
        }catch(IOException e){
            System.out.print("não rolou");
        }
    }
}
