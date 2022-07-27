package tictaetoe;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JogoDaVelha extends JPanel implements MouseListener {
    
    private Font Casas = new Font("Consolas", Font.BOLD, 80);
    private Font Vencedor = new Font("Consolas", Font.BOLD, 30);
    private Font Placar = new Font("Consolas", Font.BOLD, 15); 
    
    private int matriz[][];
    private int jogador;
    private int ganhador;
    private boolean jogarNov;
    private int vitoria1;
    private int vitoria2;
    private int empates;
    
    public JogoDaVelha() {

    jogador = 1;
    ganhador = 0;
    jogarNov = false;
    vitoria1 = 0;
    vitoria2 = 0;
    empates = 0;
    matriz = new int[3][3];
    
        for(int lin = 0; lin < 3; lin++) {
            for(int col = 0; col <3; col++) {
                System.out.print(matriz[lin][col]);
            }
            System.out.println();
        }
    }
    
    @Override
    public void paintComponent(Graphics tela2) {
    
        Graphics2D tela = (Graphics2D) tela2.create();
        System.out.println();
        for(int lin = 0; lin < 3; lin++) {
            for(int col = 0; col <3; col++) {
                System.out.print(matriz[lin][col]);
            }
            System.out.println();
        }
        
        if(jogarNov) {
            int jogarNovamente = JOptionPane.showConfirmDialog(this, "Deseja jogador novamente?");
            if (jogarNovamente == JOptionPane.OK_OPTION) {
                jogarNov = false;
                reiniciarJogo();
            } else {
                System.exit(1);
            }
        }
                
        tela.setFont(Casas);
        tela.setStroke(new BasicStroke(5));
        tela.setColor(Color.WHITE);
        tela.fillRect(0,0,610,635);
        
        tela.setColor(Color.BLACK);
        tela.drawLine(0,200,610,200);
        tela.drawLine(0,400,610,400);
        
        tela.drawLine(200,0,200,635);
        tela.drawLine(400,0,400,635);
        
        for(int lin = 0; lin < 3; lin++) {
            for(int col = 0; col <3; col++) {
                if(matriz[lin][col] == 1) {
                    tela.setColor(Color.RED);
                    tela.drawString("O", 80 + col*200, 125 + lin*200);
                } else if(matriz[lin][col] == 2) {
                    tela.setColor(Color.BLUE);
                    tela.drawString("X", 80 + col*200, 125 + lin*200);
                }
            }
            System.out.println();
        }
        
        if(ganhador != 0) {
            tela.setFont(Vencedor);
            
            if(ganhador == 3) {
                tela.setColor(Color.GRAY);
                tela.drawString("O jogo empatou", 180,180);
            } else {
                
                if(ganhador == 1) {
                    tela.setColor(Color.RED);
                } else if(ganhador == 2) {
                    tela.setColor(Color.BLUE);
                }
                
                tela.drawString("O jogador " + ganhador + " venceu", 150, 180);
            }
            
            jogarNov = true;
            repaint();
        }
        
        tela.setFont(Placar);
        
        tela.setColor(Color.RED);
        tela.drawString("Vitorias: " + vitoria1, 55,20);
        
        tela.setColor(Color.BLACK);
        tela.drawString("Empates: " + empates, 260,20);
        
        tela.setColor(Color.BLUE);
        tela.drawString("Vitorias: " + vitoria2, 455,20);   
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        //System.out.println(e.getX() + " , " + e.getY());
        
        int linha = (e.getY() - 25) / 200;
        int coluna = (e.getX() - 5) / 200;
        
        if(linha == 3) {
            linha = 2;
        }
        if(coluna == 3) {
            coluna =2;
        }
        
        System.out.println("Clicou na linha " + linha);
        System.out.println("Clicou na coluna " + coluna);
        
        if(jogador == 1 && matriz[linha][coluna] == 0) {
            matriz[linha][coluna] = 1;
            jogador = 2;
        } else if(jogador == 2 && matriz[linha][coluna] == 0) {
            matriz[linha][coluna] = 2;
            jogador = 1;
        }
        
        verificaGanhador();    
        repaint();
    }
    
    private void reiniciarJogo() {
        
        for(int lin = 0; lin < 3; lin++) {
            for(int col = 0; col <3; col++) {
                matriz[lin][col] = 0;
                ganhador = 0;
            }    
        }
    }
    
    private void verificaGanhador() {
    
        for(int lin = 0; lin < 3; lin++) {
            if(matriz[lin][0] == matriz[lin][1] && matriz[lin][0] == matriz[lin][2] && matriz[lin][0] != 0) {
                System.out.println("Houve um ganhador");
                ganhador = matriz[lin][0];
                break;
            }
        }
        for(int col = 0; col < 3; col++) {
            if(matriz[0][col] == matriz[1][col] && matriz[0][col] == matriz[2][col] && matriz[0][col] != 0) {
                System.out.println("Houve um ganhador");
                ganhador = matriz[0][col];
                break;
            }
        }
        if(matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2] && matriz[0][0] != 0) {
            System.out.println("Houve um ganhador");
            ganhador = matriz[0][0];
        }
        if(matriz[0][2] == matriz[1][1] && matriz[0][2] == matriz[2][0] && matriz[0][2] != 0) {
            System.out.println("Houve um ganhador");
            ganhador = matriz[0][2];
        }
        
        if(ganhador == 1) {
            vitoria1++;
        } else if(ganhador == 2) {
            vitoria2++;
        } else {
            
            boolean cheia = true;
            
            for(int lin = 0; lin < 3; lin++) {
                for(int col = 0; col <3; col++) {
                    if(matriz[lin][col] == 0) {
                        cheia = false;
                    }
                }    
            }
            if(cheia) {
                ganhador = 3;
                empates++;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
         
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}