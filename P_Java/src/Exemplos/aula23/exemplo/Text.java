
package Exemplos.aula23.exemplo;

import java.io.*;

public class Text {
    public static void main(String[] args) {
        try {
            BufferedWriter arquivoTexto = new BufferedWriter(new FileWriter("/home/eu/Documentos/programacao/P_Java/src/Exemplos/aula23/exemplo/texto.txt"));
            for(int i=0; i<10; i++){
                arquivoTexto.append("linha " +i+ " do arquivo\n");
            }
            arquivoTexto.close();
          
        } catch (FileNotFoundException e) {
            System.out.print("erro ao escrever o arquivo");
        }catch(IOException e){
            System.out.println("erro ao criar o arquivo");
        }
    }
}
