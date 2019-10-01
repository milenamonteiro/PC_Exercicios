package diadasemana;

import java.awt.*;
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import javax.swing.*;

public class DiaDaSemana extends JFrame {

    JLabel dia;
    private int diaDaSemana;
    private String diafinal = new String();
    
    DiaDaSemana(){
        setTitle("Dia da semana");
        setBounds(300,50,250,150);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        dia = new JLabel("Bom dia! Hoje é " + hojeequedia());
        getContentPane().add(dia);
    }
    
    public static void main(String[] args) {
        JFrame janela = new DiaDaSemana();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    public String hojeequedia() {
        GregorianCalendar gc = new GregorianCalendar();
	Date date = new Date();
        gc.setTime(date);
        diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);
        
        switch(diaDaSemana){
            case 1:
                return "domingo, dia da Anhembi";
            case 2:
                return "segunda, a semana vai acabar já já";
            case 3:
                return "terça, dia de inglês";
            case 4:
                return "quarta, dia de química";
            case 5:
                return "quinta, dia de fazer TCC";
            case 6:
                return "sexta, dia de maldade kkkkkkkkkk";
            case 7:
                return "sábado, dia da OBMEP";
        }
        return "";
    }
}
