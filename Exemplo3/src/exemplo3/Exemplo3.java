/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo3 extends JFrame implements ActionListener
{
    JLabel L1,L2;
    JTextField T1;
    JPasswordField P1;  
    
    Exemplo3()
    {
        setTitle("Verificar senha");
        setBounds(200,50,350,85);
        getContentPane().setBackground(new Color(150,150,150));
        getContentPane().setLayout(new GridLayout(2,2));
        L1 = new JLabel("Digite a senha");
        L2 = new JLabel("Validação");
        T1 = new JTextField();
        P1 = new JPasswordField();
        P1.setEchoChar('?');
        P1.addActionListener(this);
        
        getContentPane().add(L1);
        getContentPane().add(P1);
        getContentPane().add(L2);
        getContentPane().add(T1);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(new String(P1.getPassword()).equals("JAVA"))
        {T1.setText("Senha válida!");}
        else {T1.setText("Senha INVÁLIDA!!!!");}
    }

    public static void main(String[] args) 
    {
     JFrame janela = new Exemplo3();
     janela.setUndecorated(true);
     janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
     janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     janela.setVisible(true);
    }


}  

