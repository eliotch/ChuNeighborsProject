public class Board {
    private int[][] board;
    public Board(){
        board=new int[5][5];
    }
    public int[][] getBoard(){
        return board;
    }

    public void setBoard(int r, int c, int num){
        board[r-1][c-1]=num;
    }

    public static boolean isValid(int r, int c) {
        r--;
        c--;
        boolean valid=false;
        if((r>=1&&r<=5)&&(c>=1&&c<=5)) {
            valid=true;
        }
        if()
        return false;
    }
}
