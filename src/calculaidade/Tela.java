package calculaidade;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

public class Tela extends JFrame {
    private JButton calcularButton;
    private JPanel panel1;
    private JSpinner spinner1;
    private JLabel entradaDataAtual;
    private JLabel saidaIdade;
    private int entradaAno,ano;
    public Tela() {
        saidaIdade.setVisible(false);
        //spinner1.setSize(30,50);

        LocalDateTime data = LocalDateTime.now();
        entradaDataAtual.setText(Integer.toString(data.getYear()));

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entradaAno = (int) spinner1.getValue();
                ano = data.getYear() - entradaAno;
                saidaIdade.setVisible(true);
                saidaIdade.setText(Integer.toString(ano));
            }
        });

        }

    public static void main(String[] args) {
        Tela tela = new Tela();
        tela.setContentPane(tela.panel1);
        tela.setTitle("Calculadora de Idade");
        tela.setSize(400,150);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }

