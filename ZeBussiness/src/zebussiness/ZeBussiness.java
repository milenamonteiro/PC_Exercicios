package zebussiness;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;

public class ZeBussiness extends JFrame implements ActionListener{

    JLabel lbldata;
    JTextArea lblresultado;
    JFormattedTextField datainserida;
    MaskFormatter msData;
    JButton botao;
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
    String concatenada = new String();
    
    ZeBussiness(){
        setTitle("A Lojinho do Zé");
        setBounds(300,50,250,150);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        try{
        msData = new MaskFormatter("##/##/####");
        } catch (ParseException erro) {
            erro.printStackTrace();
        }
        
        lbldata = new JLabel("Data: ");
        lblresultado = new JTextArea();
        datainserida = new JFormattedTextField(msData);
        botao = new JButton("Calcular");
        botao.addActionListener(this);
        
        getContentPane().add(lbldata);
        getContentPane().add(datainserida);
        getContentPane().add(botao);
        getContentPane().add(lblresultado);
    }
    
    public static void main(String[] args){
        JFrame janela = new ZeBussiness();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao) {
            try{
                String dateInString = datainserida.getText();;
                date = sdf.parse(dateInString);
            }
            catch(Exception ex){
                
            }
            
            Calendar cal = Calendar.getInstance(); 
            cal.setTime(date);
            cal.add(Calendar.DATE, 30);
            concatenada = "Resultado parcela 1: "+sdf.format(cal.getTime());
            
            cal.add(Calendar.DATE, 30);
            concatenada += "\nResultado parcela 2: "+sdf.format(cal.getTime());
            
            cal.add(Calendar.DATE, 30);
            concatenada += "\nResultado parcela 3: "+sdf.format(cal.getTime());
            
            lblresultado.setText(concatenada);
        }
    }
}
