public class Board {
    private int[][] board;
    public Board(){
        board=new int[5][5];
    }

    public Board(int[][] testBoard){
        board=testBoard;
    }
    public int[][] getBoard(){
        return board;
    }

    public void setBoard(int r, int c, int num){
        board[r-1][c-1]=num;
    }

    public boolean isValid(int r, int c) {
        boolean valid=false;
        if((r>=1&&r<=5)&&(c>=1&&c<=5)) {
            valid=true;
        }else{
            return false;
        }
        if(board[r-1][c-1]==0){
            valid=true;
        }else{
            return false;
        }
        return valid;
    }

    public int sum(){
        int rowSum=0;
        int colSum=0;
        for(int i=0; i<board.length; i++){
            int currentNum=board[i][0];
            for(int j=1; j<board[0].length; j++){
                rowSum+=currentNum;
                if(board[i][j]==currentNum){
                    rowSum+=currentNum;
                }else{
                    rowSum-=currentNum;
                    currentNum=board[i][j];
                }
            }
        }
        for(int i=0; i<board[0].length; i++){
            int currentNum=board[0][i];
            for(int j=1; j<board.length; j++){
                colSum+=currentNum;
                if(board[j][i]==currentNum){
                    colSum+=currentNum;
                }else{
                    colSum-=currentNum;
                    currentNum=board[j][i];
                }
            }
        }
        return rowSum+colSum;
    }
}
