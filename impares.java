//Finding only the odd numbers from 100 to 200

import java.util.Scanner;

public class impares {
    public static void main(String[] args){
        Scanner grava = new Scanner(System.in);
        int impar =100;

        while (impar < 200){
            impar++;
            if (impar % 2 == 1){
                System.out.println(impar);
            }
        }
    }
}
