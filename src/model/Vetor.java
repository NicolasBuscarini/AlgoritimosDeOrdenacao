package model;

import java.util.Random;

public class Vetor {
    public int tamanho;
    public int[] elementos;

    public Vetor(int tamanho) {
        this.setTamanho(tamanho);
        this.elementos = new int[tamanho];
        this.Gerar();
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    private void Gerar() {
        Random radom = new Random();
        for (int i = 0; i < tamanho; i++) {
            this.elementos[i] += radom.nextInt(100);
        }
    }
    
    public void GetElementos() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }
    
}
