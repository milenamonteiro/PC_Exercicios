package exemplo12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo12 extends JFrame implements ActionListener {

    JButton B1;
    JLabel L1;

    Exemplo12() {
        setBackground(new Color(250, 100, 150));
        setBounds(300, 50, 250, 100);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        L1 = new JLabel();
        L1.setForeground(Color.blue);
        B1 = new JButton("Diálogo de opção");
        B1.addActionListener(this);
        getContentPane().add(B1);
        getContentPane().add(L1);

    }

    public void actionPerformed(ActionEvent e) {
        String[] escolha = new String[]{"Entre 1 e 20 anos", "Entre 21 e 40 anos", "Mais de 40"};
        int resp = JOptionPane.showOptionDialog(null, "Qual a sua idade?", "Idade", 0, JOptionPane.INFORMATION_MESSAGE, null, escolha, escolha[0]);
        String idade = (escolha[resp]);
        L1.setText("Idade: " + idade);

    }

    public static void main(String[] args) {
        JFrame janela = new Exemplo12();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
