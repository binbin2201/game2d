package com.bin;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class Board extends JPanel implements ActionListener, KeyListener {
    private final int DELAY = 25;
    public static final int TILE_SIZE = 50;
    public static final int ROWS = 12;
    public static final int COLUMNS = 18;
    public static final int NUM_COINS = 7;
    private static final long serialVersionUID = 490905409104883233L;
    private Timer timer;
    private Player player;
    private ArrayList coins;
}
