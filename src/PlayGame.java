import java.util.Scanner;
import java.util.Arrays;
public class PlayGame {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Neighbors");
        Board board=new Board();
        for(int[] a: board.getBoard()){
            System.out.println(Arrays.toString(a));
            }

        for(int i=0; i<25; i++){
            int num=Dice.randNum();
            System.out.println("number "+ (i+1)+": "+ num);
            System.out.println("Enter row number (1-5): ");
            int row=scan.nextInt();
            System.out.println("Enter column number (1-5): ");
            int col=scan.nextInt();
            if(board.isValid(row, col)){
                board.setBoard(row, col, num);
                for(int[] a: board.getBoard()){
                    System.out.println(Arrays.toString(a));
                }
            }else{
                while(!board.isValid(row, col)) {
                    System.out.println("That spot is either taken or invalid, try again: ");
                    System.out.println("number " + (i + 1) + ": " + num);
                    System.out.println("Enter row number (1-5): ");
                    row = scan.nextInt();
                    System.out.println("Enter column number (1-5): ");
                    col = scan.nextInt();
                }
            }
        }
    }
}
