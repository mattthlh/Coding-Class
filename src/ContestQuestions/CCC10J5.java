package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class CCC10J5 {
    static int[][] dist;
    static boolean[][] vist;
    public static class Coordinates {
        int row;
        int col;

        public Coordinates(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = in.readLine().split(" ");
        Coordinates startingCoordinates = new Coordinates(Integer.parseInt(tokens[1]),
                Integer.parseInt(tokens[0]));

        tokens = in.readLine().split(" ");
        Coordinates endingCoordinates = new Coordinates(Integer.parseInt(tokens[1]),
                Integer.parseInt(tokens[0]));

        dist = new int[9][9];
        vist = new boolean[9][9];

        System.out.println(bfs(startingCoordinates, endingCoordinates));
    }

    public static int bfs(Coordinates startingCoordinates, Coordinates endingCoordinates) {
        Queue<Coordinates> queue = new LinkedList<>();
        queue.add(startingCoordinates);

        int startingRow = startingCoordinates.row;
        int startingCol = startingCoordinates.col;

        int endingRow = endingCoordinates.row;
        int endingCol = endingCoordinates.col;

        dist[startingRow][startingCol] = 0;
        vist[startingRow][startingCol] = true;

        if(startingRow == endingRow && startingCol == endingCol)
            return 0;

        while(!queue.isEmpty()) {
            Coordinates currentCord = queue.poll();
            int currentRow = currentCord.row;
            int currentCol = currentCord.col;

            int newRow;
            int newCol;

            if(currentRow == endingRow && currentCol == endingCol)
                return dist[currentRow][endingCol];

            if (currentCol + 1 <= 8) {
                newCol = currentCol + 1;
                if (currentRow + 2 <= 8) {
                    newRow = currentRow + 2;
                    if (!vist[newRow][newCol]) {
                        dist[newRow][newCol] = dist[currentRow][currentCol] + 1;
                        vist[newRow][newCol] = true;
                        queue.add(new Coordinates(newRow, newCol));
                    }
                }
                if (currentRow - 2 > 0) {
                    newRow = currentRow - 2;
                    if (!vist[newRow][newCol]) {
                        dist[newRow][newCol] = dist[currentRow][currentCol] + 1;
                        vist[newRow][newCol] = true;
                        queue.add(new Coordinates(newRow, newCol));
                    }
                }
            }

            if (currentCol + 2 <= 8) {
                newCol = currentCol + 2;
                if (currentRow + 1 <= 8) {
                    newRow = currentRow + 1;
                    if (!vist[newRow][newCol]) {
                        dist[newRow][newCol] = dist[currentRow][currentCol] + 1;
                        vist[newRow][newCol] = true;
                        queue.add(new Coordinates(newRow, newCol));
                    }
                }
                if (currentRow - 1 > 0) {
                    newRow = currentRow - 1;
                    if (!vist[newRow][newCol]) {
                        dist[newRow][newCol] = dist[currentRow][currentCol] + 1;
                        vist[newRow][newCol] = true;
                        queue.add(new Coordinates(newRow, newCol));
                    }
                }
            }

            if (currentCol - 1 > 0) {
                newCol = currentCol - 1;
                if (currentRow + 2 <= 8) {
                    newRow = currentRow + 2;
                    if (!vist[newRow][newCol]) {
                        dist[newRow][newCol] = dist[currentRow][currentCol] + 1;
                        vist[newRow][newCol] = true;
                        queue.add(new Coordinates(newRow, newCol));
                    }
                }
                if (currentRow - 2 > 0) {
                    newRow = currentRow - 2;
                    if (!vist[newRow][newCol]) {
                        dist[newRow][newCol] = dist[currentRow][currentCol] + 1;
                        vist[newRow][newCol] = true;
                        queue.add(new Coordinates(newRow, newCol));
                    }
                }
            }

            if (currentCol - 2 > 0) {
                newCol = currentCol - 2;
                if (currentRow + 1 <= 8) {
                    newRow = currentRow + 1;
                    if (!vist[newRow][newCol]) {
                        dist[newRow][newCol] = dist[currentRow][currentCol] + 1;
                        vist[newRow][newCol] = true;
                        queue.add(new Coordinates(newRow, newCol));
                    }
                }
                if (currentRow - 1 > 0) {
                    newRow = currentRow - 1;
                    if (!vist[newRow][newCol]) {
                        dist[newRow][newCol] = dist[currentRow][currentCol] + 1;
                        vist[newRow][newCol] = true;
                        queue.add(new Coordinates(newRow, newCol));
                    }
                }
            }
        }
        return dist[endingRow][endingCol];
    }
}
