package com.bin;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player {
    private BufferedImage image;
    private Point position;
    public Player(){
        loadImage();
        position = new Point(0,0);

    }
    private void loadImage(){
        try{
            image = ImageIO.read(new File("C:\\Users\\ninja\\Desktop\\monkey.png"));

        } catch(IOException exc){
            System.out.println("Error opening image file: " + exc.getMessage());
        }
    }
}
