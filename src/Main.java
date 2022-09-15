class Solution {

    /**
     * Print 2D array in spiral form.
     * @param arr the matrix
     * @param i the row index
     * @param j the column index
     * @param m the width
     * @param n the height
     */
    void traverse2DArrayAndPrint(int arr[][], int i, int j, int m,
                                        int n, StringBuilder sb)
    {
        // The condition to return if indexes are outside the array
        if (i >= m || j >= n) {
            return;
        }

        // Print the top row
        for (int k = i; k < n; k++) {
            sb.append(arr[i][k] + ", ");
        }

        // Print the right column
        for (int k = i + 1; k < m; k++) {
            sb.append(arr[k][n - 1] + ", ");
        }

        // Print the bottom row
        if ((m - 1) != i) { // the last and top rows are not the same
            for (int k = n - 2; k >= j; k--) {
                sb.append(arr[m - 1][k] + ", ");
            }
        }

        // Print the left column
        if ((n - 1) != j) { // the last and top columns are not the same
            for (int p = m - 2; p > i; p--) {
                sb.append(arr[p][j] + ", ");
            }
        }
        traverse2DArrayAndPrint(arr, i + 1, j + 1, m - 1, n - 1, sb);
    }


    public static void main(String[] args)
    {
        int given2DArray[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        Solution solution = new Solution();
        StringBuilder sb = new StringBuilder();
        solution.traverse2DArrayAndPrint(given2DArray, 0, 0, 4, 4, sb);
        String output = sb.toString();
        System.out.println(output.substring(0, output.length()-2));
    }
}


