package calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JButton btnExecutar;
    private JTextField textField1;
    private JPanel Painel;
    private JTextField textField2;
    private JLabel lblTotal;
    private JComboBox boxEscolhaMatematica;
    private JLabel txtOperacao;
    private int total;

    public Calculadora() {
        textField1.setText("0");
        textField2.setText("0");
        lblTotal.setSize(5, 3);

        btnExecutar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textField1.getText().isEmpty() ||
                        !textField1.getText().matches("[0-9]+([.,][0-9]+)?"))
                    textField1.setText("0");
                if (textField2.getText().isEmpty() || !textField2.getText().matches("[0-9]+([.,][0-9]+)?"))
                    textField2.setText("0");


                double input1, input2, result = 0;

                input1 = Double.parseDouble(textField1.getText().replace(",", "."));
                input2 = Double.parseDouble(textField2.getText().replace(",", "."));

                switch (boxEscolhaMatematica.getSelectedIndex()) {
                    case 0:
                        lblTotal.setText("Erro: Escolha a operação ");
                        break;
                    case 1:
                        result = input1 + input2;
                        lblTotal.setText(Double.toString(result));
                        break;
                    case 2:
                        result = input1 - input2;
                        lblTotal.setText(Double.toString(result));
                        break;
                    case 3:
                        result = input1 / input2;
                        lblTotal.setText(Double.toString(result));
                        break;
                    case 4:
                        result = input1 * input2;
                        lblTotal.setText(Double.toString(result));
                        break;
                }

                /* Corrigir formatação da String
                * if (lblTotal.getText().length() > 4 && !(boxEscolhaMatematica.getSelectedIndex() == 0)) {
                    lblTotal.setText(String.format("%.2f", Double.toString(result)));
                }*/


            }
        });

        boxEscolhaMatematica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (boxEscolhaMatematica.getSelectedIndex()) {
                    case 1:
                        txtOperacao.setText("+");
                        break;
                    case 2:
                        txtOperacao.setText("-");
                        break;
                    case 3:
                        txtOperacao.setText("/");
                        break;
                    case 4:
                        txtOperacao.setText("*");
                        break;
                    default:
                        txtOperacao.setText("");
                        break;
                }

            }
        });
    }

    public static void main(String[] args) {
        Calculadora tela = new Calculadora();
        tela.setContentPane(tela.Painel);
        tela.setTitle("Calculadora");
        tela.setSize(500, 150);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
