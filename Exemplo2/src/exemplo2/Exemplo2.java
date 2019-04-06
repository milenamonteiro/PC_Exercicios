
package exemplo2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo2 extends JFrame implements ActionListener {
    JLabel L1, L2, L3;
    JButton B1, B2, B3, B4, B5;
    JTextField T1, T2, T3;
   
    public static void main(String[] args) {
       
        JFrame janela = new Exemplo2();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    Exemplo2() 
    {
        setTitle("Calculadora");
        setBounds(300,50,350,90);
        getContentPane().setBackground(new Color(228,230,227));
        getContentPane().setLayout(new GridLayout(3,4));
        
        L1 = new JLabel("Número 1");
        L1.setForeground(new Color(52,71,77));
        L1.setFont(new Font("", Font.BOLD, 14));
        
        L2 = new JLabel("Número 2");
        L2.setForeground(new Color(52,71,77));
        L2.setFont(new Font("", Font.BOLD, 14));
        
        L3 = new JLabel("Total");
        L3.setForeground(new Color(52,71,77));
        L3.setFont(new Font("", Font.BOLD, 14));
        
        B1 = new JButton("+"); B1.addActionListener(this);        
        B1.setBackground(new Color(234,181,120));
        B1.setForeground(new Color(52,71,77));
        
        B2 = new JButton("-"); B2.addActionListener(this);
        B2.setBackground(new Color(234,181,120));
        B2.setForeground(new Color(52,71,77));
        
        B3 = new JButton("X"); B3.addActionListener(this);
        B3.setBackground(new Color(234,181,120));
        B3.setForeground(new Color(52,71,77));
        
        B4 = new JButton("/"); B4.addActionListener(this);
        B4.setBackground(new Color(234,181,120));
        B4.setForeground(new Color(52,71,77));
        
        B5 = new JButton("Limpar"); B5.addActionListener(this);
        B5.setBackground(new Color(100,177,150));
        B5.setForeground(new Color(52,71,77));
        
        T1 = new JTextField();
        T2 = new JTextField();
        T3 = new JTextField();
        T3.setEditable(false);
        getContentPane().add(L1);
        getContentPane().add(T1);
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(L2);
        getContentPane().add(T2);
        getContentPane().add(B3);
        getContentPane().add(B4);
        getContentPane().add(L3);
        getContentPane().add(T3);
        getContentPane().add(B5);
    }
    public void actionPerformed (ActionEvent e){
        if(e.getSource()==B5){
        T1.setText(""); T2.setText(""); T3.setText("");
        return;
        }
        double n1=0, n2=0, result=0;
        try{
            n1 = Double.parseDouble(T1.getText());
            n2 = Double.parseDouble(T2.getText());
        }
        catch(NumberFormatException erro){
            T3.setText("Erro:" + erro);
            return;
        }
        if(e.getSource()==B1) result = n1 + n2;
        if(e.getSource()==B2) result = n1 - n2;
        if(e.getSource()==B3) result = n1 * n2;
        if(e.getSource()==B4) result = n1 / n2;
        T3.setText("" + result);
    }
}
