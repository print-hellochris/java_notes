public class WriteMdArr {
    public static void main(String[] args) {
        WriteMdArr multi_array = new WriteMdArr();
        multi_array.MdArr(3, 3);
    }

    public void MdArr(int row, int collumn) {
        int[][] int_multidimensional_array = new int[row][collumn];
        int number = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collumn; j++) {
                int_multidimensional_array[i][j] = number;
                number++;
            }
        }
        // prints the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collumn; j++) {
                System.out.print(int_multidimensional_array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}