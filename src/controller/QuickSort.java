package controller;

public class QuickSort {
    
    public static int particiona(int[] elementos, int inicio, int fim) {
        int esq,dir,pivo,aux; 
        esq = inicio;
        dir = fim;
        pivo = elementos[inicio];        
        
        while(esq < dir) {
            while(esq <= fim && elementos[esq] <= pivo)
                esq++;
            
            while(dir >= 0 && elementos[dir] > pivo)
                dir--;
            
            if(esq < dir){
                aux = elementos[esq];
                elementos[esq]= elementos[dir];
                elementos[dir] = aux;
            }     
        } 
        
        elementos[inicio] = elementos[dir];
        elementos[dir] = pivo;
        return dir;
    }
    
    public static void quickSort(int[] elementos, int inicio, int fim) {
        int pivo;
        if (fim > inicio){
            pivo = particiona(elementos,inicio,fim);
            quickSort(elementos, inicio, pivo-1);
            quickSort(elementos, pivo+1, fim);
        }
    }
    
}
