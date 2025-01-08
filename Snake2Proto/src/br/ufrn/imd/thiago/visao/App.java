package br.ufrn.imd.thiago.visao;

import javax.swing.*;
import br.ufrn.imd.modelo.SnakeGame;
import br.ufrn.imd.thiago.util.ThreadsManeger;

public class App {
	
	static int boardWidth = 600;
	static int boardHeigth = boardWidth;
			
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           
        	SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeigth);

            JFrame frame = new JFrame("Snake Game with Threads");
            frame.add(snakeGame); 
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
            ThreadsManeger threadsManager = new ThreadsManeger(snakeGame);
        });
    }
}

