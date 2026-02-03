package estruturaSequencial;

import javax.swing.*;
import java.util.Locale;

public class Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int cod1, cod2, num1, num2;
        double val1, val2;

        cod1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da peça 1:"));
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da peça 1:"));
        val1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da peça 1:"));

        cod2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da peça 2:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da peça 2:"));
        val2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da peça 2:"));

        double total = num1 * val1 + num2 * val2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}
