/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeimagem;

import java.awt.Container;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TesteImagem {

    JFrame frame = new JFrame();

    ImageIcon background = new ImageIcon("C:\\Users\\milen\\Documents\\milena\\etec\\pastas servidor\\pc_exercicios\\Sorveteria\\gelatto.jpg");

    public TesteImagem() {
        frame.setBounds(100, 100, 100, 100);

        Container backgroundPane = new Container() {
            public void paint(Graphics g) {
                g.clearRect(0, 0, frame.getWidth(), frame.getHeight());

                background.paintIcon(this, g, 0, 0);
                super.paint(g);
            }
        };

        frame.getRootPane().setContentPane(backgroundPane);

        frame.show();
    }

    public static void main(String[] args) {
        TesteImagem test1 = new TesteImagem();
    }
}
