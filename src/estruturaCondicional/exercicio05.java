package estruturaCondicional;

import java.util.*;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tabela = "-----------------------------------" +
                "\nCÓDIGO     ESPECIFICAÇÃO     PREÇO\n" +
                "-----------------------------------\n" +
                "1          Cachorro Quente   R$ 4.00\n" +
                "2          X-Salada          R$ 4.50\n" +
                "3          X-Bacon           R$ 5.00\n" +
                "4          Torrada simples   R$ 2.00\n" +
                "5          Refrigerante      R$ 1.50";
        System.out.println(tabela);
        System.out.print("\nInsira o código do item:");
        double cdg = scanner.nextDouble();
        System.out.print("Insira a quantidade do item:");
        double qtd = scanner.nextDouble();
        double total = 0;

        if (cdg == 1) {
            total = qtd * 4.0;
        }
        if (cdg == 2) {
            total = qtd * 4.5;
        }
        if (cdg == 3) {
            total = qtd * 5.0;
        }
        if (cdg == 4) {
            total = qtd * 2.0;
        }
        if (cdg == 5) {
            total = qtd * 1.5;
        }
        System.out.printf("Total: R$ %.2f%n", total);

        scanner.close();
    }
}
