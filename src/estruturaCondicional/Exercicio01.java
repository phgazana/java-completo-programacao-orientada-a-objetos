package estruturaCondicional;

import javax.swing.*;

public class Exercicio01 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro:"));

        if (num < 0) {
            JOptionPane.showMessageDialog(null, "NEGATIVO");
        } else {
            JOptionPane.showMessageDialog(null, "NÃO NEGATIVO");
        }

    }
}
