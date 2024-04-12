//Using vectors, its a system to count every positive and negative number given by the user

import javax.swing.*;

public class vetores {
    public static void main (String [] args){
        double [] real = new double[10];
        int neg =0, pos = 0;

        for (int cont = 0; cont <=9; cont++){

            String x = JOptionPane.showInputDialog(null,"insira um valor");
            real[cont] =Integer.parseInt(x);

            if (real[cont] < 0){
                neg++;

            }
            else {
                pos += real[cont];
            }
        }
        JOptionPane.showMessageDialog(null,"a quantidade de números negativos é de "+ neg);
        JOptionPane.showMessageDialog(null,"a soma dos números positivos foi de "+ pos);

    }
}
