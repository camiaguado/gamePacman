/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.gui;
import javax.swing.JFrame;

public class Window {
    
    public Window(){
        
        JFrame ventana = new JFrame();
        ventana.add(new VisualManager());
        ventana.setSize(1000, 1000);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Window ventana = new Window();
    }
    
}