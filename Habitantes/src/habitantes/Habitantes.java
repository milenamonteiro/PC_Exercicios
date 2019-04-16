package habitantes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;
import java.util.*;


public class Habitantes extends JFrame implements ActionListener {

    JPanel P1, P2, P3;
    NumberFormat NF1;
    int ID = 1;
    //P1
    JLabel lblHabitante, lblNumHabitante, lblSalario, lblNumFilhos;
    JTextField txtSalario, txtNumFilhos;
    JButton addHab, limpar;
    //P2
    JLabel lblMediaSalario, lblMediaNumFilhos, lblPorcSalarioMin;
    JLabel resultMediaSalario, resultMediaNumFilhos, resultPorcSalarioMin;
    //P3
    JTable tabela;
    Vector<String> coluna = new Vector<String>();
    Vector<Vector> linhas = new Vector<Vector>();
    Vector<Vector<Vector>> listLinhas = new Vector<Vector<Vector>>();
    
    public static void main(String[] args) {
        JFrame janela = new Habitantes();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    Habitantes() {

        setTitle("Pesqhab");
        setBounds(200, 100, 550, 480);
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

        NF1 = NumberFormat.getNumberInstance();
        NF1.setMinimumFractionDigits(2);

        P1 = new JPanel();
        P2 = new JPanel();
        P3 = new JPanel();
        P1.setLayout(new GridLayout(4, 2));
        P1.setBackground(Color.WHITE);
        P2.setLayout(new BoxLayout(P2, BoxLayout.Y_AXIS));
        P2.setBackground(Color.WHITE);
        P3.setLayout(new FlowLayout(FlowLayout.CENTER));
        P3.setBackground(Color.WHITE);

        lblHabitante = new JLabel("Habitante ");
        lblNumHabitante = new JLabel();
        lblSalario = new JLabel("Salário ");
        lblNumFilhos = new JLabel("Número de filhos ");

        txtSalario = new JTextField();
        txtNumFilhos = new JTextField();

        limpar = new JButton("Limpar");
        limpar.addActionListener(this);
        addHab = new JButton("Adicionar");
        addHab.addActionListener(this);

        P1.add(lblHabitante);
        P1.add(lblNumHabitante);
        P1.add(lblSalario);
        P1.add(txtSalario);
        P1.add(lblNumFilhos);
        P1.add(txtNumFilhos);
        P1.add(limpar);
        P1.add(addHab);

        lblMediaSalario = new JLabel("Média dos salários");
        resultMediaSalario = new JLabel();
        lblMediaNumFilhos = new JLabel("Média do número de filhos");
        resultMediaNumFilhos = new JLabel();
        lblPorcSalarioMin = new JLabel("% recebe salário mínimo ");
        resultPorcSalarioMin = new JLabel();

        P2.add(lblMediaSalario);
        P2.add(resultMediaSalario);
        P2.add(lblMediaNumFilhos);
        P2.add(resultMediaNumFilhos);
        P2.add(lblPorcSalarioMin);
        P2.add(resultPorcSalarioMin);

        coluna.addElement("ID");
        coluna.addElement("Salário");
        coluna.addElement("Número de filhos");

        tabela = new JTable(linhas, coluna);
        tabela.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(tabela);

        P3.add(sp);

        getContentPane().add(P1);
        getContentPane().add(P2);
        getContentPane().add(P3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addHab) {
            try {
               
               
               
               for(int i = 0; i < listLinhas.size(); i++){
                   
               }
            } catch (NumberFormatException erro) {

            }
        }
    }

}
