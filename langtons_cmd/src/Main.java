public class Main {

    enum Direction {
        NORTH, EAST, SOUTH, WEST
    }

    public static void main(String[] args) {
	// write your code here
        //System.out.println("hello, world");
        int board[][] = new int[5][5];
        int x = 2, y = 2;
        Direction dir = Direction.WEST;
        int iterations = 200;


        for(int i = 0; i < board.length; i++){
            System.out.println("");
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
                System.out.print(board[i][j]+" ");
            }
        }

        // ANT ! !
     while (iterations > 0) {

         switch (dir) {
             case NORTH:
                 y--;
                 if (board[x][y] == 0) {
                     dir = Direction.WEST;
                     board[x][y] = 1;
                 } else {
                     dir = Direction.EAST;
                     board[x][y] = 0;
                 }
                 break;
             case EAST:
                 x++;
                 if (board[x][y] == 0) {
                     dir = Direction.NORTH;
                     board[x][y] = 1;
                 } else {
                     dir = Direction.SOUTH;
                     board[x][y] = 0;
                 }
                 break;
             case SOUTH:
                 y++;
                 if (board[x][y] == 0) {
                     dir = Direction.EAST;
                     board[x][y] = 1;
                 } else {
                     dir = Direction.WEST;
                     board[x][y] = 0;
                 }
                 break;
             case WEST:
                 x--;
                 if (board[x][y] == 0) {
                     dir = Direction.SOUTH;
                     board[x][y] = 1;
                 } else {
                     dir = Direction.NORTH;
                     board[x][y] = 0;
                 }
                 break;
             default:
                 dir = Direction.NORTH;
                 break;
         }
         iterations--;

         System.out.println();
         System.out.println();

         for(int i = 0; i < board.length; i++){
             System.out.println("");
             for(int j = 0; j < board[i].length; j++) {
                 System.out.print(board[i][j]+" ");
             }
         }

         if(x<=0 || x>board[x].length && y<=0 || x>board[y].length){
             iterations = 0;
             System.out.print("OUT OF BOARD");
         }
         try {
             Thread.sleep(100);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }




    }
}
