package controller;

public class InsertionSort {
    
    public static void insertionSort(int vetor[]) {          
        int n = vetor.length;  
        for (int j = 1; j < n; j++) {  
            int key = vetor[j];  
            int i = j-1;  
            while ( (i > -1) && ( vetor [i] > key ) ) {  
                vetor [i+1] = vetor [i];  
                i--;  
            }  
            vetor[i+1] = key;  
        }
    }
    
}
