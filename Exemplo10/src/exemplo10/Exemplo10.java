package exemplo10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo10 extends JFrame implements ActionListener {

    JButton B1, B2, B3;
    JLabel L1;

    Exemplo10() {
        getContentPane().setBackground(new Color(190, 190, 190));
        setTitle("Caixas de informação");
        setBounds(200, 50, 400, 100);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        L1 = new JLabel("resp: ");
        B1 = new JButton("Sim e não");
        B1.addActionListener(this);
        B2 = new JButton("Sim, não e cancelar");
        B2.addActionListener(this);
        B3 = new JButton("OK e cancelar");
        B3.addActionListener(this);
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);
        getContentPane().add(L1);
    }

    public void actionPerformed(ActionEvent e) {
        int resp = 0;
        if(e.getSource() == B1)
            resp = JOptionPane.showConfirmDialog(null, "Erro de acesso ao arquivo. Tentar novamente?", "Erro", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if(e.getSource() == B2)
            resp = JOptionPane.showConfirmDialog(null, "Deseja salvar?", "Salvar arquivo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if(e.getSource() == B3)
            resp = JOptionPane.showConfirmDialog(null, "Deseja abrir o arquivo?", "Abrir arquivo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (resp) {
            case 0: L1.setText("Pressionando o botão Yes/OK"); break;
            case 1: L1.setText("Pressionando o botão No"); break;
            case 2: L1.setText("Pressionando o botão Cancel"); break;
        }
    }

    public static void main(String[] args) {
        JFrame janela = new Exemplo10();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
