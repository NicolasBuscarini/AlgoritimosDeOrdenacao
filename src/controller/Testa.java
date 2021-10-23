package controller;

import model.Vetor;

public class Testa {
    
    public static void main(String[] args) {
        Vetor vetor = new Vetor(20);
        
        System.out.println("Vetor Não Ordenado");
        vetor.getElementos();
        System.out.println("-----------------------");
        
        QuickSort.quickSort(vetor.elementos, 0,19);
        System.out.println("Vetor Ordenado");
        vetor.getElementos();
        System.out.println("-----------------------");

    }
    
}
