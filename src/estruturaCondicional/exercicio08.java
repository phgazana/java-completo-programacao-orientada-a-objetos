package estruturaCondicional;

import javax.swing.*;
import java.util.Locale;

public class exercicio08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor:"));
        double imposto;

        if (valor > 2000.00 && valor < 3000.00) {
            imposto = (valor - 2000.0) * 0.08;
        }
        if (valor > 3000.00 && valor < 4500.00) {
            imposto = (valor - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (valor - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if (imposto > 0) {
            System.out.printf("R$ %.2f%n", imposto);
        } else {
            System.out.print("Isento");
        }
    }
}