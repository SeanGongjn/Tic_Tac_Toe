import java.util.Scanner;

public class Test {
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
/*        //查看棋盘
        for (int[] is : board) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }*/
        
        //检查行       
        ROW_LOOP:
        for (int i = 0; i < board.length; i++) {
            numOfX = 0;
            numOfO = 0;
            for (int j = 0; j < board.length; j++) {
                int n = board[i][j];
                if (n == 1) {
                    numOfX ++;
                    if (numOfX == size) {
                        gotResult = true;
                        System.out.println("X");
                        break ROW_LOOP;
                    }
                }
                else if (n == 0) {
                    numOfO ++;
                    if (numOfO == size) {
                        gotResult = true;
                        System.out.println("O");
                        break ROW_LOOP;
                    }
                }
            }
        }
        
        //检查列
        COL_LOOP:
        if (gotResult == false) {
            for (int i = 0; i < board.length; i++) {
                numOfX = 0;
                numOfO = 0;
                for (int j = 0; j < board.length; j++) {
                    int n = board[j][i];
                    if (n == 1) {
                        numOfX ++;
                        if (numOfX == size) {
                            gotResult = true;
                            System.out.println("X");
                            break COL_LOOP;
                        }
                    }
                    else if (n == 0) {
                        numOfO ++;
                        if (numOfO == size) {
                            gotResult = true;
                            System.out.println("O");
                            break COL_LOOP;
                        }
                    }
                }
            }
        }
        //检查正对角线
        DIAGONAL_LOOP1:
        if (gotResult == false) {
            numOfX = 0;
            numOfO = 0;
            for (int i = 0; i < board.length; i++) {
                int n = board[i][i];
                if (n == 1) {
                    numOfX ++;
                    if (numOfX == size) {
                        gotResult = true;
                        System.out.println("X");
                        break DIAGONAL_LOOP1;
                    }
                }
                else if (n == 0) {
                    numOfO ++;
                    if (numOfO == size) {
                        gotResult = true;
                        System.out.println("O");
                        break DIAGONAL_LOOP1;
                    }
                }
                
            }
        }
        //检查反对角线

        DIAGONAL_LOOP2:
        if (gotResult == false) {
            numOfX = 0;
            numOfO = 0;
            for (int i = board.length - 1; i >= 0; i--) {
                int n = board[i][i];
                if (n == 1) {
                    numOfX ++;
                    if (numOfX == size) {
                        gotResult = true;
                        System.out.println("X");
                        break DIAGONAL_LOOP2;
                    }
                }
                else if (n == 0) {
                    numOfO ++;
                    if (numOfO == size) {
                        gotResult = true;
                        System.out.println("O");
                        break DIAGONAL_LOOP2;
                    }
                }
                
            }
        }
        if (numOfO < size && numOfX < size) {
            System.out.println("NIL");
        }
    }
}
