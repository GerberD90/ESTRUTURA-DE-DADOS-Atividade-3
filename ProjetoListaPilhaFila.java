import java.util.*;

public class ProjetoListaPilhaFila {

    public static void main(String[] args) {
    	System.out.println("--------------------------------------------");        // Passo 1: Insere os números [1, 2, 3, 4 e 5] em uma lista com 5 células
    	System.out.println("Inserindo os numeros 1,2,3,4,5 na lista");
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println("Lista: " + lista);
        System.out.println("--------------------------------------------");        // Passo 2: Remove todos os dados da lista e insere-os em uma pilha com 5 células
        System.out.println("Removendo dados da lista e inserindo em uma pilha com 5 células");
        Stack<Integer> pilha = new Stack<Integer>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            pilha.push(lista.get(i));
            lista.remove(i);
        }
        
        System.out.println("Lista: " + lista);
        System.out.println("Pilha: " + pilha);
        System.out.println("--------------------------------------------");        // Passo 3: Remove os dados da pilha e insere-os em uma fila com 10 células
        System.out.println("Removendo dados da pilha e inserindo em uma fila com 10 células");
        Queue<Integer> fila = new LinkedList<Integer>();
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
        System.out.println("Pilha: " + pilha);
        System.out.println("Fila: " + fila);
        System.out.println("--------------------------------------------");        // Passo 4: Insere os números [6, 7, 8, 9 e 10] na lista
        System.out.println("Inserindo os numeros 6,7,8,9,10 na lista");
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        System.out.println("Lista: " + lista);
        System.out.println("--------------------------------------------");   
        
        // Passo 5: Repete os passos 2 e 3
                
        System.out.println("Removendo dados da lista e inserindo em uma pilha com 5 células");
        for (int i = lista.size() - 1; i >= 0; i--) {
        pilha.push(lista.get(i));
        lista.remove(i);
        }
        
        System.out.println("Lista: " + lista);
        System.out.println("Pilha: " + pilha);
        System.out.println("--------------------------------------------");        // Passo 3: Remove os dados da pilha e insere-os em uma fila com 10 células
        System.out.println("Removendo dados da pilha e inserindo em uma fila com 10 células");
   
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
        System.out.println("Pilha: " + pilha);
        System.out.println("Fila: " + fila);
        System.out.println("--------------------------------------------");        // Passo 6: Exibe todos os números que foram inseridos na fila
        System.out.println("Fila Final: ");
        while (!fila.isEmpty()) {
        	
            System.out.println(fila.remove());
        }
    }
}