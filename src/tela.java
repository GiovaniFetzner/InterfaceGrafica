import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tela extends JFrame {
    private JButton btnExecutar;
    private JTextField textField1;
    private JPanel Painel;
    private JLabel lblEntrada1;
    private JTextField textField2;
    private JLabel lblEntrada2;
    private JLabel lblTotal;
    private JComboBox boxEscolhaMatematica;
    private JLabel txtOperacao;
    private String entrada1, entrada2, saida;
    private int total;

    public tela() {
        lblEntrada1.setVisible(false);
        lblEntrada2.setVisible(false);
        lblEntrada1.getText();

        btnExecutar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada1 = textField1.getText();
                lblEntrada1.setText(entrada1);
                entrada2 = textField2.getText();
                lblEntrada2.setText(entrada2);

                switch (boxEscolhaMatematica.getSelectedIndex()){
                    case 0:
                        lblTotal.setText("Erro, favor escolher a operação matematica");
                        break;
                    case 1:
                        total = Integer.parseInt(entrada1) + Integer.parseInt(entrada2);
                        break;
                    case 2:
                        total = Integer.parseInt(entrada1) - Integer.parseInt(entrada2);
                        break;
                    case 3:
                        total = Integer.parseInt(entrada1) / Integer.parseInt(entrada2);
                        break;
                    case 4:
                        total = Integer.parseInt(entrada1) * Integer.parseInt(entrada2);
                        break;
                }

               // total = Integer.parseInt(entrada1) + Integer.parseInt(entrada2);
                //saida = Integer.toString(total) = Integer.parseInt(entrada1) + Integer.parseInt(entrada2);
                saida = Integer.toString(total);
                lblTotal.setText(saida);

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
        tela tela = new tela();
        tela.setContentPane(tela.Painel);
        tela.setTitle("Calculadora");
        tela.setSize(400, 150);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
