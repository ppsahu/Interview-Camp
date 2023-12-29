// Given a sorted array that can contain duplicates, find the first occurrence of thetarget element. 
// For example:A = [1,3,4,6,6,6,7] and Target = 6, return index 3.

// time - O(log n)
// space - O(1)

public class binarySearchWithDup {
    public static int searchTarget(int[] a, int target){
        if(a == null || a.length == 0){
            return -1;
        }
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(a[mid] > target || (a[mid] == target && mid > 0 && a[mid - 1] == target)){
                end = mid - 1;
            }
            else if(a[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] inputArray = {1,2,2,3,3,3,3,4,5,6};
        int result = searchTarget(inputArray, 3);
        if(result == -1){
            System.out.print("Target element not found in the array or empty input array");
        }
        else{
            System.out.print("Target element is in index "+ result);
        }  
    }
}
