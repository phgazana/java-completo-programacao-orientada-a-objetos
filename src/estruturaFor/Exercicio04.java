package estruturaFor;

import javax.swing.*;
import java.util.*;

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));

        for (int i = 0; i < n; i++) {
            int div1 = scanner.nextInt();
            int div2 = scanner.nextInt();

            if (div2 == 0) {
                System.out.println("divisão impossivel");
            } else {
                double div = (double) div1 / div2;
                System.out.printf("%.1f%n", div);
            }
        }
    }
}
