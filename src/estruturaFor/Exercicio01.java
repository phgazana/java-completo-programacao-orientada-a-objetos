package estruturaFor;

import javax.swing.*;

public class Exercicio01 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        if (num > 1000) {
            System.out.println("Número inválido");
        } else {
            for (int i = 1; i < num; i++) {
                System.out.println(i++);
            }
        }
    }
}
