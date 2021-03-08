package batalhanaval;

import java.util.Scanner;

public class MultiPlayer extends Jogo{
    Scanner lerDados = new Scanner(System.in);
    private static String nome1;
    private static String nome2;
    public void lerNomes() {
        System.out.println("Olá Jogador 1!!!\nIndique o seu nome:");
        nome1 = lerDados.next();
        this.setNome1(nome1);
        System.out.println("Olá Jogador 2!!!\nIndique o seu nome:");
        nome2 = lerDados.next();
        this.setNome2(nome2);
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
    public void batalha2() {
        for (int i = 0; i < 4; i++) {
            System.out.println(this.getNome2()+", aloque a sua "+(i+1)+"° fragata (1 espaço):");
            this.getBatalha2();
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
            this.setBatalha2("X", pos, pos2, 0);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(this.getNome2()+", aloque o seu "+(i+1)+"° submarino (2 espaços):");
            this.getBatalha2();
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
            this.setBatalha2("X", pos, pos2, 1);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(this.getNome2()+", aloque o seu "+(i+1)+"° encouraçado (3 espaços):");
            this.getBatalha2();
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
            this.setBatalha2("X", pos, pos2, 2);
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(this.getNome2()+", aloque o seu porta-aviões (4 espaços):");
            this.getBatalha2();
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
            this.setBatalha2("X", pos, pos2, 3);
        }
        this.getBatalha2();
        System.out.println("Lembre-se destas posições! Anote-as se necessário.");
    }
    public void batalha(){
        int pos = 0;
        int pos2 = 0;
        boolean a;
        do { 
            System.out.println(this.getNome1()+", ataque!");
            this.getBat2();
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
            a = this.setBat1(pos, pos2);
            if (a == false) {
               System.out.println(this.getNome2()+", ataque!");
               this.getBat1();
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
               a = this.setBat2(pos, pos2); 
            }
        }
        while (a == false);
    }
}
