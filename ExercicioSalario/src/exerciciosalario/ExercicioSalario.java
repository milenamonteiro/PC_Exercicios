/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosalario;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;

public class ExercicioSalario extends JFrame implements ActionListener {
  
        JLabel L1, L2, L3, L4, L5, L6, L7;
        JTextField T1,T2, T3, T4, T5, T6, T7;
        JButton B1, B2, B3;
        NumberFormat NF1;
        
    public static void main(String[] args) {
        
    JFrame janela = new ExercicioSalario();
     janela.setUndecorated(true);
     janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
     janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     janela.setVisible(true);
        
    }
      
    ExercicioSalario(){
        
        setTitle("Calculando seu desespero");
        setBounds(600, 300, 600, 300);
        getContentPane().setBackground(new Color(150,150,150));
        getContentPane().setLayout(new GridLayout(8,8));
        
        NF1 = NumberFormat.getNumberInstance();
        NF1.setMinimumFractionDigits(2);
        L1 = new JLabel("Salário bruto");
        L2 = new JLabel("Digite total de horas trabalhadas");
        L3 = new JLabel("Digite o número de dependentes:" );
        L4 = new JLabel("Digite o salário/hora: ");
        L5 = new JLabel("Com desconto do INSS: ");
        L6 = new JLabel("Com imposto de renda: ");
        L7 = new JLabel("Salário líquido: ");
              
        T1 = new JTextField();
        T2 = new JTextField();
        T3 = new JTextField(); 
        T4 = new JTextField();
        T4.setEditable(false);
        
        T5 = new JTextField();
        T5.setEditable(false);
  
        T6 = new JTextField();
        T6.setEditable(false);
      
        T7 = new JTextField();
        T7.setEditable(false);
      
        //+ NF1.format(salarioliquido)
        B1 = new JButton("Calcule");B1.addActionListener(this);
        B2 = new JButton("Limpar");B2.addActionListener(this);
          
        getContentPane().add(L2); getContentPane().add(T1);
        getContentPane().add(L3); getContentPane().add(T2);
        getContentPane().add(L4); getContentPane().add(T3);
        getContentPane().add(L5); getContentPane().add(T4);
        getContentPane().add(L6); getContentPane().add(T5);
        getContentPane().add(L1); getContentPane().add(T6);
        getContentPane().add(L7); getContentPane().add(T7);
        getContentPane().add(B1); 
        getContentPane().add(B2); 
        //T1.setText(" " + NF1.format(salariohora));
        
    }
        
    public void actionPerformed(ActionEvent e) {  
        if(e.getSource()==B2){
            T1.setText(""); T2.setText(""); T3.setText("");T4.setText("");T5.setText("");T6.setText("");T7.setText("");}
        if(e.getSource()==B1){
              double salariohora = 0.00, salariobruto = 0.00, inss = 0.00, imposto = 0.00, salarioliquido = 0.00;
             double qnthoras = 0.00, numdependentes = 0.00;
            try{
            qnthoras =Double.parseDouble(T1.getText());
            salariohora = Double.parseDouble(T2.getText());
            numdependentes = Double.parseDouble(T3.getText());
            }
              catch(NumberFormatException ex){
               
              }
            salariobruto = (qnthoras * salariohora) + (50 * numdependentes);
            
                if(salariobruto <= 1000){
                    inss = salariobruto*8/100;
                    imposto = salariobruto*5/100;
                }
                else{
                    inss = salariobruto*11/100;
                    imposto = salariobruto*7/100;
                }
                
                salarioliquido = salariobruto - inss - imposto;
                
            T6.setText("" + NF1.format(salariobruto));
            T4.setText("" + NF1.format(inss));
            T7.setText("" + NF1.format(salarioliquido));
            T5.setText("" + NF1.format(imposto));
            
            }
            
          
            }
            
        
     
}
