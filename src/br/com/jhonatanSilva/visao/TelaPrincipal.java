package br.com.jhonatanSilva.visao;

import br.com.jhonatanSilva.modelo.Tabuleiro;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal(){

        Tabuleiro tabuleiro = new Tabuleiro(16,30, 50);
        PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
        add(painelTabuleiro);

        setTitle("Campo Minado");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String[] args) {

        new TelaPrincipal();

    }

}
