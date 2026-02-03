package estruturaFor;

import javax.swing.*;

public class Exercicio03 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de casos de teste:"));

        for (int i = 0; i < n; i++) {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor:"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor:"));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor:"));

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;

            System.out.printf("%.1f%n", media);
        }
    }
}
