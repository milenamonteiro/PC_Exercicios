/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author 3aetim
 */
public class Exemplo1 extends JFrame{
    Exemplo1(){
        setTitle("Janela Java");
        setSize(400, 50);
        setLocation(150,150);
        setResizable(false);
        getContentPane().setBackground(Color.gray);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame janela = new Exemplo1();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
