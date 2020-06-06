import java.util.Random;

public class FrogPossibility {
    //Initialized variable used in code
    final static Random rand = new Random();
    final static int loops = 10000;
    static int tR = 0;
    static int bR = 0;
    static int tL = 0;
    static int bL = 0;
    public static void main(String[] args) {
        //loops for loops times
        for(int i = 0; i < loops; i++) {
            //resets everything
            boolean condition = true;
            int x = 1;
            int y = 2;
            //while frog is not in corners
            while(condition) {
                //checks if frogs in corner
                if (x == 0 && y == 0) {
                    condition = false;
                } else if (x == 3 && y == 0) {
                    condition = false;
                } else if (x == 0 && y == 3) {
                    condition = false;
                } else if (x == 3 && y == 3) {
                    condition = false;
                } else {
                    //set random number for random directions
                    int n = rand.nextInt(4);
                    if (n == 0) {
                        if (x != 3) {
                            x++;
                        }
                    } else if (n == 1) {
                        if (y != 0) {
                            y--;
                        }
                    } else if (n == 2) {
                        if (x != 0) {
                            x--;
                        }
                    } else if (n == 3){
                        if (y != 3) {
                            y++;
                        }
                    }
                }
            }
            //keeps count of the number of times the frog has exited a corner
            if (x == 3 && y == 3) {
                tR++;
            } else if (x == 0 && y == 3) {
                tL++;
            } else if (x == 3 && y == 0) {
                bR++;
            } else if (x == 0 && y == 0) {
                bL++;
            }
        }
        //After loop, calculated the times the frog has exited on the left side.
        int numerator = tL + bL;
        System.out.println(numerator);
        System.out.println((double)numerator/loops);
    }
}