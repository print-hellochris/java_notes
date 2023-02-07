public class UnidimensionalArray {
    public static void main(String[] args) {
        String[] string_array = new String[5];
        int[] int_array = new int[5];

        for (int i = 0; i < string_array.length; i++) {
            string_array[i] = "Ain't this nice?";
            System.out.println(string_array[i]);
        }

        for (int i = 0; i < int_array.length; i++) {
            int_array[i] = i;
            System.out.println(int_array[i]);
        }

    }

}
