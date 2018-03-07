/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GraphicsObjects;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author Javier Arturo
 */
public class Zoombie extends Graphic{
    
    public Zoombie(int x, int y) {
        super(x, y);
        icon = new ImageIcon(getClass().getResource("/images/Plants-vs-Zombies-2-14.jpg"));
        imgGraphic = icon.getImage();
    }
    
    @Override
    public void move(){
        xCoord -= 3;
    }
    
    @Override
    public void draw(Graphics g){
        g.drawImage(imgGraphic, xCoord, yCoord, 80, 110, null);
    }
    
}
