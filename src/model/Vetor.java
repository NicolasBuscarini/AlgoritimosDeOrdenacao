package model;

import java.util.Random;

public final class Vetor {
    public int tamanho;
    public int[] elementos;

    public Vetor(int tamanho) {
        this.setTamanho(tamanho);
        this.elementos = new int[tamanho];
        this.gerar();
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    private void gerar() {
        Random radom = new Random();
        for (int i = 0; i < tamanho; i++) {
            this.elementos[i] += radom.nextInt(100);
        }
    }
    
    public void getElementos() {
        System.out.print('{');
        for (int i = 0; i < tamanho; i++) {
            System.out.print(this.elementos[i]);
            if (i < tamanho - 1)
                System.out.print(", ");
        }
        System.out.print('}');

    }
    
}
