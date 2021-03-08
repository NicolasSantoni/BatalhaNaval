package batalhanaval;

import java.util.Scanner;

/**
 *
 * @author Nicolas S
 * @author Saimon A
 */
public class BatalhaNaval {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        SinglePlayer sp = new SinglePlayer();
        MultiPlayer mp = new MultiPlayer();
        int op;
        do {            
            System.out.println("Bem vindo à Batalha Naval da INFO!!!");
            System.out.println("1- Jogar Single Player");
            System.out.println("2- Jogar Multi Player");
            System.out.println("3- Sair");
            op = lerDados.nextInt();
            if (op == 1) {
                sp.lerNome();
                System.out.println("Bem vindo "+sp.getNome1()+"!!!\nVamos jogar!!!");
                sp.batalha1();
                sp.batalha2();
                sp.batalha();
                System.out.println("Seu mapa:");
                sp.getBatalha1();
                System.out.println("Mapa do bot:");
                sp.getBatalhaBot();
                sp.limpaBat();
            }
            else if (op == 2) {
                mp.lerNomes();
                System.out.println("Bem vindos "+mp.getNome1()+" e "+mp.getNome2()+"!!!\nVamos jogar!!!");
                mp.batalha1();
                mp.batalha2();
                mp.batalha();
                System.out.println("Mapa do "+mp.getNome1()+":");
                mp.getBatalha1();
                System.out.println("Mapa do "+mp.getNome2()+":");
                mp.getBatalha2();
                mp.limpaBat();
            }
        } 
        while (op<3 && op>0);
    }
}
