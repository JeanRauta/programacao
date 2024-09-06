package Exemplos.aula31.ex02;

/**
 * @author Jean
 * @version 1.0
 */

public class Vetor implements Lista{
    private String[] elementos;
    private int tamanho;
    
   /**
    * cria instancia de vetor com capacidade elementos
    * @param capacidade 
    */
    public Vetor(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }
    
    @Override
    public void adiciona(String elemento){
        elementos[tamanho] = elemento;
        tamanho++;
    }
    
    /**
     * metodo remove o ultimo elemento da lista
     * @return retorne o elemento removido
     */
    
    @Override
    public String remove(){
        if(tamanho>0){
            return elementos[--tamanho];
        }
        return null;
    }

    public String[] getElementos() {
        return elementos;
    }
    
    /**
     * retorna o tamanho da lista
     * @return inteiro contendo a quantidade de elementos
     */

    public int getTamanho() {
        return tamanho;
    }
    
    /**
     * monta uma string com os elementos presentes na lista
     * @return um conjunto vazio para listas vazias = [] ou um conjunto com os elementos da lista = ['A' 'B' 'C']
     */
    
    @Override
    public String toString(){
        String resultado = "[";
        if (tamanho>0) {
            for(int i = 0; i<tamanho; i++){
                resultado+=elementos[i]+" ";
            }
        }
        resultado+="]";
        return resultado;
    }
    
    
}
