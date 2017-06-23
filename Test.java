import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] board = new int[size][size];
        boolean gotResult = false;
        int numOfX = 0;
        int numOfO = 0;
        
        //读入矩阵
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                    board[i][j] = sc.nextInt();
                
            }
        }
        //查看棋盘
        for (int[] is : board) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }