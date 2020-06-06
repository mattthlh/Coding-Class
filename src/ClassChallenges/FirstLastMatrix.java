package ClassChallenges;

import java.util.ArrayList;
import java.util.List;

class Util
{
    // Function to print the route taken
    public static void printPath(List<Integer> path, int last)
    {
        for (int i : path) {
            System.out.print(i + " - ");
        }
        System.out.println(last);
    }

    public static void findPaths(int[][] mat, List<Integer> path,
                                 int i, int j)
    {
        int M = mat.length;
        int N = mat[0].length;

        // if we have reached the last cell, print the route
        if (i == M - 1 && j == N - 1)
        {
            printPath(path, mat[i][j]);
            return;
        }

        // include current cell in path
        path.add(mat[i][j]);

        // move right
        if ((i >= 0 && i < M && j + 1 >= 0 && j + 1 < N)) {
            findPaths(mat, path, i, j + 1);
        }

        // move down
        if ((i + 1 >= 0 && i + 1 < M && j >= 0 && j < N)) {
            findPaths(mat, path, i + 1, j);
        }

        // remove current cell from path
        path.remove(path.size() - 1);
    }

    public static void main(String[] args)
    {
        int[][] mat =
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                };

        List<Integer> path = new ArrayList<>();

        // start from (0, 0) cell
        int x = 0, y = 0;

        findPaths(mat, path, x, y);
    }
}