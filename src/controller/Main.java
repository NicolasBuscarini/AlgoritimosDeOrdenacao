package controller;

import utils.Configura;
import view.ProgramaPrincipal;

public class Main {
    public static void main(String[] args) {
        
        Configura.LookAndFeel("Windows Classic");
        new ProgramaPrincipal().setVisible(true);
    }
}
