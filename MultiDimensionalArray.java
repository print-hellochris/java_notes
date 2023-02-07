public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] int_multidimensional_array = new int[3][3];
        int number = 0;
        // Writes values on MD.Array. There is a nested loop.
        // First it starts on the row, j. After that, the collumn
        // variable (i) increments +1 and goes to next row.
        for (int i = 0; i < int_multidimensional_array.length; i++) {
            for (int j = 0; j < int_multidimensional_array.length; j++) {
                int_multidimensional_array[i][j] = number;
                number++;
            }
        }
        // prints the array
        for (int i = 0; i < int_multidimensional_array.length; i++) {
            for (int j = 0; j < int_multidimensional_array.length; j++) {
                System.out.print(int_multidimensional_array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
