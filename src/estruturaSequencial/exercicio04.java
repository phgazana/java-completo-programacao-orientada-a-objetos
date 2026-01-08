package estruturaSequencial;

import javax.swing.JOptionPane;

public class exercicio04 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira seu número:"));
        double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Insira o número de horas trabalhadas:"));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor recebido por hora:"));

        double salario = horasTrabalhadas * valorHora;

        JOptionPane.showMessageDialog(null, "NUMBER = " + numero +
                "\nSALARY = U$  " + salario);

    }
}
