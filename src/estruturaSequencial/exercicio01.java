package estruturaSequencial;

import javax.swing.JOptionPane;

public class exercicio01 {
    public static void main(String[] args) {

        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor a ser somado:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor a ser somado:"));

        int soma = valor1 + valor2;

        JOptionPane.showMessageDialog(null, "SOMA = " + soma);
    }
}
