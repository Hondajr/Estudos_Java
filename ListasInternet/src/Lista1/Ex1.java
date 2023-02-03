package Lista1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex1 extends JFrame {
    public Ex1(){
        super("Exercicio 1");
        Container c = getContentPane();

        //Formulario
        setSize(280,250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);

        //Componentes
        JCheckBox chkFile = new JCheckBox();
        JLabel lblFile = new JLabel();
        JCheckBox chkAlcatra = new JCheckBox();
        JLabel lblAlcatra = new JLabel();
        JCheckBox chkPicanha = new JCheckBox();
        JLabel lblPicanha = new JLabel();
        JTextField txtFile = new JTextField(30);
        JTextField txtAlcatra = new JTextField(30);
        JTextField txtPicanha = new JTextField(30);
        JButton btnExecutar = new JButton("Calcular");
        JButton btnLimpar = new JButton("Limpar");
        JLabel lblResultado = new JLabel();
        Font fonte = new Font("Arial", Font.PLAIN,16);
        JLabel lblLegenda1 = new JLabel();
        JLabel lblLegenda2 = new JLabel();

        //Formatando Componentes
        lblFile.setFont(fonte);
        lblResultado.setFont(fonte);
        lblPicanha.setFont(fonte);
        lblAlcatra.setFont(fonte);
        txtFile.setFont(fonte);
        txtPicanha.setFont(fonte);
        txtAlcatra.setFont(fonte);
        lblLegenda1.setFont(fonte);
        lblLegenda2.setFont(fonte);

        //Adicionando Componentes
        lblLegenda1.setBounds(10,10,100,20);
        c.add(lblLegenda1);
        lblLegenda1.setText("Produto");
        lblLegenda2.setBounds(130,10,150,20);
        c.add(lblLegenda2);
        lblLegenda2.setText("Qtdade (em Kg)");

        chkFile.setBounds(10,50,20,20);
        c.add(chkFile);
        chkAlcatra.setBounds(10,80,20,20);
        c.add(chkAlcatra);
        chkPicanha.setBounds(10,110,20,20);
        c.add(chkPicanha);

        lblFile.setBounds(50,50,100,20);
        c.add(lblFile);
        lblFile.setText("File Duplo");

        lblAlcatra.setBounds(50,80,100,20);
        c.add(lblAlcatra);
        lblAlcatra.setText("Alcatra");
        lblPicanha.setBounds(50,110,100,20);
        c.add(lblPicanha);
        lblPicanha.setText("Picanha");

        txtFile.setBounds(170,50,60,20);
        txtFile.setSize(60,20);
        c.add(txtFile);
        txtAlcatra.setBounds(170,80,60,20);
        c.add(txtAlcatra);
        txtPicanha.setBounds(170,110,60,20);
        c.add(txtPicanha);

        lblResultado.setBounds(10,170,450,20);
        c.add(lblResultado);

        btnLimpar.setBounds(120,140,100,20);
        c.add(btnLimpar);
        btnExecutar.setBounds(10,140,100,20);
        c.add(btnExecutar);

        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chkAlcatra.setSelected(false);
                chkFile.setSelected(false);
                chkPicanha.setSelected(false);
                txtAlcatra.setText("");
                txtFile.setText("");
                txtPicanha.setText("");
                lblResultado.setText("");
            }
        });


        btnExecutar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qtdFile,qtdAlcatra,qtdPicanha;
                qtdFile =0;
                qtdAlcatra = 0;
                qtdPicanha = 0;
                double valFile,valAlcatra,valPicanha = 0;
                double total = 0;

                if (chkFile.isSelected()==true){
                    if(txtFile.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Digite a Quantidade de File");
                        chkFile.setSelected(false);
                    }else{
                        qtdFile = Integer.parseInt(txtFile.getText());
                    }
                }else {
                    if(!txtFile.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Verifique a CheckBox de File");
                        txtFile.setText("");
                    }
                }

                if (chkAlcatra.isSelected()==true){
                    if(txtAlcatra.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Digite a Quantidade de Alcatra");
                        chkAlcatra.setSelected(false);
                    }else{
                        qtdAlcatra = Integer.parseInt(txtAlcatra.getText());
                    }
                }else {
                    if(!txtAlcatra.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Verifique a CheckBox de Alcatra");
                        txtAlcatra.setText("");
                    }
                }

                if (chkPicanha.isSelected()==true){
                    if(txtPicanha.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Digite a Quantidade de Picanha");
                        chkPicanha.setSelected(false);
                    }else{
                        qtdPicanha = Integer.parseInt(txtPicanha.getText());
                    }
                }else {
                    if(!txtPicanha.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Verifique a CheckBox de Picanha");
                        txtPicanha.setText("");
                    }
                }
                if (qtdFile< 5){
                    valFile = 5.8;
                }else{
                    valFile = 4.9;
                }
                if (qtdAlcatra< 5){
                    valAlcatra = 6.8;
                }else{
                    valAlcatra = 5.9;
                }
                if (qtdPicanha< 5){
                    valPicanha = 7.8;
                }else{
                    valPicanha = 6.9;
                }
                total = (qtdFile*valFile)+(qtdAlcatra*valAlcatra)+(qtdPicanha*valFile);
                String valtotal = NumberFormat.getCurrencyInstance(new Locale("pt","BR")).format(total);
                lblResultado.setText("Valor Total da Compra: "+valtotal);
            }
        });
    }

    public static void main(String[] args) {
        new Ex1();
    }
}
