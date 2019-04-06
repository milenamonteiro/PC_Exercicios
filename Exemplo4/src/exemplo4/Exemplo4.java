
package exemplo4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;

public class Exemplo4 extends JFrame implements ActionListener {
    JTextField T1,T2;
    double valor1 = 100.00;
    int valor2 = 105;
    NumberFormat L1, L2;
    
    Exemplo4()
    {
        setTitle("Formatando números");
        setBounds(230, 50, 350, 65);
        getContentPane().setBackground(new Color(150,150,150));
        getContentPane().setLayout(new GridLayout(1,2));
        
        L1 = NumberFormat.getNumberInstance(); //instanciando
        L1.setMinimumFractionDigits(4); //quantidade de digitos
        L2 = NumberFormat.getNumberInstance();
        L2.setMinimumFractionDigits(2);
        
        T1 = new JTextField();
        T2 = new JTextField();
        T1.setText(""+L1.format(valor1));
        T2.setText(""+L2.format(valor2));
        getContentPane().add(T1);
        getContentPane().add(T2);
    }
    
   public void actionPerformed(ActionEvent e)
    { }
   
    public static void main(String[] args) 
    {
     JFrame janela = new Exemplo4();
     janela.setUndecorated(true);
     janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
     janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     janela.setVisible(true);
    }
    
}
