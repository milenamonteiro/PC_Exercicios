package exemplo5;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class Exemplo5 extends JFrame implements ListSelectionListener, ActionListener {

    JLabel L1;
    JTextField T1;
    JButton B1, B2, B3;
    JList lista;
    DefaultListModel LM;

    Exemplo5() {
        setTitle("Uso do JList");
        setBounds(300, 50, 200, 250);
        T1 = new JTextField();
        T1.addActionListener(this);
        L1 = new JLabel("Sem seleção");
        B1 = new JButton("Quantidade de itens");
        B1.addActionListener(this);
        B2 = new JButton("Índice selecionado");
        B2.addActionListener(this);
        B3 = new JButton("Remove item");
        B3.addActionListener(this);
        LM = new DefaultListModel();
        LM.addElement("Banana");
        LM.addElement("Pera");
        LM.addElement("Maçã");
        lista = new JList();
        lista.addListSelectionListener(this);
        JScrollPane painel = new JScrollPane (lista);
        getContentPane().setLayout(new GridLayout (6,10));
        getContentPane().add(L1);
        getContentPane().add(T1);
        getContentPane().add(painel);
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);
    }

    public void actionPerformed (ActionEvent e)
    {
        if (e.getSource() == T1)
        {
            LM.addElement (T1.getText());
        }
        if(e.getSource() == B1)
            T1.setText("Quantidade: " + LM.getSize());
        if(e.getSource() == B2)
            T1.setText("Indice Selecionado: " + lista.getSelectedIndex());
        if(e.getSource() == B3)
        {
            int index = lista.getSelectedIndex();
            L1.setText("Removido: " + lista.getSelectedValue());
            LM.remove(index);
        }
    }
    public void valueChanged (ListSelectionEvent e)
    {
        if(lista.getSelectedValue()!= null)
        L1.setText ("Selecionado: " + lista.getSelectedValue());
    }

    public static void main(String[] args) 
    {
        JFrame janela = new Exemplo5();
        janela.setUndecorated (true);
        janela.getRootPane().setWindowDecorationStyle (JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
