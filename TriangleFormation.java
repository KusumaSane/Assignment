/* Given an array form a triangle such that the last row of the triangle contains all the elements of the array
and the row above it will contain the sum of two elements below it.arr[] = {4, 7, 3, 6, 7}; */

public class TriangleFormation {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 6, 7};
        int[][] triangle = formTriangle(arr);

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] formTriangle(int[] arr) {
        int n = arr.length;
        int[][] triangle = new int[n][];

        triangle[n - 1] = new int[n];
        System.arraycopy(arr, 0, triangle[n - 1], 0, n);  // Copy the last row from the input array

        for (int i = n - 2; i >= 0; i--) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = triangle[i + 1][j] + triangle[i + 1][j + 1];  // Sum of two elements below
            }
        }

        return triangle;
    }
}

