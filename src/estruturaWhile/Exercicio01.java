package estruturaWhile;

import javax.swing.*;

public class Exercicio01 {
    public static void main(String[] args) {

        int senha;
        do {
            senha = Integer.parseInt(JOptionPane.showInputDialog("Insira a senha:"));
            if (senha != 2002) {
                System.out.println("Senha Invalida");
            }
        } while (senha != 2002);
        System.out.println("Acesso Permitido");
    }
}
