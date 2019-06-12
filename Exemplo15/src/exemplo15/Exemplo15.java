
package exemplo15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo15 extends JFrame implements ActionListener {

    JMenuBar menuBar1;
    JMenu menuArquivo, menuSave;
    JMenuItem miNovo, miSair, miAbrir, miSalvar, miSalvarC, miSalvarT;
    ImageIcon SalvarComo= new ImageIcon("T:\\Usuarios\\INFORMATICA\\3A ETIM\\2 Bimestre\\Crespi e Milena\\PC_Exercicios\\floppy-disk.png");
    
    Exemplo15(){
    setTitle("Menu principal");
    setBounds(300,50,250,150);
    menuBar1= new JMenuBar();
    menuArquivo= new JMenu("Arquivo");
    menuArquivo.setMnemonic(KeyEvent.VK_A);
    menuArquivo.addActionListener(this);
    menuSave= new JMenu("Arquivo");
    miNovo= new JMenuItem("Novo",new ImageIcon(""));
    miNovo.addActionListener(this);
    miNovo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.ALT_MASK));
    miNovo.setMnemonic(KeyEvent.VK_N);
    miAbrir= new JMenuItem("Abrir",new ImageIcon(""));
    miAbrir.addActionListener(this);
    miAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK));
    miAbrir.setMnemonic(KeyEvent.VK_B);
    miSalvar= new JMenuItem("Salvar",new ImageIcon("T:\\Usuarios\\INFORMATICA\\3A ETIM\\2 Bimestre\\Crespi e Milena\\PC_Exercicios\\floppy-disk.png"));
    miSalvar.addActionListener(this);
    miSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));
    miSalvar.setMnemonic(KeyEvent.VK_S);
    miSalvarC= new JMenuItem("Salvar como",SalvarComo);
    miSalvarC.addActionListener(this);
    miSalvarC.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.ALT_MASK));
    miSalvarC.setMnemonic(KeyEvent.VK_C);
    miSalvarT= new JMenuItem("Salvar Tudo",new ImageIcon(""));
    miSalvarT.addActionListener(this);
    miSalvarT.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.ALT_MASK));
    miSalvarT.setMnemonic(KeyEvent.VK_T);
    miSair= new JMenuItem("Sair ",new ImageIcon(""));
    miSair.addActionListener(this);
    miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.ALT_MASK));
    miSair.setMnemonic(KeyEvent.VK_A);
    menuSave.add(miSair);menuSave.add(miSalvarC);menuSave.add(miSalvarT);
    menuArquivo.add(miNovo);menuArquivo.add(miAbrir);menuArquivo.add(menuSave);menuArquivo.addSeparator();
    menuArquivo.add(miSair);
    menuBar1.add(menuArquivo);setJMenuBar(menuBar1);
    
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==miNovo)
        JOptionPane.showMessageDialog(null, "Menu novo", "Usando o menu", JOptionPane.INFORMATION_MESSAGE);
        if(e.getSource()==miSair)
            System.exit(0);
            } 
    public static void main(String[] args) {
     JFrame janela = new Exemplo15();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
