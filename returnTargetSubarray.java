// Given an array of positive integers, 
// find a subarray that sums to a given number X.
// For e.g, input = [1,2,3,5,2] and X=8, 
// Result = [3,5] (indexes 2,3)

// time - O(n)
// space - O(2) ~ O(1)
public class returnTargetSubarray {
    public static int[] findSubarray(int[] a, int target){
        if(a == null){
            return null;
        }
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int start = 0;
        int end = 0;
        int sum = a[0];
        while(start < a.length){
            if(start > end){
                end = start;
                sum = a[start];
            }
            if(sum < target){
                if(end == a.length - 1){
                    break;
                }
                end++;
                sum = sum + a[end];
            }
            else if(sum > target){
                sum = sum - a[start];
                start++;
            }
            else{
                ans[0] = start;
                ans[1] = end;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] inputArray = {2, 5, 4, 7, 8, 3, 9};
        int[] resultArray = findSubarray(inputArray, 6);
        if(resultArray.length == 0){
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
