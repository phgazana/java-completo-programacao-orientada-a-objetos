package estruturaCondicional;
import javax.swing.*;

public class exercicio02 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira o número"));
        if(num % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

    }
}
