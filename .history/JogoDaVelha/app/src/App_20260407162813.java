import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String tabuleiro [][] = new String[3][3];
        String x = "X", o = "O";
        boolean win = true;
        int jogadorXLinha, jogadorXColuna, jogadorOLinha, jogadorOColuna;
        //tabuleiro
        for(int cont = 0; cont < 3; cont++){
            for(int cont1 = 0; cont1 < 3; cont1++){
                tabuleiro[cont][cont1] = "#";
            }
        }
        System.out.println(tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2]+ "\n" + tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2]+ "\n" + tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2]);
        while (win) {
            //jogadorX
            System.out.println("Digite a linha que quer posicionar o X: ");
            jogadorXLinha = sc.nextInt();
            System.out.println("Digite a coluna que quer posicionar o X: ");
            jogadorXColuna = sc.nextInt();
            tabuleiro[jogadorXLinha][jogadorXColuna] = x;
            System.out.println(tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2]+ "\n" + tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2]+ "\n" + tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2]);
            //verificar vitória 1
            for(int cont = 0; cont < 3; cont++){
                if((tabuleiro[cont][0] == tabuleiro[cont][1]) && tabuleiro[cont][1] == tabuleiro[cont][2]){
                    if(tabuleiro[cont][0].equals(x)){
                        System.out.println("Jogador X Ganhou!!!!!\n");
                        win = false;
                    } else if(tabuleiro[cont][0].equals(o)){
                        System.out.println("Jogador O Ganhou!!!!!\n");
                        win = false;
                    }
                }
            }
            for(int cont = 0; cont < 3; cont++){
                if((tabuleiro[0][cont] == tabuleiro[1][cont]) && tabuleiro[1][cont] == tabuleiro[2][cont]){
                    if(tabuleiro[0][cont].equals(x)){
                        System.out.println("Jogador X Ganhou!!!!!\n");
                        win = false;
                    } else if(tabuleiro[0][cont].equals(o)){
                        System.out.println("Jogador O Ganhou!!!!!\n");
                        win = false;
                    }
                }
            }
            if((tabuleiro[0][0] == tabuleiro[1][1]) && tabuleiro[1][1] == tabuleiro[2][2]){
                if(tabuleiro[0][0].equals(x)){
                    System.out.println("Jogador X Ganhou!!!!!\n");
                    win = false;
                } else if(tabuleiro[0][0].equals(o)){
                    System.out.println("Jogador O Ganhou!!!!!\n");
                    win = false;
                }
            }
            if((tabuleiro[0][2] == tabuleiro[1][1]) && tabuleiro[1][1] == tabuleiro[2][0]){
                if(tabuleiro[0][2].equals(x)){
                    System.out.println("Jogador X Ganhou!!!!!\n");
                    win = false;
                } else if(tabuleiro[0][2].equals(o)){
                    System.out.println("Jogador O Ganhou!!!!!\n");
                    win = false;
                }
            }
            //jogadorO
            if(win == true){
                System.out.println("Digite a linha que quer posicionar o O: ");
                jogadorOLinha = sc.nextInt();
                System.out.println("Digite a coluna que quer posicionar o O: ");
                jogadorOColuna = sc.nextInt();
                tabuleiro[jogadorOLinha][jogadorOColuna] = o;
                System.out.println(tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2]+ "\n" + tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2]+ "\n" + tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2]);
            }
            //verificar vitória 2
            for(int cont = 0; cont < 3; cont++){
                if((tabuleiro[cont][0] == tabuleiro[cont][1]) && tabuleiro[cont][1] == tabuleiro[cont][2]){
                    if(tabuleiro[cont][0].equals(x)){
                        System.out.println("Jogador X Ganhou!!!!!\n");
                        win = false;
                    } else if(tabuleiro[cont][0].equals(o)){
                        System.out.println("Jogador O Ganhou!!!!!\n");
                        win = false;
                    }
                }
            }
            for(int cont = 0; cont < 3; cont++){
                if((tabuleiro[0][cont] == tabuleiro[1][cont]) && tabuleiro[1][cont] == tabuleiro[2][cont]){
                    if(tabuleiro[0][cont].equals(x)){
                        System.out.println("Jogador X Ganhou!!!!!\n");
                        win = false;
                    } else if(tabuleiro[0][cont].equals(o)){
                        System.out.println("Jogador O Ganhou!!!!!\n");
                        win = false;
                    }
                }
            }
            if((tabuleiro[0][0] == tabuleiro[1][1]) && tabuleiro[1][1] == tabuleiro[2][2]){
                if(tabuleiro[0][0].equals(x)){
                    System.out.println("Jogador X Ganhou!!!!!\n");
                    win = false;
                } else if(tabuleiro[0][0].equals(o)){
                    System.out.println("Jogador O Ganhou!!!!!\n");
                    win = false;
                }
            }
            if((tabuleiro[0][2] == tabuleiro[1][1]) && tabuleiro[1][1] == tabuleiro[2][0]){
                if(tabuleiro[0][2].equals(x)){
                    System.out.println("Jogador X Ganhou!!!!!\n");
                    win = false;
                } else if(tabuleiro[0][2].equals(o)){
                    System.out.println("Jogador O Ganhou!!!!!\n");
                    win = false;
                }
            }
        }
    }
}
