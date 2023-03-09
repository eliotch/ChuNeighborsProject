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
            for(int j=0; j<board[0].length-1; j++){
                rowSum+=currentNum; //fix this
                if(board[i][j+1]==currentNum){
                    rowSum+=currentNum;
                }else{
                    rowSum-=currentNum;
                    currentNum=board[i][j];
                }
            }
        }
        return rowSum+colSum;
    }
}
