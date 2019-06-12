package exemplo8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo8 extends JFrame implements ItemListener {

    double n1 = 0, result = 0;
    JLabel L1, L2;
    JTextField T1, T2;
    JPanel P1, P2;
    JRadioButton R1, R2, R3;
    ButtonGroup RB;

    Exemplo8() {
        getContentPane().setBackground(new Color(180, 180, 180));
        setTitle("Uso dos JRadioButtons");
        setBounds(250, 50, 340, 120);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        L1 = new JLabel("Digite um valor");
        L2 = new JLabel("% do valor");
        T1 = new JTextField(5);
        T2 = new JTextField(5);
        P1 = new JPanel();
        P2 = new JPanel();
        T2.setEditable(false);
        R1 = new JRadioButton("10%");
        R2 = new JRadioButton("20%");
        R3 = new JRadioButton("30%");
        R1.setMnemonic(KeyEvent.VK_1);
        R2.setMnemonic(KeyEvent.VK_2);
        R3.setMnemonic(KeyEvent.VK_3);
        RB = new ButtonGroup();
        RB.add(R1);
        R1.addItemListener(this);
        RB.add(R2);
        R2.addItemListener(this);
        RB.add(R3);
        R3.addItemListener(this);
        P1.setLayout(new FlowLayout(FlowLayout.CENTER));
        P1.setBackground(new Color(200, 200, 200));
        P1.add(L1);
        P1.add(T1);
        P2.add(R1);
        P2.add(R2);
        P2.add(R3);
        P2.add(L2);
        P2.add(T2);
        getContentPane().add(P1);
        getContentPane().add(P2);
    }

    public void itemStateChanged(ItemEvent e) {
        if (T1.getText().length() == 0) {
            return;
        }
        try{
            n1 = Double.parseDouble(T1.getText());
            if(e.getSource() == R1) result = (n1*10)/100;
            if(e.getSource() == R2) result = (n1*20)/100;
            if(e.getSource() == R3) result = (n1*30)/100;
        }
        catch(NumberFormatException erro){
            T2.setText("Erro " + erro); return;
        }
        T2.setText("" + result);
    }

    public static void main(String[] args) {
        JFrame janela = new Exemplo8();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
