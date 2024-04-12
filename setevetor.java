//Using vectors, and finding the numbers divisible by 2 and by 3 and divisible by both

import javax.swing.*;

public class setevetor {
    public static void main (String [] args){
        int [] vet = new int[7];
        String mul2 ="", mul3="",mul23="";

        for (int cont = 0; cont <=6 ; cont ++){
            String x = JOptionPane.showInputDialog(null,"Insira um valor");
            vet[cont] = Integer.parseInt(x);

            if(vet[cont] % 2 == 0 && vet[cont] % 3 == 0){
                mul23 += " | " + vet[cont];
                mul2 += " | " + vet[cont];
                mul3 += " | " + vet[cont];
            }else if(vet[cont] % 2 == 0){
                mul2 += " | " + vet[cont];
            }else if(vet[cont] % 3 == 0){
                mul3 += " | " +vet[cont];
            }
        }
        JOptionPane.showMessageDialog(null,"Estes números são múltiplos de 2\n"+ mul2);
        JOptionPane.showMessageDialog(null,"Estes números são múltiplos de 3\n"+mul3);
        JOptionPane.showMessageDialog(null,"Estes números são multiplos de 2 e de 3\n" +mul23);

    }
}