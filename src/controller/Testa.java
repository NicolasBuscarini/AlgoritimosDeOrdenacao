package controller;

import model.Vetor;

public class Testa {
    
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(90000, 10000); 
        
        int[] vetorInsertionSort = vetor.getElementos();
        int[] vetorQuickSort = vetor.getElementos();
        int[] vetorSelectionSort = vetor.getElementos();
        
        System.out.println("Vetor Não Ordenado:");
        vetor.printElementos();
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
        
        System.out.println("InsertionSort:");
        long tempoInicialInsertionSort = System.currentTimeMillis();
        InsertionSort.insertionSort(vetorInsertionSort);
        long tempoFinalInsertionSort = System.currentTimeMillis() - tempoInicialInsertionSort;
        vetor.printElementos();
        System.out.println("\nTempo para a ordenação:"+ tempoFinalInsertionSort +"ms.");
        System.out.println("--------------------------------------------------------------------------------------------\n");
        
        System.out.println("QuickSort:");
        long tempoInicialQuickSort = System.currentTimeMillis();
        QuickSort.quickSort(vetorQuickSort, 0, vetor.getTamanho() -1);
        long tempoFinalQuickSort = System.currentTimeMillis() - tempoInicialQuickSort;
        vetor.printElementos();
        System.out.println("\nTempo para a ordenação:"+ tempoFinalQuickSort +"ms.");
        System.out.println("--------------------------------------------------------------------------------------------\n");
        
        System.out.println("SelectionSort:");
        long tempoInicialSelectionSort = System.currentTimeMillis();
        SelectionSort.selectionSort(vetorSelectionSort);
        long tempoFinalSelectionSort = System.currentTimeMillis() - tempoInicialSelectionSort;
        vetor.printElementos();
        System.out.println("\nTempo para a ordenação:"+ tempoFinalSelectionSort +"ms.");
        System.out.println("--------------------------------------------------------------------------------------------");
    }
    
}
