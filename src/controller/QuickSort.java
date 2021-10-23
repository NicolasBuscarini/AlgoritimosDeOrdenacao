package controller;

public class QuickSort {
    
    public static int particiona(int[] Vetor, int inicio, int fim) {
        int esq,dir,pivo,aux; 
        esq = inicio;
        dir = fim;
        pivo = Vetor[inicio];        
        
        while(esq < dir) {
            while(esq <= fim && Vetor[esq] <= pivo)
                esq++;
            
            while(dir >= 0 && Vetor[dir] > pivo)
                dir--;
            
            if(esq < dir){
                aux = Vetor[esq];
                Vetor[esq]= Vetor[dir];
                Vetor[dir] = aux;
            }     
        } 
        
        Vetor[inicio] = Vetor[dir];
        Vetor[dir] = pivo;
        return dir;
    }
    
    public static void quickSort(int[] Vetor, int inicio, int fim) {
        int pivo;
        
        if (fim > inicio){
            pivo = particiona(Vetor,inicio,fim);
            quickSort(Vetor, inicio, pivo-1);
            quickSort(Vetor, pivo+1, fim);
        }
    }
    
}
