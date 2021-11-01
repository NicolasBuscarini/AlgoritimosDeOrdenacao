package controller;

import utils.Configura;
import view.TelaOrdenacao;

public class Main {
    public static void main(String[] args) {
        
        Configura.LookAndFeel("Windows Classic");
        new TelaOrdenacao().setVisible(true);
    }
}
