import java.util.Scanner;
import java.util.Arrays;
public class PlayGame {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Neighbors");
//        int[][] testBoard= {{9, 9, 5, 5, 5},
//                {9, 7, 5, 5, 5},
//                {2, 4, 3, 6, 5},
//                {2, 4, 3, 3, 3},
//                {8, 8, 3, 3, 3}};
//        int[][] testBoard= {{9, 9, 3, 10, 10},
//                {9, 9, 1, 7, 8},
//                {6, 4, 5, 7, 7},
//                {6, 6, 5, 3, 7},
//                {1, 2, 2, 3, 2}};
//        Board board = new Board(testBoard);
        Board board=new Board();
        for (int[] a : board.getBoard()) {
            System.out.println("-------------------------------");
            System.out.print("|");
            for (int b : a) {
                System.out.printf("%3d  |", b);
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
            for (int i = 0; i < board.getBoard().length*board.getBoard()[0].length; i++) {
                int num = Dice.randNum();
                System.out.println("number " + (i + 1) + ": " + num);
                System.out.println("Enter row number (1-"+board.getBoard().length+"): ");
                int row = scan.nextInt();
                System.out.println("Enter column number (1-"+board.getBoard()[0].length+"): ");
                int col = scan.nextInt();
                if (board.isValid(row, col)) {
                    board.setBoard(row, col, num);
                } else {
                    while (!board.isValid(row, col)) {
                        System.out.println("That spot is either taken or invalid, try again: ");
                        System.out.println("number " + (i + 1) + ": " + num);
                        System.out.println("Enter row number (1-5): ");
                        row = scan.nextInt();
                        System.out.println("Enter column number (1-5): ");
                        col = scan.nextInt();
                    }
                    board.setBoard(row, col, num);
                }
                for (int[] a : board.getBoard()) {
                    System.out.println("-------------------------------");
                    System.out.print("|");
                    for (int b : a) {
                        System.out.printf("%3d  |", b);
                    }
                    System.out.println();
                }
                System.out.println("-------------------------------");
            }
            System.out.println("You had sum of: "+board.sum());
        }
    }

