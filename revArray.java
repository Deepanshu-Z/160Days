public class revArray {
   public static int[] reverseArray(int arr[]) {
        // code here
        int j = arr.length-1;
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,23,4,12,1};
        arr = reverseArray(arr);
        for (int i : arr) {
            System.out.print(i  + " ");
        }
    }
}
