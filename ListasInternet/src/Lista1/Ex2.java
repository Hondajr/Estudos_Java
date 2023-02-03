package Lista1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class Ex2 extends JFrame {
    JButton btnmedia = new JButton("Calcular Media");
    JButton btnNovoAluno = new JButton("Adicionar Aluno");
    JButton btnRemoverAluno1 = new JButton();
    JButton btnRemoverAluno2 = new JButton();
    JButton btnRemoverAluno3 = new JButton();
    JButton btnRemoverAluno4 = new JButton();
    JButton btnRemoverAluno5 = new JButton();
    JButton btnRemoverAluno6 = new JButton();
    JButton btnRemoverAluno7 = new JButton();
    JButton btnRemoverAluno8 = new JButton();
    JButton btnRemoverAluno9 = new JButton();
    JButton btnRemoverAluno10 = new JButton();

    ImageIcon aprovado = new ImageIcon(Objects.requireNonNull(getClass().getResource("App.png")));
    ImageIcon reprovado = new ImageIcon(Objects.requireNonNull(getClass().getResource("Rep.png")));
    ImageIcon remover = new ImageIcon(Objects.requireNonNull(getClass().getResource("Minus.png")));

    JTextField txtAl1 = new JTextField("");
    JTextField txtAl1N1 = new JTextField("");
    JTextField txtAl1N2 = new JTextField("");
    JTextField txtAl1Med = new JTextField("");
    JLabel lblAl1Stats = new JLabel("");


    JTextField txtAl2 = new JTextField("");
    JTextField txtAl2N1 = new JTextField("");
    JTextField txtAl2N2 = new JTextField("");
    JTextField txtAl2Med = new JTextField("");
    JLabel lblAl2Stats = new JLabel();

    JTextField txtAl3 = new JTextField("");
    JTextField txtAl3N1 = new JTextField("");
    JTextField txtAl3N2 = new JTextField("");
    JTextField txtAl3Med = new JTextField("");
    JLabel lblAl3Stats = new JLabel();

    JTextField txtAl4 = new JTextField("");
    JTextField txtAl4N1 = new JTextField("");
    JTextField txtAl4N2 = new JTextField("");
    JTextField txtAl4Med = new JTextField("");
    JLabel lblAl4Stats = new JLabel();

    JTextField txtAl5 = new JTextField("");
    JTextField txtAl5N1 = new JTextField("");
    JTextField txtAl5N2 = new JTextField("");
    JTextField txtAl5Med = new JTextField("");
    JLabel lblAl5Stats = new JLabel();

    JTextField txtAl6 = new JTextField("");
    JTextField txtAl6N1 = new JTextField("");
    JTextField txtAl6N2 = new JTextField("");
    JTextField txtAl6Med = new JTextField("");
    JLabel lblAl6Stats = new JLabel();

    JTextField txtAl7 = new JTextField("");
    JTextField txtAl7N1 = new JTextField("");
    JTextField txtAl7N2 = new JTextField("");
    JTextField txtAl7Med = new JTextField("");
    JLabel lblAl7Stats = new JLabel();

    JTextField txtAl8 = new JTextField("");
    JTextField txtAl8N1 = new JTextField("");
    JTextField txtAl8N2 = new JTextField("");
    JTextField txtAl8Med = new JTextField("");
    JLabel lblAl8Stats = new JLabel();

    JTextField txtAl9 = new JTextField("");
    JTextField txtAl9N1 = new JTextField("");
    JTextField txtAl9N2 = new JTextField("");
    JTextField txtAl9Med = new JTextField("");
    JLabel lblAl9Stats = new JLabel();

    JTextField txtAl10 = new JTextField("");
    JTextField txtAl10N1 = new JTextField("");
    JTextField txtAl10N2 = new JTextField("");
    JTextField txtAl10Med = new JTextField();
    JLabel lblAl10Stats = new JLabel();
    
    Container c = getContentPane();
    public void EditarFrame(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(820,600);
        setLayout(null);
        setVisible(true);
    }
    public void AdicaoComp(){
        c.add(btnNovoAluno);
        c.add(btnmedia);


        c.add(txtAl1);
        c.add(txtAl1N1);
        c.add(txtAl1N2);
        c.add(txtAl1Med);
        c.add(lblAl1Stats);
        c.add(txtAl2);
        c.add(txtAl2N1);
        c.add(txtAl2N2);
        c.add(txtAl2Med);
        c.add(lblAl2Stats);
        c.add(txtAl3);
        c.add(txtAl3N1);
        c.add(txtAl3N2);
        c.add(txtAl3Med);
        c.add(lblAl3Stats);
        c.add(txtAl4);
        c.add(txtAl4N1);
        c.add(txtAl4N2);
        c.add(txtAl4Med);
        c.add(lblAl4Stats);
        c.add(txtAl5);
        c.add(txtAl5N1);
        c.add(txtAl5N2);
        c.add(txtAl5Med);
        c.add(lblAl5Stats);
        c.add(txtAl6);
        c.add(txtAl6N1);
        c.add(txtAl6N2);
        c.add(txtAl6Med);
        c.add(lblAl6Stats);
        c.add(txtAl7);
        c.add(txtAl7N1);
        c.add(txtAl7N2);
        c.add(txtAl7Med);
        c.add(lblAl7Stats);
        c.add(txtAl8);
        c.add(txtAl8N1);
        c.add(txtAl8N2);
        c.add(txtAl8Med);
        c.add(lblAl8Stats);
        c.add(txtAl9);
        c.add(txtAl9N1);
        c.add(txtAl9N2);
        c.add(txtAl9Med);
        c.add(lblAl9Stats);
        c.add(txtAl10);
        c.add(txtAl10N1);
        c.add(txtAl10N2);
        c.add(txtAl10Med);
        c.add(lblAl10Stats);

        c.add(btnRemoverAluno1);
        c.add(btnRemoverAluno2);
        c.add(btnRemoverAluno3);
        c.add(btnRemoverAluno4);
        c.add(btnRemoverAluno5);
        c.add(btnRemoverAluno6);
        c.add(btnRemoverAluno7);
        c.add(btnRemoverAluno8);
        c.add(btnRemoverAluno9);
        c.add(btnRemoverAluno10);
    }
    public void FormatarComp(){
        btnNovoAluno.setBounds(10,10,200,50);
        btnmedia.setBounds(520,10,170,50);

        btnRemoverAluno1.setBounds(750,60,50,50);
        btnRemoverAluno1.setIcon(remover);
        btnRemoverAluno2.setBounds(750,110,50,50);
        btnRemoverAluno2.setIcon(remover);
        btnRemoverAluno3.setBounds(750,160,50,50);
        btnRemoverAluno3.setIcon(remover);
        btnRemoverAluno4.setBounds(750,210,50,50);
        btnRemoverAluno4.setIcon(remover);
        btnRemoverAluno5.setBounds(750,260,50,50);
        btnRemoverAluno5.setIcon(remover);
        btnRemoverAluno6.setBounds(750,310,50,50);
        btnRemoverAluno6.setIcon(remover);
        btnRemoverAluno7.setBounds(750,360,50,50);
        btnRemoverAluno7.setIcon(remover);
        btnRemoverAluno8.setBounds(750,410,50,50);
        btnRemoverAluno8.setIcon(remover);
        btnRemoverAluno9.setBounds(750,460,50,50);
        btnRemoverAluno9.setIcon(remover);
        btnRemoverAluno10.setBounds(750,510,50,50);
        btnRemoverAluno10.setIcon(remover);


        txtAl1.setBounds(10,60,500,50);
        txtAl1N1.setBounds(520,60,50,50);
        txtAl1N2.setBounds(580,60,50,50);
        txtAl1Med.setBounds(640,60,50,50);
        lblAl1Stats.setBounds(700,60,50,50);

        txtAl2.setBounds(10,110,500,50);
        txtAl2N1.setBounds(520,110,50,50);
        txtAl2N2.setBounds(580,110,50,50);
        txtAl2Med.setBounds(640,110,50,50);
        lblAl2Stats.setBounds(700,110,50,50);

        txtAl3.setBounds(10,160,500,50);
        txtAl3N1.setBounds(520,160,50,50);
        txtAl3N2.setBounds(580,160,50,50);
        txtAl3Med.setBounds(640,160,50,50);
        lblAl3Stats.setBounds(700,160,50,50);

        txtAl4.setBounds(10,210,500,50);
        txtAl4N1.setBounds(520,210,50,50);
        txtAl4N2.setBounds(580,210,50,50);
        txtAl4Med.setBounds(640,210,50,50);
        lblAl4Stats.setBounds(700,210,50,50);

        txtAl5.setBounds(10,260,500,50);
        txtAl5N1.setBounds(520,260,50,50);
        txtAl5N2.setBounds(580,260,50,50);
        txtAl5Med.setBounds(640,260,50,50);
        lblAl5Stats.setBounds(700,260,50,50);

        txtAl6.setBounds(10,310,500,50);
        txtAl6N1.setBounds(520,310,50,50);
        txtAl6N2.setBounds(580,310,50,50);
        txtAl6Med.setBounds(640,310,50,50);
        lblAl6Stats.setBounds(700,310,50,50);

        txtAl7.setBounds(10,360,500,50);
        txtAl7N1.setBounds(520,360,50,50);
        txtAl7N2.setBounds(580,360,50,50);
        txtAl7Med.setBounds(640,360,50,50);
        lblAl7Stats.setBounds(700,360,50,50);

        txtAl8.setBounds(10,410,500,50);
        txtAl8N1.setBounds(520,410,50,50);
        txtAl8N2.setBounds(580,410,50,50);
        txtAl8Med.setBounds(640,410,50,50);
        lblAl8Stats.setBounds(700,410,50,50);

        txtAl9.setBounds(10,460,500,50);
        txtAl9N1.setBounds(520,460,50,50);
        txtAl9N2.setBounds(580,460,50,50);
        txtAl9Med.setBounds(640,460,50,50);
        lblAl9Stats.setBounds(700,460,50,50);

        txtAl10.setBounds(10,510,500,50);
        txtAl10N1.setBounds(520,510,50,50);
        txtAl10N2.setBounds(580,510,50,50);
        txtAl10Med.setBounds(640,510,50,50);
        lblAl10Stats.setBounds(700,510,50,50);

        //Enabled

        
        btnRemoverAluno2.setEnabled(false);
        btnRemoverAluno3.setEnabled(false);
        btnRemoverAluno4.setEnabled(false);
        btnRemoverAluno5.setEnabled(false);
        btnRemoverAluno6.setEnabled(false);
        btnRemoverAluno7.setEnabled(false);
        btnRemoverAluno8.setEnabled(false);
        btnRemoverAluno9.setEnabled(false);
        btnRemoverAluno10.setEnabled(false);
        
        txtAl2.setEnabled(false);
        txtAl2N1.setEnabled(false);
        txtAl2N2.setEnabled(false);
        txtAl2Med.setEnabled(false);
        lblAl2Stats.setEnabled(false);

        txtAl3.setEnabled(false);
        txtAl3N1.setEnabled(false);
        txtAl3N2.setEnabled(false);
        txtAl3Med.setEnabled(false);
        lblAl3Stats.setEnabled(false);

        txtAl4.setEnabled(false);
        txtAl4N1.setEnabled(false);
        txtAl4N2.setEnabled(false);
        txtAl4Med.setEnabled(false);
        lblAl4Stats.setEnabled(false);

        txtAl5.setEnabled(false);
        txtAl5N1.setEnabled(false);
        txtAl5N2.setEnabled(false);
        txtAl5Med.setEnabled(false);
        lblAl5Stats.setEnabled(false);

        txtAl6.setEnabled(false);
        txtAl6N1.setEnabled(false);
        txtAl6N2.setEnabled(false);
        txtAl6Med.setEnabled(false);
        lblAl6Stats.setEnabled(false);

        txtAl7.setEnabled(false);
        txtAl7N1.setEnabled(false);
        txtAl7N2.setEnabled(false);
        txtAl7Med.setEnabled(false);
        lblAl7Stats.setEnabled(false);

        txtAl8.setEnabled(false);
        txtAl8N1.setEnabled(false);
        txtAl8N2.setEnabled(false);
        txtAl8Med.setEnabled(false);
        lblAl8Stats.setEnabled(false);

        txtAl9.setEnabled(false);
        txtAl9N1.setEnabled(false);
        txtAl9N2.setEnabled(false);
        txtAl9Med.setEnabled(false);
        lblAl9Stats.setEnabled(false);

        txtAl10.setEnabled(false);
        txtAl10N1.setEnabled(false);
        txtAl10N2.setEnabled(false);
        txtAl10Med.setEnabled(false);
        lblAl10Stats.setEnabled(false);
    }
    public Ex2(){
        EditarFrame();
        AdicaoComp();
        FormatarComp();
        
        btnRemoverAluno1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAl1.setText("");
                txtAl1N1.setText("");
                txtAl1N2.setText("");
                txtAl1Med.setText("");
                lblAl1Stats.setIcon(null);
                JOptionPane.showMessageDialog(null, "Não é possivel remover o primeiro aluno!");
            }
        });
        btnRemoverAluno2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAl2.setText("");
                txtAl2N1.setText("");
                txtAl2N2.setText("");
                txtAl2Med.setText("");
                lblAl2Stats.setIcon(null);
                
                txtAl2.setEnabled(false);
                txtAl2N1.setEnabled(false);
                txtAl2N2.setEnabled(false);
                txtAl2Med.setEnabled(false);
                lblAl2Stats.setEnabled(false);
                btnRemoverAluno2.setEnabled(false);
            }
        });
        btnRemoverAluno3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAl3.setText("");
                txtAl3N1.setText("");
                txtAl3N2.setText("");
                txtAl3Med.setText("");
                lblAl3Stats.setIcon(null);
                
                txtAl3.setEnabled(false);
                txtAl3N1.setEnabled(false);
                txtAl3N2.setEnabled(false);
                txtAl3Med.setEnabled(false);
                lblAl3Stats.setEnabled(false);
                btnRemoverAluno3.setEnabled(false);
            }
        });
        btnRemoverAluno4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAl4.setText("");
                txtAl4N1.setText("");
                txtAl4N2.setText("");
                txtAl4Med.setText("");
                lblAl4Stats.setIcon(null);
                
                txtAl4.setEnabled(false);
                txtAl4N1.setEnabled(false);
                txtAl4N2.setEnabled(false);
                txtAl4Med.setEnabled(false);
                lblAl4Stats.setEnabled(false);
                btnRemoverAluno4.setEnabled(false);
            }
        });
        btnRemoverAluno5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAl5.setText("");
                txtAl5N1.setText("");
                txtAl5N2.setText("");
                txtAl5Med.setText("");
                lblAl5Stats.setIcon(null);
                
                txtAl5.setEnabled(false);
                txtAl5N1.setEnabled(false);
                txtAl5N2.setEnabled(false);
                txtAl5Med.setEnabled(false);
                lblAl5Stats.setEnabled(false);
                btnRemoverAluno5.setEnabled(false);
            }
        });
        btnRemoverAluno6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAl6.setText("");
                txtAl6N1.setText("");
                txtAl6N2.setText("");
                txtAl6Med.setText("");
                lblAl6Stats.setIcon(null);
                
                txtAl6.setEnabled(false);
                txtAl6N1.setEnabled(false);
                txtAl6N2.setEnabled(false);
                txtAl6Med.setEnabled(false);
                lblAl6Stats.setEnabled(false);
                btnRemoverAluno6.setEnabled(false);
            }
        });
        btnRemoverAluno7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAl7.setText("");
                txtAl7N1.setText("");
                txtAl7N2.setText("");
                txtAl7Med.setText("");
                lblAl7Stats.setIcon(null);
                
                txtAl7.setEnabled(false);
                txtAl7N1.setEnabled(false);
                txtAl7N2.setEnabled(false);
                txtAl7Med.setEnabled(false);
                lblAl7Stats.setEnabled(false);
                btnRemoverAluno7.setEnabled(false);
            }   
        });
        btnRemoverAluno8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAl8.setText("");
                txtAl8N1.setText("");
                txtAl8N2.setText("");
                txtAl8Med.setText("");
                lblAl8Stats.setIcon(null);
                
                txtAl8.setEnabled(false);
                txtAl8N1.setEnabled(false);
                txtAl8N2.setEnabled(false);
                txtAl8Med.setEnabled(false);
                lblAl8Stats.setEnabled(false);
                btnRemoverAluno8.setEnabled(false);
            }
        });
        btnRemoverAluno9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAl9.setText("");
                txtAl9N1.setText("");
                txtAl9N2.setText("");
                txtAl9Med.setText("");
                lblAl9Stats.setIcon(null);
                
                txtAl9.setEnabled(false);
                txtAl9N1.setEnabled(false);
                txtAl9N2.setEnabled(false);
                txtAl9Med.setEnabled(false);
                lblAl9Stats.setEnabled(false);
                btnRemoverAluno9.setEnabled(false);
            }
        });
        btnRemoverAluno10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAl10.setText("");
                txtAl10N1.setText("");
                txtAl10N2.setText("");
                txtAl10Med.setText("");
                lblAl10Stats.setIcon(null);
                
                txtAl10.setEnabled(false);
                txtAl10N1.setEnabled(false);
                txtAl10N2.setEnabled(false);
                txtAl10Med.setEnabled(false);
                lblAl10Stats.setEnabled(false);
                btnRemoverAluno10.setEnabled(false);
            }
        });

        btnNovoAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!lblAl2Stats.isEnabled()){
                    txtAl2.setEnabled(true);
                    txtAl2N1.setEnabled(true);
                    txtAl2N2.setEnabled(true);
                    txtAl2Med.setEnabled(true);
                    lblAl2Stats.setEnabled(true);
                    btnRemoverAluno2.setEnabled(true);
                } else if (!lblAl3Stats.isEnabled()) {
                    txtAl3.setEnabled(true);
                    txtAl3N1.setEnabled(true);
                    txtAl3N2.setEnabled(true);
                    txtAl3Med.setEnabled(true);
                    lblAl3Stats.setEnabled(true);
                    btnRemoverAluno3.setEnabled(true);
                }else if (!lblAl4Stats.isEnabled()) {
                    txtAl4.setEnabled(true);
                    txtAl4N1.setEnabled(true);
                    txtAl4N2.setEnabled(true);
                    txtAl4Med.setEnabled(true);
                    lblAl4Stats.setEnabled(true);
                    btnRemoverAluno4.setEnabled(true);
                }else if (!lblAl5Stats.isEnabled()) {
                    txtAl5.setEnabled(true);
                    txtAl5N1.setEnabled(true);
                    txtAl5N2.setEnabled(true);
                    txtAl5Med.setEnabled(true);
                    lblAl5Stats.setEnabled(true);
                    btnRemoverAluno5.setEnabled(true);
                }else if (!lblAl6Stats.isEnabled()) {
                    txtAl6.setEnabled(true);
                    txtAl6N1.setEnabled(true);
                    txtAl6N2.setEnabled(true);
                    txtAl6Med.setEnabled(true);
                    lblAl6Stats.setEnabled(true);
                    btnRemoverAluno6.setEnabled(true);
                }else if (!lblAl7Stats.isEnabled()) {
                    txtAl7.setEnabled(true);
                    txtAl7N1.setEnabled(true);
                    txtAl7N2.setEnabled(true);
                    txtAl7Med.setEnabled(true);
                    lblAl7Stats.setEnabled(true);
                    btnRemoverAluno7.setEnabled(true);
                }else if (!lblAl8Stats.isEnabled()) {
                    txtAl8.setEnabled(true);
                    txtAl8N1.setEnabled(true);
                    txtAl8N2.setEnabled(true);
                    txtAl8Med.setEnabled(true);
                    lblAl8Stats.setEnabled(true);
                    btnRemoverAluno8.setEnabled(true);
                }else if (!lblAl9Stats.isEnabled()) {
                    txtAl9.setEnabled(true);
                    txtAl9N1.setEnabled(true);
                    txtAl9N2.setEnabled(true);
                    txtAl9Med.setEnabled(true);
                    lblAl9Stats.setEnabled(true);
                    btnRemoverAluno9.setEnabled(true);
                }else if (!lblAl10Stats.isEnabled()) {
                    txtAl10.setEnabled(true);
                    txtAl10N1.setEnabled(true);
                    txtAl10N2.setEnabled(true);
                    txtAl10Med.setEnabled(true);
                    lblAl10Stats.setEnabled(true);
                    btnRemoverAluno10.setEnabled(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Numero maximo de Alunos Atingido");
                }
            }
        });

        btnmedia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n1,n2,med;
                try {
                    n1 = Integer.parseInt(txtAl1N1.getText());
                    n2 = Integer.parseInt(txtAl1N2.getText());
                    med = (n1 + n2) / 2;
                    txtAl1Med.setText(med + "");
                    if (med >= 7) {
                        lblAl1Stats.setIcon(aprovado);
                    } else {
                        lblAl1Stats.setIcon(reprovado);
                    }

                    if (lblAl2Stats.isEnabled()) {
                        n1 = Integer.parseInt(txtAl2N1.getText());
                        n2 = Integer.parseInt(txtAl2N2.getText());
                        med = (n1 + n2) / 2;
                        txtAl2Med.setText(med + "");
                        if (med >= 7) {
                            lblAl2Stats.setIcon(aprovado);
                        } else {
                            lblAl2Stats.setIcon(reprovado);
                        }
                    }
                    if (lblAl3Stats.isEnabled()) {
                        n1 = Integer.parseInt(txtAl3N1.getText());
                        n2 = Integer.parseInt(txtAl3N2.getText());
                        med = (n1 + n2) / 2;
                        txtAl3Med.setText(med + "");
                        if (med >= 7) {
                            lblAl3Stats.setIcon(aprovado);
                        } else {
                            lblAl3Stats.setIcon(reprovado);
                        }
                    }
                    if (lblAl4Stats.isEnabled()) {
                        n1 = Integer.parseInt(txtAl4N1.getText());
                        n2 = Integer.parseInt(txtAl4N2.getText());
                        med = (n1 + n2) / 2;
                        txtAl4Med.setText(med + "");
                        if (med >= 7) {
                            lblAl4Stats.setIcon(aprovado);
                        } else {
                            lblAl4Stats.setIcon(reprovado);
                        }
                    }
                    if (lblAl5Stats.isEnabled()) {
                        n1 = Integer.parseInt(txtAl5N1.getText());
                        n2 = Integer.parseInt(txtAl5N2.getText());
                        med = (n1 + n2) / 2;
                        txtAl5Med.setText(med + "");
                        if (med >= 7) {
                            lblAl5Stats.setIcon(aprovado);
                        } else {
                            lblAl5Stats.setIcon(reprovado);
                        }
                    }
                    if (lblAl6Stats.isEnabled()) {
                        n1 = Integer.parseInt(txtAl6N1.getText());
                        n2 = Integer.parseInt(txtAl6N2.getText());
                        med = (n1 + n2) / 2;
                        txtAl6Med.setText(med + "");
                        if (med >= 7) {
                            lblAl6Stats.setIcon(aprovado);
                        } else {
                            lblAl6Stats.setIcon(reprovado);
                        }
                    }
                    if (lblAl7Stats.isEnabled()) {
                        n1 = Integer.parseInt(txtAl7N1.getText());
                        n2 = Integer.parseInt(txtAl7N2.getText());
                        med = (n1 + n2) / 2;
                        txtAl7Med.setText(med + "");
                        if (med >= 7) {
                            lblAl7Stats.setIcon(aprovado);
                        } else {
                            lblAl7Stats.setIcon(reprovado);
                        }
                    }
                    if (lblAl8Stats.isEnabled()) {
                        n1 = Integer.parseInt(txtAl8N1.getText());
                        n2 = Integer.parseInt(txtAl8N2.getText());
                        med = (n1 + n2) / 2;
                        txtAl8Med.setText(med + "");
                        if (med >= 7) {
                            lblAl8Stats.setIcon(aprovado);
                        } else {
                            lblAl8Stats.setIcon(reprovado);
                        }
                    }
                    if (lblAl9Stats.isEnabled()) {
                        n1 = Integer.parseInt(txtAl9N1.getText());
                        n2 = Integer.parseInt(txtAl9N2.getText());
                        med = (n1 + n2) / 2;
                        txtAl9Med.setText(med + "");
                        if (med >= 7) {
                            lblAl9Stats.setIcon(aprovado);
                        } else {
                            lblAl9Stats.setIcon(reprovado);
                        }
                    }
                    if (lblAl10Stats.isEnabled()) {
                        n1 = Integer.parseInt(txtAl10N1.getText());
                        n2 = Integer.parseInt(txtAl10N2.getText());
                        med = (n1 + n2) / 2;
                        txtAl10Med.setText(med + "");
                        if (med >= 7) {
                            lblAl10Stats.setIcon(aprovado);
                        } else {
                            lblAl10Stats.setIcon(reprovado);
                        }
                    }
                }catch (Exception erro){
                    JOptionPane.showMessageDialog(null, "Erro: "+erro);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Ex2();
    }
}
