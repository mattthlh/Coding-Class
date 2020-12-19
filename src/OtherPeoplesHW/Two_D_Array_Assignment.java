package OtherPeoplesHW;

public class Two_D_Array_Assignment {

    // Question 1
    public int movieAvgRating(int[][] ratings, int movie) {

        // Init our variables outside of the for loop, so we can access it outside as well
        int avgRating = 0;

        // This for loop will loop through the number of reviews on the chosen movie
        for (int i = 0; i <  ratings.length; i++) {

            // To get the average, add all ratings then divide later
            avgRating += ratings[i][movie];
        }

        // This is when you would divide
        avgRating /=  ratings.length;

        return avgRating;
    }

    // Question 2
    public int reviewerAvgRating(int[][] ratings, int reviewer) {
        // Basically the same as the first question, but look at the col instead of row

        int avgRating = 0;

        for (int i = 0; i < ratings[0].length; i++) {

            avgRating += ratings[reviewer][i];
        }

        avgRating /=  ratings[0].length;

        return avgRating;
    }

    // Question 3
    public int avgRating2018(int[][] ratings) {
        // Loop through everything instead of just a row or col
        int avgRating = 0;

        // 2 for loops, one to loop all the rows, the other to loop through all the cols
        for (int i = 0; i < ratings.length; i++) {
            for (int j = 0; j < ratings[i].length; j++) {
                // Add each up
                avgRating += ratings[i][j];
            }
        }

        // Divide by the total num of reviews
        avgRating /=  ratings.length * ratings[0].length;

        return avgRating;
    }

    // Question 4
    public int hardestRater2018(int[][] ratings) {
        // Will use previous methods to find answer
        int hardestRater = Integer.MAX_VALUE;;
        int index = 0;

        for (int i = 0; i < ratings.length; i++) {
            int current = reviewerAvgRating(ratings, i);

            if(current < hardestRater) {
                hardestRater = current;
                index = i;
            }
        }

        return index;
    }

    // Question 5
    public int worstMovie2018(int[][] ratings) {
        int worstMovie = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < ratings[0].length; i++) {
            int current = movieAvgRating(ratings, i);

            if(current < worstMovie) {
                worstMovie = current;
                index = i;
            }
        }

        return index;
    }
}