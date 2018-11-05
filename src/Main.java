import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static String[][] board = new String[5][5];

    public static void main(String args[]){

        int bodyPartCount = 0;
        ArrayList<SnakeBodyPart> coordinates = new ArrayList<>();

        Random  rand = new Random();
        int row = rand.nextInt(5);
        int col = rand.nextInt(5);


        SnakeBodyPart head = new SnakeBodyPart(3, 4, "s");
        Entity apple = new Apple(row, col, "x");

        board[head.getRow()][head.getCol()] = head.getCharacter();
        board[apple.getRow()][apple.getCol()] = apple.getCharacter();

        coordinates.add(head);

        printBoard();

        Scanner sc = new Scanner(System.in);
        while(true){
            String userInput = sc.nextLine();
            coordinates.set(0, new SnakeBodyPart(head.getRow(), head. getCol(), "~"));
            coordinates.add(0, head);
            if(userInput.equalsIgnoreCase("l")) {
                head.setCol(head.getCol() - 1);
            } else if(userInput.equalsIgnoreCase("r")){
                head.setCol(head.getCol() + 1);
            } else if(userInput.equalsIgnoreCase("u")){
                head.setRow(head.getRow() - 1);
            } else if(userInput.equalsIgnoreCase("d")){
                head.setRow(head.getRow() + 1);
            } else {
                System.out.println("Press L, R U or D");
            }
            if(head.getCol() == apple.getCol() && head.getRow() == apple.getRow()) {
                System.out.println("You hit the apple!");
                int previousRow;
                int previousCol;
                if(userInput.equals("l")){
                    previousCol = head.getCol() + 1;
                    previousRow = head.getRow();
                } else if(userInput.equals("r")){
                    previousCol = head.getCol() - 1;
                    previousRow = head.getRow();
                } else if(userInput.equals("u")){
                    previousCol = head.getCol();
                    previousRow = head.getRow() + 1;
                } else {
                    previousCol = head.getCol();
                    previousRow = head.getRow() - 1;
                }

                SnakeBodyPart bodyPart = new SnakeBodyPart(previousRow,previousCol,"~");
                coordinates.add(bodyPart);
                bodyPartCount += 1;
            }
            if(bodyPartCount <= coordinates.size()){
                coordinates.remove(coordinates.size() - 1);
            }
            try {
                for(int i = 0; i < coordinates.size(); i++) {
                    board[coordinates.get(i).getRow()][coordinates.get(i).getCol()] = coordinates.get(i).getCharacter();
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Game Over");
                break;
            }
            while(true) {
                if (!board[apple.getRow()][apple.getCol()].equals(" ")) {
                    apple.setCol(rand.nextInt(5));
                    apple.setRow(rand.nextInt(5));
                } else {
                    break;
                }
            }
            board[apple.getRow()][apple.getCol()] = apple.getCharacter();
            //checks collusion
            if(board[head.getRow()][head.getCol()].equals("~")) {
                System.out.println("Game Over");
                break;
            }
            printBoard();
        }
    }
    public static void printBoard(){
        System.out.print(" ");
        for(int i = 0; i < board.length; i++) {
            System.out.print(" "  + i);
        }
        System.out.println("\n -----------");
        for(int i = 0; i < board.length; i++) {
            System.out.print(i + "|");
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == null) {
                    board[i][j] = " ";
                }
                System.out.print(board[i][j] + "|");
                board[i][j] = " ";
            }
            System.out.println("\n -----------");
        }

    }
}
