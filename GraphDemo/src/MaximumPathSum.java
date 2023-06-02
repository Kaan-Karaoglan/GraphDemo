public class MaximumPathSum {
    public static int maximumPathSum(int[][] triangle) {
        int n = triangle.length;

        // Start from the second last row of the triangle
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // Choose the maximum of the two adjacent values below
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }

        // The maximum path sum will be at the top of the triangle
        return triangle[0][0];
    }
}