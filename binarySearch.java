// Given a sorted array, search for a target item.

// time = O(log n)
// space = O(1)

public class binarySearch{
    public static int searchBinary(int[] a, int target){
        if(a == null || a.length == 0){
            return -1;
        }
        int start = 0;
        int end = a.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
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
        return -1;
    }
    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5,6};
        int result = searchBinary(inputArray, 2);
        if(result == -1){
            System.out.print("Target element not found in the array or empty array");
        }
        else{
            System.out.print("Target element is in index "+ result);
        }
        
    }
}