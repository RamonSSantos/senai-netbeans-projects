package tictaetoe;

import javax.swing.JFrame;

public class TicTaeToe {

    public static void main(String[] args) {
        
        JFrame janela = new JFrame("JOGO DA VELHA");
        
        janela.setSize(610,635);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setResizable(false);
        
        JogoDaVelha jogo = new JogoDaVelha();
            
        jogo.setBounds(0,0,600,600);
        janela.add(jogo);
        
        janela.addMouseListener(jogo);
    }
}