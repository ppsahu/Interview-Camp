// Given an array of integers, find the shortest sub array, 
// that if sorted, results in theentire array being sorted.

// For example:

// [1,2,4,5,3,5,6,7] --> [4,5,3] - If you sort from indices 2 to 4, 
// the entire array is sorted.

// [1,3,5,2,6,4,7,8,9] --> [3,5,2,6,4] -  If you sort from indices 1 to 5, 
// the entire array is sorted.

// time - O(n)
// space - O(2) ~ O(n)

public class returnSubarray {
    public static int[] findSubarray(int[] a){
        if(a == null || a.length <= 1){
            return null;
        }
        int[] ans = new int[2];
        int start;
        for(start = 0 ; start < a.length - 1 ; start++){
            if(a[start] > a[start + 1]){
                break;
            }
        }
        if(start == a.length - 1){
            return null;
        }
        int end;
        for(end = a.length - 1 ; end >= 0 ; end--){
            if(a[end] < a[end - 1]){
                break;
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i = start, j = end;
        while(i <= j){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
            i++;
        }
        while(start > 0 && a[start - 1] > min){
            start--;
        }
        while (end < a.length - 1 && a[end + 1] < max) {
            end++;
        }
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    public static void main(String[] args) {
        int[] inputArray = {1,3,5,2,6,4,7,8,9};
        int[] resultArray = findSubarray(inputArray);
        if(resultArray == null){
            System.out.print("Empty input array");
        }
        else{
            for(int i = 0 ; i < resultArray.length ; i++){
                System.out.print(resultArray[i] + " ");
            }
        }
        
    }
}
