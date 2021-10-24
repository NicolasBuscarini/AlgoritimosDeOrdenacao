package controller;

import model.Vetor;

public class Testa {
    
    public static void main(String[] args) {
        Vetor vetor = new Vetor(21);
        
        int[] vetorInsertionSort = vetor.elementos;
        int[] vetorQuickSort = vetor.elementos;
        int[] vetorSelectionSort = vetor.elementos;

        System.out.println("Vetor Não Ordenado:");
        vetor.getElementos();
        System.out.println("\n--------------------------------------------------------------------------------------------");
        
        System.out.println("InsertionSort:");
        InsertionSort.insertionSort(vetorInsertionSort);
        vetor.getElementos();
        System.out.println("\n--------------------------------------------------------------------------------------------");
        
        System.out.println("QuickSort:");
        QuickSort.quickSort(vetorQuickSort, 0, vetor.getTamanho() -1);
        vetor.getElementos();
        System.out.println("\n--------------------------------------------------------------------------------------------");
        
        System.out.println("SelectionSort:");
        SelectionSort.selectionSort(vetorSelectionSort);
        vetor.getElementos();
        System.out.println("\n--------------------------------------------------------------------------------------------");
    }
    
}
