package estruturaSequencial;

import javax.swing.JOptionPane;

public class exercicio03 {
    public static void main(String[] args) {

        int a, b, c, d;

        a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de C:"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de D:"));

        int diferenca = a * b - c * d;

        JOptionPane.showMessageDialog(null, "DIFERENÇA = " + diferenca);
    }
}
