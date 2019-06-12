package exemplo11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo11 extends JFrame implements ActionListener {

    JButton B1;
    JLabel L1;

    Exemplo11() {
        getContentPane().setBackground(new Color(190, 190, 190));
        setTitle("Caixas de entrada");
        setBounds(300, 50, 230, 100);
        getContentPane().setLayout(new GridLayout(2, 1));
        L1 = new JLabel(" ", JLabel.CENTER);
        B1 = new JButton("Login");
        B1.addActionListener(this);
        B1.setToolTipText("Clique aqui para entrar no sistema.");
        getContentPane().add(B1);
        getContentPane().add(L1);
    }

    public void actionPerformed(ActionEvent e) {
        String resp = JOptionPane.showInputDialog(null, "Qual é o seu nome?", "Login no sistema.", JOptionPane.QUESTION_MESSAGE);
        if(!(resp == null || resp.equals("")))
            L1.setText("Seja bem vindo! " + resp);
        else
            L1.setText("");
    }

    public static void main(String[] args) {
        JFrame janela = new Exemplo11();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
