package model;

import java.util.Random;

public class Vetor {
    private int tamanho;
    private int valorMax;
    private final int[] elementos;

    public Vetor(int tamanho, int valorMax) {
        this.setTamanho(tamanho);
        this.setValorMax(valorMax);
        this.elementos = new int[tamanho];
        
        this.gerar();
    }

    public int getValorMax() {
        return valorMax;
    }

    public void setValorMax(int valorMax) {
        this.valorMax = valorMax;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int[] getElementos() {
        return elementos;
    }
    
    public void printElementos() {
        System.out.print('{');
        for (int i = 0; i < tamanho; i++) {
            System.out.print(this.elementos[i]);
            if (i < tamanho - 1)
                System.out.print(", ");
        }
        System.out.print('}');
    }
    
    private void gerar() {
        Random radom = new Random();
        for (int i = 0; i < tamanho; i++) {
            this.elementos[i] += radom.nextInt(this.valorMax);
        }
    }
}
