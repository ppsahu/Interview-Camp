// Given an array, reverse the order of its elements.

public class reverseArray {
    public static int[] reverse(int[] a){
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            swap(a, start, end);
            start++;
            end--;
        }
        return a;
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int[] inputArray = {0, 1, 2, 3, 4};
        int[] resultArray = reverse(inputArray);
        for(int i = 0 ; i < resultArray.length ; i++){
            System.out.print(resultArray[i] + " ");
        }
    }
}
