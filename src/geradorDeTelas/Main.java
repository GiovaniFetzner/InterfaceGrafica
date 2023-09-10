package geradorDeTelas;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        int numero = 0;
        int soma = 0;
        int par = 0;
        int impar = 0;
        int acimaCem = 0;
        int media = 0;
        int contador = 0;

        ImageIcon imagem = new ImageIcon("src/imagens/Acer_Wallpaper_03_5000x2814.jpg");

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um " +
                            "número <br>(0 interrompe)<br></html>", "Favor informe um valor",
                    JOptionPane.QUESTION_MESSAGE));

            if (numero == 0) break;

            contador++;
            soma += numero;

            // Verifica par e impar

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            // Verifica algarismo acima de 100

            if (numero > 100) acimaCem++;

        } while (numero != 0);
            media = soma/contador;

        //JOptionPane.showMessageDialog(null, "soma " + soma);

        JOptionPane.showMessageDialog(null, "<html>Soma: " + soma + "<br> Pares: " + par
                        + " <br> Impares: " + impar + " <br> Acima de 100: " + acimaCem + " <br> Media: " + media
                        + " <br> Quantidade de elementos: " + contador + "</html>",
                "Resultado Final", JOptionPane.WARNING_MESSAGE);

    }
}
