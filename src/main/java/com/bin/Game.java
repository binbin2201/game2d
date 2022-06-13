package com.bin;

import javax.swing.*;

public class Game {
    public static void myWindow() {
        JFrame window = new JFrame("2D_Game");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Board board = new Board();
        window.addKeyListener(board);
        window.setResizable(false);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               myWindow();
        }
    });
}
}
