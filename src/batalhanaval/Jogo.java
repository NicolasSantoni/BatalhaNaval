/**PortaAviao - 4 espaços
Encouracado - 3 espaços
Submarino - 2 espaços
Fragata - 1 espaço*/
package batalhanaval;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
  Scanner lerDados = new Scanner(System.in);
  Random gerador = new Random();
  private static String nome1;
  private static String nome2;
  private static String[][] batalha1 = {{"##","1","2","3","4","5","6","7","8","9","10"},{"01","*","*","*","*","*","*","*","*","*","*"},{"02","*","*","*","*","*","*","*","*","*","*"},{"03","*","*","*","*","*","*","*","*","*","*"},{"04","*","*","*","*","*","*","*","*","*","*"},{"05","*","*","*","*","*","*","*","*","*","*"},{"06","*","*","*","*","*","*","*","*","*","*"},{"07","*","*","*","*","*","*","*","*","*","*"},{"08","*","*","*","*","*","*","*","*","*","*"},{"09","*","*","*","*","*","*","*","*","*","*"},{"10","*","*","*","*","*","*","*","*","*","*"}};
  private static String[][] batalha2 = {{"##","1","2","3","4","5","6","7","8","9","10"},{"01","*","*","*","*","*","*","*","*","*","*"},{"02","*","*","*","*","*","*","*","*","*","*"},{"03","*","*","*","*","*","*","*","*","*","*"},{"04","*","*","*","*","*","*","*","*","*","*"},{"05","*","*","*","*","*","*","*","*","*","*"},{"06","*","*","*","*","*","*","*","*","*","*"},{"07","*","*","*","*","*","*","*","*","*","*"},{"08","*","*","*","*","*","*","*","*","*","*"},{"09","*","*","*","*","*","*","*","*","*","*"},{"10","*","*","*","*","*","*","*","*","*","*"}};
  private static String[][] bat1 = {{"##","1","2","3","4","5","6","7","8","9","10"},{"01","*","*","*","*","*","*","*","*","*","*"},{"02","*","*","*","*","*","*","*","*","*","*"},{"03","*","*","*","*","*","*","*","*","*","*"},{"04","*","*","*","*","*","*","*","*","*","*"},{"05","*","*","*","*","*","*","*","*","*","*"},{"06","*","*","*","*","*","*","*","*","*","*"},{"07","*","*","*","*","*","*","*","*","*","*"},{"08","*","*","*","*","*","*","*","*","*","*"},{"09","*","*","*","*","*","*","*","*","*","*"},{"10","*","*","*","*","*","*","*","*","*","*"}};
  private static String[][] bat2 = {{"##","1","2","3","4","5","6","7","8","9","10"},{"01","*","*","*","*","*","*","*","*","*","*"},{"02","*","*","*","*","*","*","*","*","*","*"},{"03","*","*","*","*","*","*","*","*","*","*"},{"04","*","*","*","*","*","*","*","*","*","*"},{"05","*","*","*","*","*","*","*","*","*","*"},{"06","*","*","*","*","*","*","*","*","*","*"},{"07","*","*","*","*","*","*","*","*","*","*"},{"08","*","*","*","*","*","*","*","*","*","*"},{"09","*","*","*","*","*","*","*","*","*","*"},{"10","*","*","*","*","*","*","*","*","*","*"}};
  private static String[][] batalhabot = {{"##","1","2","3","4","5","6","7","8","9","10"},{"01","*","*","*","*","*","*","*","*","*","*"},{"02","*","*","*","*","*","*","*","*","*","*"},{"03","*","*","*","*","*","*","*","*","*","*"},{"04","*","*","*","*","*","*","*","*","*","*"},{"05","*","*","*","*","*","*","*","*","*","*"},{"06","*","*","*","*","*","*","*","*","*","*"},{"07","*","*","*","*","*","*","*","*","*","*"},{"08","*","*","*","*","*","*","*","*","*","*"},{"09","*","*","*","*","*","*","*","*","*","*"},{"10","*","*","*","*","*","*","*","*","*","*"}};
  private static String[][] limpa = {{"##","1","2","3","4","5","6","7","8","9","10"},{"01","*","*","*","*","*","*","*","*","*","*"},{"02","*","*","*","*","*","*","*","*","*","*"},{"03","*","*","*","*","*","*","*","*","*","*"},{"04","*","*","*","*","*","*","*","*","*","*"},{"05","*","*","*","*","*","*","*","*","*","*"},{"06","*","*","*","*","*","*","*","*","*","*"},{"07","*","*","*","*","*","*","*","*","*","*"},{"08","*","*","*","*","*","*","*","*","*","*"},{"09","*","*","*","*","*","*","*","*","*","*"},{"10","*","*","*","*","*","*","*","*","*","*"}};
  private static String[][] batbot = {{"##","1","2","3","4","5","6","7","8","9","10"},{"01","*","*","*","*","*","*","*","*","*","*"},{"02","*","*","*","*","*","*","*","*","*","*"},{"03","*","*","*","*","*","*","*","*","*","*"},{"04","*","*","*","*","*","*","*","*","*","*"},{"05","*","*","*","*","*","*","*","*","*","*"},{"06","*","*","*","*","*","*","*","*","*","*"},{"07","*","*","*","*","*","*","*","*","*","*"},{"08","*","*","*","*","*","*","*","*","*","*"},{"09","*","*","*","*","*","*","*","*","*","*"},{"10","*","*","*","*","*","*","*","*","*","*"}};
  private static String[][] batbot2 = {{"##","1","2","3","4","5","6","7","8","9","10"},{"01","*","*","*","*","*","*","*","*","*","*"},{"02","*","*","*","*","*","*","*","*","*","*"},{"03","*","*","*","*","*","*","*","*","*","*"},{"04","*","*","*","*","*","*","*","*","*","*"},{"05","*","*","*","*","*","*","*","*","*","*"},{"06","*","*","*","*","*","*","*","*","*","*"},{"07","*","*","*","*","*","*","*","*","*","*"},{"08","*","*","*","*","*","*","*","*","*","*"},{"09","*","*","*","*","*","*","*","*","*","*"},{"10","*","*","*","*","*","*","*","*","*","*"}};
  public String getNome1() {
    return nome1;
  }
  public void setNome1(String nome1) {
    Jogo.nome1 = nome1;
  }
  public String getNome2() {
    return nome2;
  }
  public void setNome2(String nome2) {
    Jogo.nome2 = nome2;
  }
  public void getBatalha1() {
      for (int l = 0; l < 11; l++) {
        for (int c = 0; c < 11; c++) {
          System.out.print(batalha1[l][c]+" ");
        }
        System.out.println("");
      }
  }
  public void setBatalha1(String batalha1, int a, int b, int t) {
      if (t == 0) {
          while (Jogo.batalha1[a][b] == "X"){                  
            System.out.println("Posição já ocupada. Indique outra:");
            System.out.println("Linha:");
            a = lerDados.nextInt();
            while (a>10||a<1) {            
                System.out.println("Posição inválida. Indique outra:");
                a = lerDados.nextInt();
            }
            System.out.println("Coluna:");
            b = lerDados.nextInt();
            while (b>10||b<1) {            
                System.out.println("Posição inválida. Indique outra:");
                b = lerDados.nextInt();
            }
          }
          Jogo.batalha1[a][b] = batalha1;
      }
      if (t == 1) {
          int h;
          do {              
              System.out.println("Você quer tal posição na:\n1- Horizontal\n2- Vertical");
              h = lerDados.nextInt();
          }
          while (h != 1 && h != 2);
          if (h == 1) {
            while (b+1>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha1[a][b] == "X" || Jogo.batalha1[a][b+1] == "X"){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha1[a][b] = batalha1;
            Jogo.batalha1[a][b+1] = batalha1;
          }
          else if (h == 2) {
            while (a+1>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha1[a][b] == "X" || Jogo.batalha1[a+1][b] == "X"){                  
                System.out.println("Posição já ocupada. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha1[a][b] = batalha1;
            Jogo.batalha1[a+1][b] = batalha1;
          }
      }
      if (t == 2) {
          int h;
          do {              
              System.out.println("Você quer tal posição na:\n1- Horizontal\n2- Vertical");
              h = lerDados.nextInt();
          }
          while (h != 1 && h != 2);
          if (h == 1) {
            while (b+1>10 || b+2>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha1[a][b] == "X" || Jogo.batalha1[a][b+1] == "X" || Jogo.batalha1[a][b+2] == "X"){                  
                System.out.println("Posição já ocupada. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha1[a][b] = batalha1;
            Jogo.batalha1[a][b+1] = batalha1;
            Jogo.batalha1[a][b+2] = batalha1;
          }
          else if (h == 2) {
            while (a+1>10 || a+2>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha1[a][b] == "X" || Jogo.batalha1[a+1][b] == "X" || Jogo.batalha1[a+2][b] == "X"){                  
                System.out.println("Posição já ocupada. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha1[a][b] = batalha1;
            Jogo.batalha1[a+1][b] = batalha1;
            Jogo.batalha1[a+2][b] = batalha1;
          }
      }
      if (t == 3) {
          int h;
          do {              
              System.out.println("Você quer tal posição na:\n1- Horizontal\n2- Vertical");
              h = lerDados.nextInt();
          }
          while (h != 1 && h != 2);
          if (h == 1) {
            while (b+1>10 || b+2>10 || b+3>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha1[a][b] == "X" || Jogo.batalha1[a][b+1] == "X" || Jogo.batalha1[a][b+2] == "X" || Jogo.batalha1[a][b+3] == "X"){                  
                System.out.println("Posição já ocupada. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha1[a][b] = batalha1;
            Jogo.batalha1[a][b+1] = batalha1;
            Jogo.batalha1[a][b+2] = batalha1;
            Jogo.batalha1[a][b+3] = batalha1;
          }
          else if (h == 2) {
            while (a+1>10 || a+2>10 || a+3>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha1[a][b] == "X" || Jogo.batalha1[a+1][b] == "X" || Jogo.batalha1[a+2][b] == "X" || Jogo.batalha1[a+3][b] == "X"){                  
                System.out.println("Posição já ocupada. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha1[a][b] = batalha1;
            Jogo.batalha1[a+1][b] = batalha1;
            Jogo.batalha1[a+2][b] = batalha1;
            Jogo.batalha1[a+3][b] = batalha1;
          }
      }
  }
  public void getBatalha2() {
      for (int l = 0; l < 11; l++) {
        for (int c = 0; c < 11; c++) {
          System.out.print(batalha2[l][c]+" ");
        }
        System.out.println("");
      }
  }
  public void setBatalha2(String batalha2, int a, int b, int t) {
      if (t == 0) {
          while (Jogo.batalha2[a][b] == "X"){                  
            System.out.println("Posição já ocupada. Indique outra:");
            System.out.println("Linha:");
            a = lerDados.nextInt();
            while (a>10||a<1) {            
                System.out.println("Posição inválida. Indique outra:");
                a = lerDados.nextInt();
            }
            System.out.println("Coluna:");
            b = lerDados.nextInt();
            while (b>10||b<1) {            
                System.out.println("Posição inválida. Indique outra:");
                b = lerDados.nextInt();
            }
          }
          Jogo.batalha2[a][b] = batalha2;
      }
      if (t == 1) {
          int h;
          do {              
              System.out.println("Você quer tal posição na:\n1- Horizontal\n2- Vertical");
              h = lerDados.nextInt();
          }
          while (h != 1 && h != 2);
          if (h == 1) {
            while (b+1>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha2[a][b] == "X" || Jogo.batalha2[a][b+1] == "X"){                  
                System.out.println("Posição já ocupada. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha2[a][b] = batalha2;
            Jogo.batalha2[a][b+1] = batalha2;
          }
          else if (h == 2) {
            while (a+1>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha2[a][b] == "X" || Jogo.batalha2[a+1][b] == "X"){                  
                System.out.println("Posição já ocupada. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha2[a][b] = batalha2;
            Jogo.batalha2[a+1][b] = batalha2;
          }
      }
      if (t == 2) {
          int h;
          do {              
              System.out.println("Você quer tal posição na:\n1- Horizontal\n2- Vertical");
              h = lerDados.nextInt();
          }
          while (h != 1 && h != 2);
          if (h == 1) {
            while (b+1>10 || b+2>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha2[a][b] == "X" || Jogo.batalha2[a][b+1] == "X" || Jogo.batalha2[a][b+2] == "X"){                  
                System.out.println("Posição já ocupada. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha2[a][b] = batalha2;
            Jogo.batalha2[a][b+1] = batalha2;
            Jogo.batalha2[a][b+2] = batalha2;
          }
          else if (h == 2) {
            while (a+1>10 || a+2>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha2[a][b] == "X" || Jogo.batalha2[a+1][b] == "X" || Jogo.batalha2[a+2][b] == "X"){                  
                System.out.println("Posição já ocupada. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha2[a][b] = batalha2;
            Jogo.batalha2[a+1][b] = batalha2;
            Jogo.batalha2[a+2][b] = batalha2;
          }
      }
      if (t == 3) {
          int h;
          do {              
              System.out.println("Você quer tal posição na:\n1- Horizontal\n2- Vertical");
              h = lerDados.nextInt();
          }
          while (h != 1 && h != 2);
          if (h == 1) {
            while (b+1>10 || b+2>10 || b+3>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha2[a][b] == "X" || Jogo.batalha2[a][b+1] == "X" || Jogo.batalha2[a][b+2] == "X" || Jogo.batalha2[a][b+3] == "X"){                  
                System.out.println("Posição já ocupada. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha2[a][b] = batalha2;
            Jogo.batalha2[a][b+1] = batalha2;
            Jogo.batalha2[a][b+2] = batalha2;
            Jogo.batalha2[a][b+3] = batalha2;
          }
          else if (h == 2) {
            while (a+1>10 || a+2>10 || a+3>10){                  
                System.out.println("Posição inválida. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            while (Jogo.batalha2[a][b] == "X" || Jogo.batalha2[a+1][b] == "X" || Jogo.batalha2[a+2][b] == "X" || Jogo.batalha2[a+3][b] == "X"){                  
                System.out.println("Posição já ocupada. Indique outra:");
                System.out.println("Linha:");
                a = lerDados.nextInt();
                    while (a>10||a<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    a = lerDados.nextInt();
                }
                System.out.println("Coluna:");
                b = lerDados.nextInt();
                while (b>10||b<1) {            
                    System.out.println("Posição inválida. Indique outra:");
                    b = lerDados.nextInt();
                }
            }
            Jogo.batalha2[a][b] = batalha2;
            Jogo.batalha2[a+1][b] = batalha2;
            Jogo.batalha2[a+2][b] = batalha2;
            Jogo.batalha2[a+3][b] = batalha2;
          }
      }
  }
  public void getBat1() {
      for (int l = 0; l < 11; l++) {
        for (int c = 0; c < 11; c++) {
          System.out.print(bat1[l][c]+" ");
        }
        System.out.println("");
      }
  }
  public boolean setBat1(int a, int b) {
      if (batalha2[a][b] == "X" && bat2[a][b] == "*") {
          bat2[a][b] = "X";
          batalha2[a][b] = "O";
          int cont = 0;
          for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                if (batalha2[l][c] == "X") {
                    cont++;
                }
            }
          }
          if (cont == 0) {
              System.out.println(this.getNome1()+" ganhou!!!");
              return true;
          }
          System.out.println("Tiro certeiro! Parabéns! Faltam "+cont+" tiros destes para a vitória! Você tem mais uma jogada:");
          this.getBat2();
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
          if (batalha2[pos][pos2] == "X" && bat2[pos][pos2] == "*") {
            bat2[pos][pos2] = "X";
            batalha2[pos][pos2] = "O";
            cont = 0;
            for (int l = 0; l < 11; l++) {
                for (int c = 0; c < 11; c++) {
                    if (batalha2[l][c] == "X") {
                        cont++;
                    }
                }
            }
            if (cont == 0) {
              System.out.println(this.getNome1()+" ganhou!!!");
              return true;
            }
            System.out.println("Tiro certeiro! Parabéns! Faltam "+cont+" tiros destes para a vitória!");
            this.getBat2();
          }
          else if(bat2[pos][pos2] == "X" || bat2[pos][pos2] == "O"){
            do {              
              System.out.println("Posição já jogada. Indique outra:");
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
            }
            while (bat2[pos][pos2] != "*");
              if (batalha2[pos][pos2] == "X" && bat2[pos][pos2] == "*") {
                bat2[pos][pos2] = "X";
                batalha2[pos][pos2] = "O";
                cont = 0;
                for (int l = 0; l < 11; l++) {
                    for (int c = 0; c < 11; c++) {
                        if (batalha2[l][c] == "X") {
                            cont++;
                        }
                    }
                }
                if (cont == 0) {
                    System.out.println(this.getNome1()+" ganhou!!!");
                    return true;
                }
                System.out.println("Tiro certeiro! Parabéns! Faltam "+cont+" tiros destes para a vitória!");
                this.getBat2();
                }
              else if (batalha2[pos][pos2] == "*") {
                System.out.println("Tiro na água!");
                bat2[pos][pos2] = "O";
                this.getBat2();
                }
          }
          else if (batalha2[pos][pos2] == "*") {
            System.out.println("Tiro na água!");
            bat2[pos][pos2] = "O";
            this.getBat2();
          }
      }
      else if(bat2[a][b] != "*"){            
              System.out.println("Posição já jogada. Indique outra:");
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
              this.setBat2(pos, pos2);
      }
      else if (batalha2[a][b] == "*") {
          System.out.println("Tiro na água!");
          bat2[a][b] = "O";
          this.getBat2();
      }
      return false;
  }
  public void getBat2() {
      for (int l = 0; l < 11; l++) {
        for (int c = 0; c < 11; c++) {
          System.out.print(bat2[l][c]+" ");
        }
        System.out.println("");
      }
  }
  public boolean setBat2(int a, int b) {
      if (batalha1[a][b] == "X" && bat1[a][b] == "*") {
          bat1[a][b] = "X";
          batalha1[a][b] = "O";
          int cont = 0;
          for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                if (batalha1[l][c] == "X") {
                    cont++;
                }
            }
          }
          if (cont == 0) {
              System.out.println(this.getNome2()+" ganhou!!!");
              return true;
          }
          System.out.println("Tiro certeiro! Parabéns! Faltam "+cont+" tiros destes para a vitória! Você tem mais uma jogada:");
          this.getBat1();
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
          if (batalha1[pos][pos2] == "X" && bat1[pos][pos2] == "*") {
            bat1[pos][pos2] = "X";
            batalha1[pos][pos2] = "O";
            cont = 0;
            for (int l = 0; l < 11; l++) {
                for (int c = 0; c < 11; c++) {
                    if (batalha1[l][c] == "X") {
                        cont++;
                    }
                }
            }
            if (cont == 0) {
              System.out.println(this.getNome2()+" ganhou!!!");
              return true;
            }
            System.out.println("Tiro certeiro! Parabéns! Faltam "+cont+" tiros destes para a vitória!");
            this.getBat1();
          }
          else if(bat1[pos][pos2] == "X" || bat1[pos][pos2] == "O"){
            do {              
              System.out.println("Posição já jogada. Indique outra:");
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
            }
            while (bat1[pos][pos2] != "*");
              if (batalha1[pos][pos2] == "X" && bat1[pos][pos2] == "*") {
                bat1[pos][pos2] = "X";
                batalha1[pos][pos2] = "O";
                cont = 0;
                for (int l = 0; l < 11; l++) {
                    for (int c = 0; c < 11; c++) {
                        if (batalha1[l][c] == "X") {
                            cont++;
                        }
                    }
                }
                if (cont == 0) {
                    System.out.println(this.getNome2()+" ganhou!!!");
                    return true;
                }
                System.out.println("Tiro certeiro! Parabéns! Faltam "+cont+" tiros destes para a vitória!");
                this.getBat1();
              }
              else if (batalha1[pos][pos2] == "*") {
                System.out.println("Tiro na água!");
                bat1[pos][pos2] = "O";
                this.getBat1();
              }
          }
          else if (batalha1[pos][pos2] == "*") {
            System.out.println("Tiro na água!");
            bat1[pos][pos2] = "O";
            this.getBat1();
          }
      }
      else if(bat1[a][b] != "*"){           
              System.out.println("Posição já jogada. Indique outra:");
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
              this.setBat2(pos, pos2);
      }
      else if (batalha1[a][b] == "*") {
          System.out.println("Tiro na água!");
          bat1[a][b] = "O";
          this.getBat1();
      }
      return false;
  }
  public void limpaBat(){
      for (int l = 0; l < 11; l++) {
        for (int c = 0; c < 11; c++) {
          batalha1[l][c] = limpa[l][c];
          batalha2[l][c] = limpa[l][c];
          bat1[l][c] = limpa[l][c];
          bat2[l][c] = limpa[l][c];
          batalhabot[l][c] = limpa[l][c];
          batbot[l][c] = limpa[l][c];
          batbot2[l][c] = limpa[l][c];
        }
      }
  }
  public void setBatalhaBot(){
      //Fragata
        for (int i = 0; i < 4; i++) {
            int n1;
            int n2;
            do {                
               n1 = gerador.nextInt(10)+1;
               n2 = gerador.nextInt(10)+1;
               
            }
            while (batalhabot[n1][n2] == "X"); 
            batalhabot[n1][n2] = "X"; 
        }
        //Submarino
        for (int i = 0; i < 3; i++) {
            int n1;
            int n2;
            do {                
               n1 = gerador.nextInt(10)+1;
               n2 = gerador.nextInt(10)+1;
               }
            while (batalhabot[n1][n2] == "X");  
               int t = gerador.nextInt(2);
                if (t == 0) {
                    do{                   
                        do {                            
                           n1 = gerador.nextInt(10)+1;
                            n2 = gerador.nextInt(10)+1; 
                        } while (n2+1>10);
                    } while(batalhabot[n1][n2+1] == "X");
                   batalhabot[n1][n2] = "X"; 
                   batalhabot[n1][n2+1] = "X"; 
                }
                else{
                   do{                   
                        do {                            
                           n1 = gerador.nextInt(10)+1;
                            n2 = gerador.nextInt(10)+1; 
                        } while (n1+1>10);
                    } while(batalhabot[n1+1][n2] == "X");
                   batalhabot[n1][n2] = "X"; 
                   batalhabot[n1+1][n2] = "X";
                }
        }
        //Encouraçado
        for (int i = 0; i < 2; i++) {
            int n1;
            int n2;
            do {                
               n1 = gerador.nextInt(10)+1;
               n2 = gerador.nextInt(10)+1;
            }
            while (batalhabot[n1][n2] == "X");
            int t = gerador.nextInt(2);
                if (t == 0) {
                    do{                   
                        do {                            
                           n1 = gerador.nextInt(10)+1;
                            n2 = gerador.nextInt(10)+1; 
                        } while (n2+1>10 || n2+2>10);
                    } while(batalhabot[n1][n2+1] == "X" || batalhabot[n1][n2+2] == "X");
                   batalhabot[n1][n2] = "X"; 
                   batalhabot[n1][n2+1] = "X";
                   batalhabot[n1][n2+2] = "X";
                }
                else{
                   do{                   
                        do {                            
                           n1 = gerador.nextInt(10)+1;
                            n2 = gerador.nextInt(10)+1; 
                        } while (n1+1>10 || n1+2>10);
                    } while(batalhabot[n1+1][n2] == "X" || batalhabot[n1+2][n2] == "X");
                   batalhabot[n1][n2] = "X"; 
                   batalhabot[n1+1][n2] = "X";
                   batalhabot[n1+2][n2] = "X";
                }
              
        }
        //Porta Aviões
        for (int i = 0; i < 1; i++) {
            int n1;
            int n2;
            do {                
               n1 = gerador.nextInt(10)+1;
               n2 = gerador.nextInt(10)+1;
            }
            while (batalhabot[n1][n2] == "X");
            int t = gerador.nextInt(2);
                if (t == 0) {
                    do{                   
                        do {                            
                           n1 = gerador.nextInt(10)+1;
                            n2 = gerador.nextInt(10)+1; 
                        } while (n2+1>10 || n2+2>10 || n2+3>10);
                    } while(batalhabot[n1][n2+1] == "X" || batalhabot[n1][n2+2] == "X" || batalhabot[n1][n2+3] == "X");
                   batalhabot[n1][n2] = "X"; 
                   batalhabot[n1][n2+1] = "X";
                   batalhabot[n1][n2+2] = "X";
                   batalhabot[n1][n2+3] = "X";
                }
                else{
                    do{                   
                        do {                            
                           n1 = gerador.nextInt(10)+1;
                            n2 = gerador.nextInt(10)+1; 
                        } while (n1+1>10 || n1+2>10 || n1+3>10);
                    } while(batalhabot[n1+1][n2] == "X" || batalhabot[n1+2][n2] == "X" || batalhabot[n1+3][n2] == "X");
                   batalhabot[n1][n2] = "X"; 
                   batalhabot[n1+1][n2] = "X";
                   batalhabot[n1+2][n2] = "X";
                   batalhabot[n1+3][n2] = "X";
                }
        }
  }
  public void getBatBot() {
      for (int l = 0; l < 11; l++) {
        for (int c = 0; c < 11; c++) {
          System.out.print(batbot[l][c]+" ");
        }
        System.out.println("");
      }
  }
  public boolean setBatBot(int a, int b) {
      if (batalhabot[a][b] == "X" && batbot[a][b] == "*") {
          batbot[a][b] = "X";
          batalhabot[a][b] = "O";
          int cont = 0;
          for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                if (batalhabot[l][c] == "X") {
                    cont++;
                }
            }
          }
          if (cont == 0) {
              System.out.println(this.getNome1()+" ganhou!!!");
              return true;
          }
          System.out.println("Tiro certeiro! Parabéns! Faltam "+cont+" tiros destes para a vitória! Você tem mais uma jogada:");
          this.getBatBot();
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
          if (batalhabot[pos][pos2] == "X" && batbot[pos][pos2] == "*") {
            batbot[pos][pos2] = "X";
            batalhabot[pos][pos2] = "O";
            cont = 0;
            for (int l = 0; l < 11; l++) {
                for (int c = 0; c < 11; c++) {
                    if (batalhabot[l][c] == "X") {
                        cont++;
                    }
                }
            }
            if (cont == 0) {
              System.out.println(this.getNome1()+" ganhou!!!");
              return true;
            }
            System.out.println("Tiro certeiro! Parabéns! Faltam "+cont+" tiros destes para a vitória!");
            this.getBatBot();
          }
          else if(batbot[pos][pos2] == "X" || batbot[pos][pos2] == "O"){
            do {              
              System.out.println("Posição já jogada. Indique outra:");
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
            }
            while (batbot[pos][pos2] != "*");
              if (batalhabot[pos][pos2] == "X" && batbot[pos][pos2] == "*") {
                batbot[pos][pos2] = "X";
                batalhabot[pos][pos2] = "O";
                cont = 0;
                for (int l = 0; l < 11; l++) {
                    for (int c = 0; c < 11; c++) {
                        if (batalhabot[l][c] == "X") {
                            cont++;
                        }
                    }
                }
                if (cont == 0) {
                    System.out.println(this.getNome1()+" ganhou!!!");
                    return true;
                }
                System.out.println("Tiro certeiro! Parabéns! Faltam "+cont+" tiros destes para a vitória!");
                this.getBatBot();
                }
              else if (batalhabot[pos][pos2] == "*") {
                System.out.println("Tiro na água!");
                batbot[pos][pos2] = "O";
                this.getBatBot();
                }
          }
          else if (batalhabot[pos][pos2] == "*") {
            System.out.println("Tiro na água!");
            batbot[pos][pos2] = "O";
            this.getBatBot();
          }
      }
      else if(batbot[a][b] != "*"){            
              System.out.println("Posição já jogada. Indique outra:");
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
              this.setBatBot(pos, pos2);
      }
      else if (batalhabot[a][b] == "*") {
          System.out.println("Tiro na água!");
          batbot[a][b] = "O";
          this.getBatBot();
      }
      return false;
  }
  public void getBatBot2() {
      for (int l = 0; l < 11; l++) {
        for (int c = 0; c < 11; c++) {
          System.out.print(batbot2[l][c]+" ");
        }
        System.out.println("");
      }
  }
  public int setBatBot2(int a, int b) {
      int cont = 0;
      if (batalha1[a][b] == "X" && batbot2[a][b] == "*") {
          batbot2[a][b] = "X";
          batalha1[a][b] = "O";
          cont = 0;
          for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                if (batalha1[l][c] == "X") {
                    cont++;
                }
            }
          }
          if (cont == 0) {
              System.out.println("O bot ganhou!!!");
              return cont;
          }
          System.out.println("Tiro certeiro do bot! Faltam "+cont+" tiros destes para a vitória! Ele jogará novamente...");
          this.getBatBot2();
          int pos = a++;
          int pos2 = b;
          if (batalha1[pos][pos2] == "X" && batbot2[pos][pos2] == "*") {
            batbot2[pos][pos2] = "X";
            batalha1[pos][pos2] = "O";
            cont = 0;
            for (int l = 0; l < 11; l++) {
                for (int c = 0; c < 11; c++) {
                    if (batalha1[l][c] == "X") {
                        cont++;
                    }
                }
            }
            if (cont == 0) {
              System.out.println("O bot ganhou!!!");
              return cont;
            }
            System.out.println("Tiro certeiro do bot! Faltam "+cont+" tiros destes para a vitória!");
            this.getBatBot2();
          }
          else if(batbot2[pos][pos2] == "X" || batbot2[pos][pos2] == "O"){
            do {              
              pos = gerador.nextInt(10)+1;
              pos2 = gerador.nextInt(10)+1;
            }
            while (batbot2[pos][pos2] != "*");
              if (batalha1[pos][pos2] == "X" && batbot2[pos][pos2] == "*") {
                batbot2[pos][pos2] = "X";
                batalha1[pos][pos2] = "O";
                cont = 0;
                for (int l = 0; l < 11; l++) {
                    for (int c = 0; c < 11; c++) {
                        if (batalha1[l][c] == "X") {
                            cont++;
                        }
                    }
                }
                if (cont == 0) {
                    System.out.println("O bot ganhou!!!");
                    return cont;
                }
                System.out.println("Tiro certeiro do bot! Faltam "+cont+" tiros destes para a vitória!");
                this.getBatBot2();
                }
              else if (batalha1[pos][pos2] == "*") {
                System.out.println("O bot atirou na água!");
                batbot2[pos][pos2] = "O";
                this.getBatBot2();
                }
          }
          else if (batalha1[pos][pos2] == "*") {
            System.out.println("O bot atirou na água!");
            batbot2[pos][pos2] = "O";
            this.getBatBot2();
          }
      }
      else if(batbot2[a][b] != "*"){            
              int pos = gerador.nextInt(10)+1;
              int pos2 = gerador.nextInt(10)+1;
              this.setBatBot2(pos, pos2);
      }
      else if (batalha1[a][b] == "*") {
          System.out.println("O bot atirou na água!");
          batbot2[a][b] = "O";
          this.getBatBot2();
      }
      for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                if (batalha1[l][c] == "X") {
                    cont++;
                }
            }
          }
      return cont;
  }
  public void getBatalhaBot() {
      for (int l = 0; l < 11; l++) {
        for (int c = 0; c < 11; c++) {
          System.out.print(batalhabot[l][c]+" ");
        }
        System.out.println("");
      }
  }
}