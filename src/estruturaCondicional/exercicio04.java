package estruturaCondicional;

import javax.swing.*;


public class exercicio04 {
    public static void main(String[] args) {

        int horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora inicial do jogo:"));
        int horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora final do jogo:"));

        int duracaoTotal;

        if (horaInicial < horaFinal) {
            duracaoTotal = horaFinal - horaInicial;
        } else {
            duracaoTotal = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracaoTotal + " HORA(S)");
    }
}
