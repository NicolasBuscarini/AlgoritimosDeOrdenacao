
package model;

import java.util.Random;



public class Testa {
    
    public static void main(String[] args) {
        int[] vetor = new int[20];
        
        Random gerador = new Random();
        QuickSort quick = new QuickSort();
        
        for (int i = 0; i < 20; i++) {
            

            vetor[i] += gerador.nextInt(100);
            
        }
        
        System.out.println("-----------------------");
       
        
        quick.quickSort(vetor, 0,19);
        
        
        
        
        
        
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Retorno....."+vetor[i]);
        }
        
        
        
        
        
        
    }
    
    
    
    
    
}
