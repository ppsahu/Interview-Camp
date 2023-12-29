// Given a sorted array of Integers, find the target. 
// If the target is not found,return the element closest to the target.
// For example,A = [1,2,4,5,7,8,9], Target = 6 
// -> Output Index = 3 or 4 (since both 5 and 7 are equally close)

//time - O(log n)
// space - O(1)

public class searchForClosest {
    public static int searchClosest(int[] a, int target){
        if(a == null || a.length == 0){
            return -1;
        }
        int start = 0;
        int end = a.length - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            result = record(a, mid, result, target);
            if(a[mid] > target){
                end = mid - 1;
            }
            else if(a[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return result;
    }
    public static int record(int[] a, int mid, int result, int target){
        if(result == -1 || (Math.abs(a[mid] - target) < Math.abs(a[result] - target))){
            return mid;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] inputArray = {10,20,30,40,50,60};
        int result = searchClosest(inputArray, 55);
        if(result == -1){
            System.out.print("Target element not found in the array or empty input array");
        }
        else{
            System.out.print("Closest to target element is in index "+ result);
        }  
    }
}
