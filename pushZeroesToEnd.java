public class pushZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int j = 0;

        //Moving non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && i != j) {
                arr[j] = arr[i];
                j++;
            }
            else if (arr[i] != 0) {
                j++;
            }
        }

        //moving zeroes
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }
        
        //printing array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
