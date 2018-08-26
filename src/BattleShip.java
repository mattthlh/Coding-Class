import java.util.Scanner;
import java.util.Random;

public class BattleShip {
  private static Scanner sc = new Scanner(System.in);
  private static Random rand = new Random();
  
  //Initialize 10 by 10 arrays
  private static String[][] board = new String[10][10];
  private static String[][] shipPositions = new String[15][15];
  
  private static boolean winfalse = true;
  
  private static int countForWinP1 = 0;
  private static int countForWinP2 = 0;
  
  private static int turns = 0;
  private static int sizeOfDestroyer = 2;
  private static int sizeOfCruiser = 3;
  private static int sizeOfBattleship = 4;
  private static int sizeOfCarrier = 5;

  public static void main(String[] args) {
    init(board);
    init(shipPositions);
    
    randShipP1(sizeOfCarrier);
    randShipP1(sizeOfBattleship);
    randShipP1(sizeOfCruiser);
    randShipP1(sizeOfCruiser);
    randShipP1(sizeOfDestroyer);
    
    randShipP2(sizeOfCarrier);
    randShipP2(sizeOfBattleship);
    randShipP2(sizeOfCruiser);
    randShipP2(sizeOfCruiser);
    randShipP2(sizeOfDestroyer);
    
    //runs the method that runs the problem
    run();
  }
  
  private static void init(String[][]board) {
    
    //Initialize the board to nothing instead of numbers
     for(int row = 0; row < board.length; row++) {
              for(int col = 0; col < board[0].length; col++) {
                  board[row][col] = "~";
              }
     }
    
    // randomly put in ships
  }
    
  //Method that runs the program
  private static void run() {
	 printboard(board);
    System.out.println("Type cordinates(example:5,5)");
    

    while(turns < board.length * board[0].length && winfalse == true) {
    	//player one's turn
      if(turns % 2 == 0) {
        String move = sc.nextLine();
        String[] cord = move.split(",");
        String part1a = cord[0];
        String part2a = cord[1];
        int part1 = Integer.parseInt(part1a);
        int part2 = Integer.parseInt(part2a);
        //Checks if the it is empty
        if(board[part1][part2].equals("*") || shipPositions[part1][part2].equals("x") || board[part1][part2].equals("o")) {
          System.out.println("Invalid Move!");
          System.out.println("Try again!");
        }
        //Hits player two's ship
        else if(shipPositions[part1][part2].equals("o")){
        	board[part1][part2] = ("o");
        	winfalse = checkWin(countForWinP1);
        	printboard(board);
        	System.out.println("HIT!");
        	System.out.println("Go again");
        }
        else {
            board[part1][part2] = "*";
            printboard(board);
            turns++;
          //checks if it has been hit
          }
      }
      //Player two's turn
      else if(turns % 2 == 1) {
        String move = sc.nextLine();
        String[] cord = move.split(",");
        String part1a = cord[0];
        String part2a = cord[1];
        int part1 = Integer.parseInt(part1a);
        int part2 = Integer.parseInt(part2a);
        // checks if it has been hit
        if(board[part1][part2].equals("*") || shipPositions[part1][part2].equals("o") || board[part1][part2].equals("x")){
          System.out.println("Invalid Move!");
          System.out.println("Try again!");
        }
        //Hits
        else if(shipPositions[part1][part2].equals("x")){
        	board[part1][part2] = "x";
        	winfalse = checkWin(countForWinP2);
        	printboard(board);
        	System.out.println("HIT!");
        	System.out.println("Go again");
        }
        //Change ~ into a miss(*)
        else {
        	 board[part1][part2] = "*";
             printboard(board);
             turns++;
        //Exit program if turns doesn't equal 0 or 1
      }
    }
      else {
        break;
      }
    }
  }

  // method that prints the current board
  private static void printboard(String[][]board) {
    System.out.print(" ");
    for(int i = 0; i < board.length; i++) {
      System.out.print(" "  + i);
    }
    System.out.println("\n ---------------------");
    for(int i = 0; i < board.length; i++) {
      System.out.print(i + "|");
      for(int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j] + "|");
      }
      System.out.println("\n ---------------------");
    }
  }
  
  private static void randShipP1(int shipSize) {
	while(true) {
	int x = rand.nextInt(board[0].length);
	int y = rand.nextInt(board.length);
	int horaVert = rand.nextInt(2);
	for(int i = 1; i <= shipSize; i++) {
		if(!shipPositions[x + i][y].equals("~") && x + 1 <= 9 && x >= 0 && y <= 9 && y >= 0) {
			continue;
		}
		else {
		}
	}
	for(int i = 1; i <= shipSize; i++) {
		if(!shipPositions[x][y + i].equals("~") && x + 1 <= 9 && x >= 0 && y <= 9 && y >= 0) {
			continue;
		}
		else {
		}
	}
	if(shipPositions[x][y].equals("~")) {
		shipPositions[x][y] = "x";
		if(horaVert == 0) {
			for(int i = 0; i < shipSize; i++) {
				if(x + 1 <= 9 && x >= 0 && y <= 9 && y >= 0) {
					shipPositions[x][y] = "x";	
					x++;
				}
				else {
				}
			}
			return;
		}
		else {
			for(int i = 0; i < shipSize; i++) {
				if(x <= 9 && x >= 0 && y <= 9 && y >= 0) {
					shipPositions[x][y] = "x";	
					y++;
				}
				else {
				}
			}
			return;
		}
	}
	else {
	}
	}
  }
  private static void randShipP2(int shipSize) {
	int x = rand.nextInt(board[0].length);
	int y = rand.nextInt(board.length);
	int horaVert = rand.nextInt(2);
	for(int i = 1; i <= shipSize; i++) {
		if(!shipPositions[x + i][y].equals("~") && x + 1 <= 9 && x >= 0 && y <= 9 && y >= 0) {
			continue;
		}
		else {
		}
	}
	for(int i = 1; i <= shipSize; i++) {
		if(shipPositions[x][y + i].equals("~") && x + 1 <= 9 && x >= 0 && y <= 9 && y >= 0) {
			continue;
		}
		else {
		}
	}
	if(shipPositions[x][y].equals("~")) {
		shipPositions[x][y] = "o";
		if(horaVert == 0) {
			for(int i = 0; i < shipSize; i++) {
				if(x <= 9 && x >= 0 && y <= 9 && y >= 0) {
					shipPositions[x][y] = "o";	
					x++;
				}
				else {
				}
			}
			return;
		}
		else {
			for(int i = 0; i < shipSize; i++) {
				if(x <= 9 && x >= 0 && y <= 9 && y >= 0) {
					shipPositions[x][y] = "o";	
					y++;
				}
				else {
				}
			}
			return;
		}
	}
	else {
	}
 }
  private static boolean checkWin(int counter) {
	  if(counter == (sizeOfDestroyer + sizeOfCruiser + sizeOfCruiser + sizeOfBattleship + sizeOfCarrier)) {
		  System.out.println("You Win!");
		  return false;
	  }
	  else {
		  return true;
	  }
  }
}