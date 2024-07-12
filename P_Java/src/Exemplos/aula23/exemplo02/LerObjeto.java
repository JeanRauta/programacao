package Exemplos.aula23.exemplo02;

import java.io.*;

public class LerObjeto {
    public static void main(String[] args) {
        File caminho = new File("/home/eu/Documentos");
        File arquivo = new File(caminho, "pessoas.db");
        try{
          ObjectInputStream arquivobj = new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
          Pessoa[] lista = (Pessoa[]) arquivobj.readObject();
          int cont = 0;
          Pessoa p;
          do{
              p = lista[cont];
              if(p!=null){
                  cont++;
              }
          }while(p!=null);
          
          for(int i = 0; i<cont; i++)
              System.out.print(lista[i]);
              
          arquivobj.close();
        }catch(IOException e){
            System.out.println("nicolas lambb");
        }catch(ClassNotFoundException e){
            System.out.println("nicolas lambb2");
        }
    }
}
