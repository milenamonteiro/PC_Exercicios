package exemplo6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo6 extends JFrame implements ItemListener, ActionListener {

    JLabel L1;
    JTextField T1, T2, T3;
    JButton B1, B2, B3, B4, B5, B6;
    JComboBox C;

    Exemplo6() {
        setTitle("Uso de JComboBox");
        setBounds(200, 50, 400, 170);
        getContentPane().setBackground(new Color(190, 190, 190));
        L1 = new JLabel("Conteudo: ");
        B1 = new JButton("Mostrar Texto: ");
        B1.addActionListener(this);
        B2 = new JButton("Mostrar Indice: ");
        B2.addActionListener(this);
        B3 = new JButton("Adicionar Item: ");
        B3.addActionListener(this);
        B4 = new JButton("Remover Item: ");
        B4.addActionListener(this);
        B5 = new JButton("Remover Todos: ");
        B5.addActionListener(this);
        B6 = new JButton("Qtd Itens: ");
        B6.addActionListener(this);
        T1 = new JTextField();
        T2 = new JTextField();
        String[] cores = {"Branco", "Azul", "Verde"};
        C = new JComboBox(cores);
        C.addItemListener(this);
        getContentPane().setLayout(new GridLayout(5, 2));
        getContentPane().add(L1);
        getContentPane().add(C);
        getContentPane().add(B1);
        getContentPane().add(B4);
        getContentPane().add(B2);
        getContentPane().add(B5);
        getContentPane().add(B3);
        getContentPane().add(T1);
        getContentPane().add(B6);
        getContentPane().add(T2);
    }

    public void itemStateChanged(ItemEvent e) {
        T1.setText(" " + C.getSelectedItem());
    }

    public static void main(String[] args) {
        JFrame janela = new Exemplo6();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            L1.setText("Texto: " + C.getSelectedItem());
        }
        if (e.getSource() == B2) {
            L1.setText("Indice: " + C.getSelectedIndex());
        }
        if (e.getSource() == B3 && T1.getText().length() != 0) {
            C.addItem(T1.getText());
            T1.setText("");
        }
        if (e.getSource() == B4) {
            C.removeItemAt(C.getSelectedIndex());
        }
        if (e.getSource() == B5) {
            C.removeAllItems();
        }
        if (e.getSource() == B6) {
            T2.setText(" " + C.getItemCount());
        }
    }
}
