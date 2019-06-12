package exemplo9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo9 extends JFrame implements ActionListener {

    ImageIcon icone = new ImageIcon("T:\\Usuarios\\INFORMATICA\\3A ETIM\\2 Bimestre\\Crespi e Milena\\PC_Exercicios\\Exemplo9\\estrela.gif");
    JButton B1, B2, B3, B4, B5, B6;

    Exemplo9() {
        getContentPane().setBackground(new Color(190, 190, 190));
        setTitle("Caixas de mensagens");
        setBounds(200, 50, 350, 100);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        B1 = new JButton("Pergunta");
        B1.addActionListener(this);
        B2 = new JButton("Informação");
        B2.addActionListener(this);
        B3 = new JButton("Alerta");
        B3.addActionListener(this);
        B4 = new JButton("Erro");
        B4.addActionListener(this);
        B5 = new JButton("Definido pelo usuário");
        B5.addActionListener(this);
        B6 = new JButton("Somente mensagem");
        B6.addActionListener(this);
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);
        getContentPane().add(B4);
        getContentPane().add(B5);
        getContentPane().add(B6);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == B1)
            JOptionPane.showMessageDialog(null, "Será que o 3º INFO merece ir ao cinema?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        if(e.getSource() == B2)
            JOptionPane.showMessageDialog(null, "Informação: O comportamento do 3º ETIM está difícil.", "Mensagem de informação", JOptionPane.INFORMATION_MESSAGE);
        if(e.getSource() == B3)
            JOptionPane.showMessageDialog(null, "Cuidado! Vários Is são dados!", "Mensagem de alerta", JOptionPane.WARNING_MESSAGE);
        if(e.getSource() == B4)
            JOptionPane.showMessageDialog(null, "Cinema é um erro!", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        if(e.getSource() == B5)
            JOptionPane.showMessageDialog(null, "Dúvidas.", "Definido pelo programador", JOptionPane.INFORMATION_MESSAGE, icone);
        if(e.getSource() == B6)
            JOptionPane.showMessageDialog(null, "Caixa simples.", "Somente mensagem", JOptionPane.PLAIN_MESSAGE);

    }

    public static void main(String[] args) {
        JFrame janela = new Exemplo9();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
