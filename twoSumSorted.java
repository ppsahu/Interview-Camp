// 2 Sum Problem: Given a sorted array of integers, 
// find two numbers in the array that sumto a given 
// integer target.

public class twoSumSorted {
    public static int[] twoSum(int[] a, int target){
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            if(start + end == target){
                return new int[]{a[start], a[end]};
            }
            else if (start + end < target) {
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] inputArray = {0, 1, 2, 3, 4};
        int[] resultArray = twoSum(inputArray, 5);
        for(int i = 0 ; i < resultArray.length ; i++){
            System.out.print(resultArray[i] + " ");
        }
    }
}
