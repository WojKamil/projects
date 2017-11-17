public class Main {

    public static void main(String[] args) {
	// write your code here

        int[][] board;
        board = new int[3][9];
        board[0][0] = 1;
        board[0][1] = 7;
        board[0][2] = 5;
        board[0][3] = 2;
        board[0][4] = 9;
        board[0][5] = 4;
        board[0][6] = 8;
        board[0][7] = 3;
        board[0][8] = 6;
        board[1][0] = 6;
        board[1][1] = 2;
        board[1][2] = 3;
        board[1][3] = 1;
        board[1][4] = 8;
        board[1][5] = 7;
        board[1][6] = 9;
        board[1][7] = 4;
        board[1][8] = 5;
        board[2][0] = 8;
        board[2][1] = 9;
        board[2][2] = 4;
        board[2][3] = 5;
        board[2][4] = 6;
        board[2][5] = 3;
        board[2][6] = 2;
        board[2][7] = 7;
        board[2][8] = 1;

        for(int i=0; i< board.length; i++){
            for(int j=0; j< board[i].length; j++)
                System.out.print(board[i][j]);
            System.out.println();
        }

        for(int i=0; i< board.length; i++){
            for(int j=0; j< board[i].length; j++){
                int a = board[i][j];
                for(int z=0; z<board[i].length; z++) {
                        if(a==board[i][z] && j!=z) {
                            System.out.println("Duplicate");
                            break;
                        }
                }

                for(int y=0; y<board.length; y++) {
                    if (a == board[y][j] && y != i) {
                        System.out.println("Duplicate");
                        break;
                    }
                }





            }
            System.out.println();
        }



    }
}
