import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {1,23,12,1,1,1,1,23,2,2,2,3,2,1,1,1,1,2,2,2,2};
        ArrayList<Integer> list =  new ArrayList<>();
        if(arr.length == 0) return;
        
        int count1 = 0;
        int count2 = 0;
        int ele1 = -1;
        int ele2 = -1;
        for(int  i = 0; i < arr.length ; i++){
            if(count1 == 0 && arr[i] != ele2){
                ele1 = arr[i];
                count1 = 1;
            }
            
            else if(count2 == 0 && arr[i] != ele1){
                ele2 = arr[i];
                count2 = 1;
            }
            
            else if(arr[i] == ele1) count1++;
            else if(arr[i] == ele2) count2++;
            else{
                count1--;
                count2--;
            }
        }
        
        count1 = 0;
        count2 = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(ele1 == arr[i]) count1++;
            else if(ele2 == arr[i]) count2++;
            
        }
        
            if(count1 > arr.length/3) list.add(ele1);
            if(count2 > arr.length/3) list.add(ele2);
            Collections.sort(list);

        System.out.println(list);
    }
}

