package cadastrarpessoa;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Pessoa {
    public String nome, endereco, sexo, estadocivil;
    public Pessoa(String nomec, String end, String sexoc, String estcivil) {
        this.nome = nomec;
        this.endereco = end;
        this.sexo = sexoc;
        this.estadocivil = estcivil;
    }
}

public class CadastrarPessoa extends JFrame implements ActionListener {

    JLabel Lnome, Lendereco, Lsexo, Lestadocivil;
    JTextField Tnome, Tendereco;
    JTextArea TAlista;
    JRadioButton Rmasc, Rfem;
    ButtonGroup BGsexo;
    JButton Bmostrar;
    JComboBox Cestadocivil;
    JPanel P0, P1, P2;

    CadastrarPessoa() {
        P0 = new JPanel();
        P0.setLayout(new BoxLayout(P0, BoxLayout.Y_AXIS));

        setTitle("Cadastro de pessoa");
        setBounds(200, 100, 550, 480);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        getContentPane().add(P0);

        Lnome = new JLabel("Nome:");
        Lendereco = new JLabel("Endereço:");
        Lsexo = new JLabel("Sexo:");
        Lestadocivil = new JLabel("Estado civil:");

        Tnome = new JTextField();
        Tendereco = new JTextField();

        Rmasc = new JRadioButton("Masculino");
        Rfem = new JRadioButton("Feminino");
        BGsexo = new ButtonGroup();
        BGsexo.add(Rmasc);
        BGsexo.add(Rfem);

        Cestadocivil = new JComboBox();
        Cestadocivil.addItem("Solteiro(a)");
        Cestadocivil.addItem("Namorando");
        Cestadocivil.addItem("Divorciado(a)");
        Cestadocivil.addItem("Viúvo(a)");
        Cestadocivil.addItem("Casado(a)");

        P1 = new JPanel();
        P2 = new JPanel();
        P1.setLayout(new GridLayout(10, 1));
        P2.setLayout(new BoxLayout(P2, BoxLayout.Y_AXIS));

        P1.add(Lnome);
        P1.add(Tnome);
        P1.add(Lendereco);
        P1.add(Tendereco);
        P1.add(Lsexo);
        P1.add(Rmasc);
        P1.add(Rfem);
        P1.add(Lestadocivil);
        P1.add(Cestadocivil);

        Bmostrar = new JButton("Mostrar");
        Bmostrar.addActionListener(this);
        P2.add(Bmostrar);

        TAlista = new JTextArea();
        P2.add(TAlista);

        P0.add(P1);
        P0.add(P2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Bmostrar) {
            String sexo = new String();
            if (Rfem.isSelected()) {
                sexo = "Feminino";
            } else {
                sexo = "Masculino";
            }
            Pessoa p = new Pessoa(Tnome.getText(), Tendereco.getText(), sexo, Cestadocivil.getSelectedItem().toString());
            TAlista.setText(p.nome + "\n" + p.endereco + "\n" + p.sexo + "\n" + p.estadocivil);
        }
    }

    public static void main(String[] args) {
        JFrame janela = new CadastrarPessoa();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
