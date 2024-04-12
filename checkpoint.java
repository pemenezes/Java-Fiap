//This code was developed for a checkpoint at FIAP.
//It was a Menu for a DVD rental store

import javax.swing.*;

public class checkpoint {
    public static void main (String[] args){

        int m = 0, mf = 0;
        String t = "", g = "", c = "" , minutos = "", l = "",f="";

        while (m != 5) {


            String menu = JOptionPane.showInputDialog(null, "MENU\n1 - Cadastro de filmes\n2 - Categorias de filmes\n3 - Fitas\n4 - Reservar filme\n5 - Sair");
            m = Integer.parseInt(menu);

            if (m == 1) {
                String codigo = JOptionPane.showInputDialog(null, "Digite o código do filme: ");
                c += codigo + " | ";

                String titulo = JOptionPane.showInputDialog(null, "Digite o titulo do filme: ");
                t += titulo + " | ";

                String genero = JOptionPane.showInputDialog(null, "Digite o gênero do filme: ");
                g += genero + " | ";

                String tempo = JOptionPane.showInputDialog(null, "Digite o tempo de duração do filme em minutos: ");
                minutos += tempo + " | ";

                String locacao = JOptionPane.showInputDialog(null, "Digite o valor da locação: ");
                l += locacao + " | ";

                String fitas = JOptionPane.showInputDialog(null, "Digite a quantidade de fitas disponíveis: ");
                f += fitas + " | ";

            } else if (m == 2) {
                JOptionPane.showMessageDialog(null, "Filmes por gênero:\n Genero: " + g +"\nTitulo :"+t+ "\n Código : " + c + "\n Valor de locação: " + l);
            } else if(m == 3){
                String menu_fitas = JOptionPane.showInputDialog(null,"MENU FITAS\n1 - Consultar fitas disponíveis\n2 - Alugar fitas");
                mf = Integer.parseInt(menu_fitas);
                if (mf == 1){
                JOptionPane.showMessageDialog(null,"Fitas disponíveis por filme:\nTítulo:"+t+"\nCódigo:"+c+"\nFitas disponiveis:"+f);
                }else if(mf == 2){
                    String alugar = JOptionPane.showInputDialog(null,"Digite o código do filme que deseja alugar :");
                    JOptionPane.showMessageDialog(null,"O filme de código"+alugar+"tem "+f+"fitas disponiveis\nFita alugada com sucesso");
                }

            }else if(m == 4){
                String reservar = JOptionPane.showInputDialog(null,"Qual filme deseja reservar?:\n"+t);
                JOptionPane.showMessageDialog(null,"Filme "+reservar+" reservado com sucesso");
            }else if(m == 5){
                JOptionPane.showMessageDialog(null,"Fechando sistema");
            }
            else{
                JOptionPane.showMessageDialog(null,"Opção inválida!\nDigite um valor entre 1 - 5");
            }
        }
    }
}