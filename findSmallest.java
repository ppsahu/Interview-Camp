// Given a sorted array A that has been rotated in a cycle, 
// find the smallest element of the array in O(log(n)) time. 

// For example,

// [1,2,4,5,7,8] rotated by 3 gives us A = [5,7,8,1,2,4] and the smallest number is 1.
// [1,2,4,5,7,8] rotated by 1 gives us A = [8,1,2,4,5,7] and the smallest number is 1.

// time - O(log n)
// space - O(1)

public class findSmallest {
    public static int searchBinary(int[] a){
        if(a == null || a.length == 0){
            return -1;
        }
        int start = 0;
        int end = a.length - 1;
        int right = a[a.length - 1];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (a[mid] <= right && (mid == 0 || a[mid - 1] > a[mid])) {
                return mid;
            }
            else if (a[mid] > right) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] inputArray = {7,8,9,10,3,4,5,6};
        int result = searchBinary(inputArray);
        if(result == -1){
            System.out.print("Target element not found in the array or empty input array");
        }
        else{
            System.out.print("Smallest element is in index "+ result);
        }  
    }
}
