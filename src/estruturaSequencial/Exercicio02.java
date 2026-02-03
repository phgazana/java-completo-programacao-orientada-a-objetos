package estruturaSequencial;

import javax.swing.JOptionPane;
import java.util.Locale;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double circulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio do círculo: "));
        double area = Math.PI * circulo * circulo;

        System.out.printf("A=%.4f%n", area);
    }
}
