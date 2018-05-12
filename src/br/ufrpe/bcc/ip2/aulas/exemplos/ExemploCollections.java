package br.ufrpe.bcc.ip2.aulas.exemplos;

import java.util.*;

public class ExemploCollections {
    public static void main(String[] args) {

        int[] valores = new int[] {2, 5, 3, 9, 2, 4, 3, 8, 5};


        // Exemplo List
        List impares = new ArrayList();
        impares.add(1);
        impares.add(3);
        impares.add(5);

        List pares = new LinkedList();
        pares.add(2);
        pares.add(4);
        pares.add(6);

        int soma = 0;
        for (int i = 0; i < impares.size(); i++){
            System.out.println(impares.get(i));
            soma += ((Integer)impares.get(i)); // estreitamento (CAST)
        }

        for(int i = 0; i < pares.size(); i++)
            System.out.println(pares.get(i));

        // Exemplo Set
        Set<Integer> set    = new HashSet<>();
        List<Integer> lista = new ArrayList<>();
        for (int v:valores) {
            set.add(v);
            lista.add(v);
        }

        System.out.println(set);
        System.out.println(lista);

        // Exemplo Map
        Map<Integer, String> m = new HashMap<>();
        m.put(2,"ola");
        int key = 3;
        if(m.get(key) == null) {
            System.out.println("nao encontrado");
        } else {
            System.out.println(m.get(key));
        }
    }
}
