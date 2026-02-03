package estruturaWhile;

import javax.swing.*;

public class Exercicio03 {
    public static void main(String[] args) {

        int codigo;
        int alcool = 0, gasolina = 0, diesel = 0;
        do {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do produto:"));
            if (codigo == 1) {
                alcool++;
            }
            if (codigo == 2) {
                gasolina++;
            }
            if (codigo == 3) {
                diesel++;
            }
        } while (codigo != 4);
        System.out.println("MUITO OBRIGADO\n" +
                "Alcool: " + alcool +
                "\nGasolina: " + gasolina +
                "\nDiesel: " + diesel);
    }
}
