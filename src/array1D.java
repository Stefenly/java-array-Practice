public class array1D {
    public static void main(String[] args) {
        int[] scores = new int[]{1, 2, 3, 5, 6, 7, 8};
        System.out.println("All Scores (Normal Order ): ");

        for(int i = 0; i < scores.length; ++i) {
            System.out.print(scores[i] + " ");
        }

        System.out.println();
        System.out.println("All Scores (Reverse Order ): ");

        for(int i = scores.length - 1; i >= 0; --i) {
            System.out.print(scores[i] + " ");
        }

        System.out.println();
        int[][] condo = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Row: " + condo.length);
        System.out.println("Col in row = 0 : " + condo[0].length);

        for(int i = 0; i < condo.length; ++i) {
            for(int j = 0; j < condo[i].length; ++j) {
                System.out.print(condo[i][j] + " ");
            }

            System.out.println();
        }
    }
}
