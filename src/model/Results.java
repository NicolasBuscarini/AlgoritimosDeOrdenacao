package model;

public class Results {
    
    private int qtdOrdenacoes;
    private long tempoAtual;
    private long tempoTotal;
    private long tempoMedio;

    public Results() {
        this.setTempoAtual(0);
        this.setTempoTotal(0);
        this.setTempoMedio(0);
        this.setQtdOrdenacoes(0);
    }
    
    public int getQtdOrdenacoes() {
        return qtdOrdenacoes;
    }

    public long getTempoAtual() {
        return tempoAtual;
    }
    
    public long getTempoMedio() {
        return tempoMedio;
    }

    public long getTempoTotal() {
        return tempoTotal;
    }

    public void setQtdOrdenacoes(int qtdOrdenacoes) {
        this.qtdOrdenacoes = qtdOrdenacoes;
    }

    public void setTempoTotal(long tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void setTempoMedio(long tempoMedio) {
        this.tempoMedio = tempoMedio;
    }

    public void setTempoAtual(long tempoAtual) {
        this.tempoAtual = tempoAtual;
        this.tempoTotal += this.tempoAtual;
        this.qtdOrdenacoes += 1;
        this.tempoMedio = this.tempoTotal / qtdOrdenacoes;
    }
    
}
