package hotel;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author 3aetim
 */
public class Hotel extends JFrame implements ActionListener {

    JPanel P1, P2;
    JLabel vazia1, vazia2, vazia3, vazia4, vazia5, vazia6, lblnome, lbltipoap, lblnumdiarias, lblconsumoint, lbldesc,
            lblprecoconsumo, lblgastofconsumo, lblsubtotalf, lbltaxaservicof,
            lbltotalapagarf;
    JTextField txtnome, txtnumdiarias, txtdesccons, txtprecotconsumo;
    JComboBox cbotipoap;
    NumberFormat NF1;
    JButton btncalcular, limpar, addconsumo;

    JLabel nt;
    JTextArea tanota;

    Hotel() {
        setTitle("Hotel");
        setBounds(200, 100, 550, 480);
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

        NF1 = NumberFormat.getNumberInstance();
        NF1.setMinimumFractionDigits(2);

        P1 = new JPanel();
        P1.setBackground(Color.WHITE);
        P1.setLayout(new GridLayout(12, 2));

        P2 = new JPanel();
        P2.setBackground(Color.PINK);
        P2.setLayout(new BoxLayout(P2, BoxLayout.Y_AXIS));

        lblnome = new JLabel("Nome: ");
        lbltipoap = new JLabel("Tipo de apartamento: ");
        lblnumdiarias = new JLabel("Número de diárias: ");
        lblconsumoint = new JLabel("Consumo interno");
        lbldesc = new JLabel("Descrição: ");
        lblprecoconsumo = new JLabel("Preço total: ");
        lblgastofconsumo = new JLabel("Gasto com consumo: R$  ");
        lblsubtotalf = new JLabel("Subtotal: R$ ");
        lbltaxaservicof = new JLabel("Taxa de serviço (10%): R$ ");
        lbltotalapagarf = new JLabel("Total a pagar: R$ ");
        vazia1 = new JLabel("");
        vazia2 = new JLabel("");
        vazia3 = new JLabel("");
        vazia4 = new JLabel("");
        vazia5 = new JLabel("");
        vazia6 = new JLabel("");

        cbotipoap = new JComboBox();
        cbotipoap.addItem("Tipo A");
        cbotipoap.addItem("Tipo B");
        cbotipoap.addItem("Tipo C");
        cbotipoap.addItem("Tipo D");

        txtnome = new JTextField();
        txtnumdiarias = new JTextField();
        txtdesccons = new JTextField();
        txtprecotconsumo = new JTextField();

        btncalcular = new JButton("Calcular");
        btncalcular.addActionListener(this);
        limpar = new JButton("Limpar");
        limpar.addActionListener(this);
        addconsumo = new JButton("Adicionar");
        addconsumo.addActionListener(this);

        P1.add(lblnome);
        P1.add(txtnome);
        P1.add(lbltipoap);
        P1.add(cbotipoap);
        P1.add(lblnumdiarias);
        P1.add(txtnumdiarias);
        P1.add(lblconsumoint);
        P1.add(vazia1);
        P1.add(lbldesc);
        P1.add(txtdesccons);
        P1.add(lblprecoconsumo);
        P1.add(txtprecotconsumo);
        P1.add(vazia2);
        P1.add(addconsumo);
        P1.add(lblgastofconsumo);
        P1.add(vazia3);
        P1.add(lblsubtotalf);
        P1.add(vazia4);
        P1.add(lbltaxaservicof);
        P1.add(vazia5);
        P1.add(lbltotalapagarf);
        P1.add(vazia6);
        P1.add(limpar);
        P1.add(btncalcular);

        getContentPane().add(P1);
        getContentPane().add(P2);

        //P2
        nt = new JLabel("Nota fiscal");
        tanota = new JTextArea();
        tanota.setEnabled(false);

        P2.add(nt);
        P2.add(tanota);
    }

    public static void main(String[] args) {
        JFrame janela = new Hotel();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    int contador = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btncalcular) {
            contador++;
            if (contador == 1) {
                calcularestadia();
            } else {
                //limpe para iniciar outro calculo
            }
        }
        if (e.getSource() == addconsumo) {
            addconsumos();
        }
        if (e.getSource() == limpar) {
            contador = 0;
            limpar();
        }
    }

    ArrayList<String> descricao = new ArrayList<String>();
    ArrayList<Double> preco = new ArrayList<Double>();

    private void addconsumos() {
        if (!txtdesccons.getText().trim().equals("") && !txtprecotconsumo.getText().trim().equals("")) {
            descricao.add(txtdesccons.getText());
            preco.add(Double.parseDouble(txtprecotconsumo.getText()));
        } else {
        }
    }

    double subtotal, gastoconsumo, total, taxaservico, precodiaria;
    String nomehospede, tipoap, numdiarias, descprod, precocons;
    int i;

    private void calcularestadia() {

        subtotal = 0;
        gastoconsumo = 0;
        total = 0;
        taxaservico = 0;
        i = 0;

        nomehospede = txtnome.getText();
        tipoap = cbotipoap.getSelectedItem().toString();
        numdiarias = txtnumdiarias.getText();
        descprod = txtdesccons.getText();
        precocons = txtprecotconsumo.getText();

        if (tipoap.equals("Tipo A")) {
            precodiaria = 150;
            subtotal = Double.parseDouble(numdiarias) * precodiaria;
        } else if (tipoap.equals("Tipo B")) {
            precodiaria = 100;
            subtotal = Double.parseDouble(numdiarias) * precodiaria;
        } else if (tipoap.equals("Tipo C")) {
            precodiaria = 75;
            subtotal = Double.parseDouble(numdiarias) * precodiaria;
        } else if (tipoap.equals("Tipo D")) {
            precodiaria = 50;
            subtotal = Double.parseDouble(numdiarias) * precodiaria;
        }

        for (Double item : preco) {
            subtotal += item;
            gastoconsumo += item;
        }

        taxaservico = subtotal + (subtotal * 10 / 100);
        total = subtotal + taxaservico;

        lblgastofconsumo.setText((lblgastofconsumo.getText()) + NF1.format(gastoconsumo));
        lblsubtotalf.setText((lblsubtotalf.getText()) + NF1.format(subtotal));
        lbltaxaservicof.setText((lbltaxaservicof.getText()) + NF1.format(taxaservico));
        lbltotalapagarf.setText((lbltotalapagarf.getText()) + NF1.format(total));

        String consumos = new String();

        for (String item : descricao) {
            i++;
            consumos += "\nProduto: " + item;
            consumos += " Valor: R$ " + preco.get(i);
        }

        tanota.setText("\nHOTEL LUXÚRIA - TUDO PARA O SEU PRAZER"
                + "\n\nNome: " + nomehospede
                + "\nTipo de apartamento: " + tipoap
                + "\nNúmero de diárias: " + numdiarias
                + "\nPreço da diária: R$ " + NF1.format(precodiaria)
                + "\nConsumo interno: "
                + "\n" + consumos);
    }

    private void limpar() {
        txtnome.setText("");
        txtnumdiarias.setText("");
        txtdesccons.setText("");
        txtprecotconsumo.setText("");
        descricao.clear();
        preco.clear();
        lblprecoconsumo.setText("Preço total: ");
        lblgastofconsumo.setText("Gasto com consumo: R$  ");
        lblsubtotalf.setText("Subtotal: R$ ");
        lbltaxaservicof.setText("Taxa de serviço (10%): R$ ");
        lbltotalapagarf.setText("Total a pagar: R$ ");
    }
}
