package exemplo13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo13 extends JFrame implements ActionListener {

    JTextArea TA1, TA2;
    JTextField T1;
    JButton B1, B2;

    Exemplo13() {
        getContentPane().setBackground(new Color(190, 190, 190));
        setTitle("Uso da area de texto");
        setBounds(150, 50, 480, 280);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        T1 = new JTextField(40);
        T1.addActionListener(this);
        B1 = new JButton("Copia Tudo");
        B1.addActionListener(this);
        B2 = new JButton("Copia a seleção toda");
        B2.addActionListener(this);
        TA1 = new JTextArea("Editor de texto:\n", 5, 40);
        TA2 = new JTextArea(5, 40);
        JScrollPane painel1 = new JScrollPane(TA1);
        JScrollPane painel2 = new JScrollPane(TA2);
        getContentPane().add(painel1);
        getContentPane().add(T1);
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(painel2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == T1) {
            TA1.append(TA1.getText());
            T1.setText("");
        }
        if (e.getSource() == B1) {
            TA2.setText(TA1.getText());
        }
        if (e.getSource() == B2) {
            TA2.setText(TA1.getSelectedText());
        }
    }

    public static void main(String[] args) {
        JFrame janela = new Exemplo13();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
