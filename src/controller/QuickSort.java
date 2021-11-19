package controller;

public class QuickSort {
    
    public static void quickSort(int[] vetor, int esquerda, int direita) {
        int esq = esquerda;
        int dir = direita;
        int pivo = vetor[(esq + dir) / 2];
        int troca;

        while (esq <= dir) {
            while (vetor[esq] < pivo) 
                esq = esq + 1;
            
            while (vetor[dir] > pivo) 
                dir = dir - 1;
            
            if (esq <= dir) {
                troca = vetor[esq];
                vetor[esq] = vetor[dir];
                vetor[dir] = troca;
                esq += 1;
                dir -= 1;
            }
        }
        if (dir > esquerda)
            quickSort(vetor, esquerda, dir);

        if (esq < direita)
            quickSort(vetor, esq, direita);
    }
}
