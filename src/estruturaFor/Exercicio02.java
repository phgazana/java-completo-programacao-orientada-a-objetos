package estruturaFor;

import javax.swing.*;

public class Exercicio02 {
    public static void main(String[] args) {

        int x, soma, in = 0, out = 0;

        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira o número:"));

        for (int i = 0; i < num; i++) {
            x = Integer.parseInt(JOptionPane.showInputDialog("Insira o número"));
            soma = x;
            if (soma >= 10 && soma <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in\n" +
                out + " out");
    }

}
