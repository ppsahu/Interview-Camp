// Given an array of integers, both -ve and +ve, find a contiguous subarray that sums to 0.
// For example: [2,4,-2,1,-3,5,-3] --> [4,-2,1,-3]

// time - O(n)
// space -  O(1)

import java.util.HashMap;

public class prefixSums {
    public static int[] findSumZero(int[] a){
        if(a == null || a.length == 0){
            return null;
        }
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = a[0];
        map.put(sum, 0);
        int ind = 1;
        while (ind < a.length) {
            sum = sum + a[ind];
            if(sum == 0){
                ans[0] = 0;
                ans[1] = ind;
                break;
            }
            if(map.containsKey(sum)){
                ans[0] = map.get(sum) + 1;
                ans[1] = ind;
                break;
            }
            ind++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] inputArray = {1, 0, 0, 0, 0};
        int[] resultArray = findSumZero(inputArray);
        if(resultArray == null){
            System.out.print("Empty input array");
        }
        else{
            for(int i = 0 ; i < resultArray.length ; i++){
                if(resultArray[i] == -1){
                    System.out.print("Subarray not available");
                    break;
                }
                System.out.print(resultArray[i] + " ");
            }
        }
    }
}
