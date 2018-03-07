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


public class GreenBullet extends Graphic {
    
    public GreenBullet(int x, int y) {
        super(x, y);
        icon = new ImageIcon(getClass().getResource("/images/green-bullet.png"));
        imgGraphic = icon.getImage();
    }
    
    @Override
    public void move(){
        xCoord += 8;
    }
    
    @Override
    public void draw(Graphics g){
        g.drawImage(imgGraphic, xCoord, yCoord, 30, 30, null);
    }

}
