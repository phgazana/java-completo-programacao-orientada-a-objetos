package estruturaFor;

import javax.swing.*;

public class Exercicio06 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
