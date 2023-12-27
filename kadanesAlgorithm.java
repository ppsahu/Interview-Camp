// Given an array of integers that can be both +ve and -ve, 
// find the contiguous subarraywith the largest sum.
// For example:  [1,2,-1,2,-3,2,-5]  -> first 4 elements have the largest sum. 
// Return (0,3)

// time - O(n)
// space - O(1)

public class kadanesAlgorithm {
    public static int maxSumSubarray(int[] a){
        if (a.length == 0) {
            return 0;
        }
        if(a.length == 1){
            return a[0];
        }
        int totalMax = a[0];
        int runningMax = a[0];
        for(int ind = 1; ind < a.length ; ind++){

            // kadanes formula
            // remember always
            runningMax = Math.max(runningMax + a[ind], a[ind]);
            totalMax = Math.max(totalMax, runningMax);
        }
        return totalMax;
    }
    public static void main(String[] args) {
        int[] inputArray = {-2, -3, -4, -1, 0, -7};
        int result = maxSumSubarray(inputArray);
        System.out.println(result);
        
    }
}
