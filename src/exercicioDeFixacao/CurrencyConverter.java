package exercicioDeFixacao;

import java.util.*;
import javax.swing.*;

public class CurrencyConverter {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double priceDollar = Double.parseDouble(JOptionPane.showInputDialog("What is the dollar price?"));
        double quantityDollar = Double.parseDouble(JOptionPane.showInputDialog("How many dollars will be bought?"));

        double iof = (priceDollar * quantityDollar) * 1.06;

        System.out.printf("Amount to be pain in reias = %.2f", iof);

    }
}
