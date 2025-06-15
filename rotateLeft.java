class rotateLeft {
    public static void main(String[] args) {
        int[] arr = {1,23,43,2,1,2,32};
        int k = 3; 
        int size = arr.length;
        if(k > size) k = k % size;
        int j = k-1;
        
        //reverse first k elements
        for(int i = 0; i < k / 2; i++){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
        }
        
        //reverse k+1 items 
        j = size - 1; 
        for(int i = k; i < ( size + k )/ 2; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        
        //reverse whole array
        j = size - 1;
        for(int i = 0; i < size/ 2; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            j--;
        }
    }
}