import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String tabuleiro [][] = new String[3][3];
        boolean win = true;
        int jogadorXLinha, jogadorXColuna, jogadorO;
        while (win) {
            //tabuleiro
            System.out.println(tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2]+ "\n" + tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2]+ "\n" + tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2]);
            //jogadorX
            System.out.println("Digite a linha que quer posicionar o X: ");
            jogadorXLinha = sc.nextInt();
            System.out.println("Digite a coluna que quer posicionar o X: ");
            jogadorXColuna = sc.nextInt();
            tabuleiro[jogadorXLinha][jo]
        }
    }
}
