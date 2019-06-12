package exemplo14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo14 extends JFrame implements ActionListener {

    JTextField T1;
    JMenuBar menuBar1;
    JMenu menuCadastro, menuRelatorio;
    JMenuItem miCliente, miFornecedor, mirlCliente, mirlFornecedor, miSair;

    Exemplo14() {
        setTitle("Uso de menus");
        setBounds(270, 50, 270, 130);
        getContentPane().setBackground(new Color(0, 128, 128));
        T1 = new JTextField();
        menuBar1 = new JMenuBar();
        menuCadastro = new JMenu("Cadastro");
        menuRelatorio = new JMenu("Relatório");
        miCliente = new JMenuItem("Cliente");
        miCliente.addActionListener(this);
        miFornecedor = new JMenuItem("Fornecedor");
        miFornecedor.addActionListener(this);
        miSair = new JMenuItem("Sair");
        miSair.addActionListener(this);
        menuCadastro.add(miCliente);
        menuCadastro.add(miFornecedor);
        menuCadastro.add(miSair);
        mirlCliente = new JMenuItem("Relação de clientes");
        mirlCliente.addActionListener(this);
        mirlFornecedor = new JMenuItem("Relação de fornecedores");
        mirlFornecedor.addActionListener(this);
        menuRelatorio.add(mirlCliente);
        menuRelatorio.add(mirlFornecedor);
        menuBar1.add(menuCadastro);
        menuBar1.add(menuRelatorio);
        setJMenuBar(menuBar1);
        getContentPane().add(T1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCliente) {
            T1.setText("Escolhido item cliente");
        }
        if (e.getSource() == miFornecedor) {
            T1.setText("Escolhido item fornecedor");
        }
        if (e.getSource() == mirlCliente) {
            T1.setText("Escolhido item relação cliente");
        }
        if (e.getSource() == mirlFornecedor) {
            T1.setText("Escolhido item relação fornecedor");
        }
        if (e.getSource() == miSair) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        JFrame janela = new Exemplo14();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
