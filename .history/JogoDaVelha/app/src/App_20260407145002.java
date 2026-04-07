import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String tabuleiro [][] = new String[3][3];
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
            tabuleiro[jogadorXLinha][jogadorXColuna] = "X";
            System.out.println(tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2]+ "\n" + tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2]+ "\n" + tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2]);
            //jogadorO
            System.out.println("Digite a linha que quer posicionar o O: ");
            jogadorOLinha = sc.nextInt();
            System.out.println("Digite a coluna que quer posicionar o O: ");
            jogadorOColuna = sc.nextInt();
            tabuleiro[jogadorOLinha][jogadorOColuna] = "O";
            System.out.println(tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2]+ "\n" + tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2]+ "\n" + tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2]);
            //verificar vitória
            for(int cont = 0; cont < 3; cont++){
                if((tabuleiro[0][0] == tabuleiro[1][0]) && tabuleiro[2][0] == tabuleiro[])
            }
        }
    }
}
