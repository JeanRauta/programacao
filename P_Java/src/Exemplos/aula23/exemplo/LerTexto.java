package Exemplos.aula23.exemplo;

import java.io.*;

public class LerTexto {
    public static void main(String[] args) {
        try{
            BufferedReader arquivoTexto = new BufferedReader(new FileReader("/home/eu/Documentos/programacao/P_Java/src/Exemplos/aula23/exemplo/texto.txt"));
            String texto = "";
            String linha = "";
            while(linha!=null){
                linha = arquivoTexto.readLine();
                if(linha!=null){
                    texto+=linha+"\n";
                }
            
            }
            System.out.println(texto);
        }catch(IOException e){
            System.out.println("nicolas lambb");
        }
    }
}
