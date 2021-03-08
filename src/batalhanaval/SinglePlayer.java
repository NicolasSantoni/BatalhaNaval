package batalhanaval;

import java.util.Random;
import java.util.Scanner;

public class SinglePlayer extends Jogo{
    Random gerador = new Random();
    Scanner lerDados = new Scanner(System.in);
    private static String nome;
    public void lerNome() {
        System.out.println("Indique o seu nome:");
        nome = lerDados.next();
        this.setNome1(nome);
    }
    public void batalha1() {
        for (int i = 0; i < 4; i++) {
            System.out.println(this.getNome1()+", aloque a sua "+(i+1)+"° fragata (1 espaço):");
            this.getBatalha1();
            System.out.println("Linha:");
            int pos = lerDados.nextInt();
            while (pos>10||pos<1) {            
                System.out.println("Posição inválida. Indique outra:");
                pos = lerDados.nextInt();
            }
            System.out.println("Coluna:");
            int pos2 = lerDados.nextInt();
            while (pos2>10||pos2<1) {            
                System.out.println("Posição inválida. Indique outra:");
                pos2 = lerDados.nextInt();
            }
            this.setBatalha1("X", pos, pos2, 0);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(this.getNome1()+", aloque o seu "+(i+1)+"° submarino (2 espaços):");
            this.getBatalha1();
            System.out.println("Linha:");
            int pos = lerDados.nextInt();
            while (pos>10||pos<1) {            
                System.out.println("Posição inválida. Indique outra:");
                pos = lerDados.nextInt();
            }
            System.out.println("Coluna:");
            int pos2 = lerDados.nextInt();
            while (pos2>10||pos2<1) {            
                System.out.println("Posição inválida. Indique outra:");
                pos2 = lerDados.nextInt();
            }
            this.setBatalha1("X", pos, pos2, 1);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(this.getNome1()+", aloque o seu "+(i+1)+"° encouraçado (3 espaços):");
            this.getBatalha1();
            System.out.println("Linha:");
            int pos = lerDados.nextInt();
            while (pos>10||pos<1) {            
                System.out.println("Posição inválida. Indique outra:");
                pos = lerDados.nextInt();
            }
            System.out.println("Coluna:");
            int pos2 = lerDados.nextInt();
            while (pos2>10||pos2<1) {            
                System.out.println("Posição inválida. Indique outra:");
                pos2 = lerDados.nextInt();
            }
            this.setBatalha1("X", pos, pos2, 2);
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(this.getNome1()+", aloque o seu porta-aviões (4 espaços):");
            this.getBatalha1();
            System.out.println("Linha:");
            int pos = lerDados.nextInt();
            while (pos>10||pos<1) {            
                System.out.println("Posição inválida. Indique outra:");
                pos = lerDados.nextInt();
            }
            System.out.println("Coluna:");
            int pos2 = lerDados.nextInt();
            while (pos2>10||pos2<1) {            
                System.out.println("Posição inválida. Indique outra:");
                pos2 = lerDados.nextInt();
            }
            this.setBatalha1("X", pos, pos2, 3);
        }
        this.getBatalha1();
        System.out.println("Lembre-se destas posições! Anote-as se necessário.");
    }
    public void batalha2(){
        this.setBatalhaBot();
    }
    public void batalha(){
        int pos;
        int pos2;
        boolean b;
        int c = 10;
        do { 
            System.out.println(this.getNome1()+", ataque!");
            this.getBatBot();
            System.out.println("Linha:");
            pos = lerDados.nextInt();
            while (pos>10||pos<1) {            
                System.out.println("Posição inválida. Indique outra:");
                pos = lerDados.nextInt();
            }
            System.out.println("Coluna:");
            pos2 = lerDados.nextInt();
            while (pos2>10||pos2<1) {            
                System.out.println("Posição inválida. Indique outra:");
                pos2 = lerDados.nextInt();
            }
            b = this.setBatBot(pos, pos2);
            if (b == false) {
               System.out.println("Vez do bot...");
                pos = gerador.nextInt(10)+1;
                pos2 = gerador.nextInt(10)+1;
                c = this.setBatBot2(pos, pos2);
            }
        }
        while (b == false && c != 0);
    }
}
