package Lista1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal{
    JFrame frmPrincipal = new JFrame();
    public JButton btnExec = new JButton("Executar");
    JComboBox cmbPrincipal = new JComboBox();
    public int ComboIndex;
    public void EditarFrame(){
        frmPrincipal.setSize(315,100);
        frmPrincipal.setResizable(false);
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setVisible(true);
        frmPrincipal.setLayout(null);

        btnExec.setBounds(0,30,100,20);
        frmPrincipal.add(btnExec);

        cmbPrincipal.setBounds(0,0,300,20);
        frmPrincipal.add(cmbPrincipal);

        cmbPrincipal.addItem("Selecione o exercicio");
        cmbPrincipal.addItem("Açougue");
        cmbPrincipal.addItem("Medias");
        /*

        cmbPrincipal.addItem("Exercicio 3");
        cmbPrincipal.addItem("Exercicio 4");
        cmbPrincipal.addItem("Exercicio 5");
        cmbPrincipal.addItem("Exercicio 6");
        cmbPrincipal.addItem("Exercicio 7");
        cmbPrincipal.addItem("Exercicio 8");
        cmbPrincipal.addItem("Exercicio 9");
        cmbPrincipal.addItem("Exercicio 10");
        cmbPrincipal.addItem("Exercicio 11");
        cmbPrincipal.addItem("Exercicio 12");
        cmbPrincipal.addItem("Exercicio 13");
        cmbPrincipal.addItem("Exercicio 14");
        cmbPrincipal.addItem("Exercicio 15");
        cmbPrincipal.addItem("Exercicio 16");
        cmbPrincipal.addItem("Exercicio 17");
        cmbPrincipal.addItem("Exercicio 18");
        cmbPrincipal.addItem("Exercicio 19");
        cmbPrincipal.addItem("Exercicio 20");
        cmbPrincipal.addItem("Exercicio 21");
        cmbPrincipal.addItem("Exercicio 22");
        cmbPrincipal.addItem("Exercicio 23");
        cmbPrincipal.addItem("Exercicio 24");
        cmbPrincipal.addItem("Exercicio 25");
        */

    }

    public Principal(){
        EditarFrame();
        btnExec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (cmbPrincipal.getSelectedIndex()){
                    case 0: JOptionPane.showMessageDialog(null,"Favor Selecionar o Exercicio");break;
                    case 1: new Ex1();break;
                    case 2: new Ex2();break;
                }
            }
        });
    }

    public static void main(String[] args) {
        new Principal();
    }
}
