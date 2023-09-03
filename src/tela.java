import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tela extends JFrame{
    private JButton clickHereButton;
    private JTextField textField1;
    private JPanel Painel;
    private JLabel lblEntrada1;
    private JTextField textField2;
    private JLabel lblEntrada2;
    private JLabel lblTotal;
    private String entrada1, entrada2, saida;
    private int total;


    public tela(){
        lblEntrada1.setVisible(false);
        lblEntrada2.setVisible(false);

        clickHereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada1 = textField1.getText();
                lblEntrada1.setText(entrada1);
                entrada2 = textField2.getText();
                lblEntrada2.setText(entrada2);
                total = Integer.parseInt(entrada1) + Integer.parseInt(entrada2);
                saida = Integer.toString(total);
                lblTotal.setText(saida);

            }
        });

    }

    public static void main(String[] args) {
        tela tela = new tela();
        tela.setContentPane(tela.Painel);
        tela.setTitle("Calculadora");
        tela.setSize(400,150);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
