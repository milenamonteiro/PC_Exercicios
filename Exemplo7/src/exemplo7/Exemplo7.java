package exemplo7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo7 extends JFrame implements ItemListener {

    JLabel L1;
    JCheckBox C1, C2;
    static int negrito = 0, italico = 0;

    Exemplo7() {
        getContentPane().setBackground(new Color(180, 180, 180));
        setTitle("Uso da JCheckBox");
        setBounds(250, 50, 300, 70);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        L1 = new JLabel("Java");
        C1 = new JCheckBox("Negrito");
        C1.addItemListener(this);
        C2 = new JCheckBox("Itálico");
        C2.addItemListener(this);
        getContentPane().add(L1);
        getContentPane().add(C1);
        getContentPane().add(C2);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == C1) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                negrito = Font.BOLD;
            } else {
                negrito = Font.PLAIN;
            }
        }
        if (e.getSource() == C2) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                italico = Font.ITALIC;
            } else {
                italico = Font.PLAIN;
            }
        }
        L1.setFont(new Font("Arial", negrito + italico, 20));
    }

    public static void main(String[] args) {
        JFrame janela = new Exemplo7();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
