//Using vectors

import javax.swing.*;

public class positivos {
    public static void main (String [] args){
        int [] val = new int[5];
        String pos = "";

        for (int cont = 0; cont <=4; cont++){
            String x =JOptionPane.showInputDialog(null,"insira um valor");
            val [cont] = Integer.parseInt(x);

            if (val[cont] > 0){
                pos += "|"+ val[cont];
            }



        }

        JOptionPane.showMessageDialog(null,pos);
    }
}
