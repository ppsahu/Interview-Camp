// Given an array A, print all permutations of size X.
// For example,Input:A = [1,2,3] X = 2
// Output:[1, 2] [1, 3] [2, 1] [2, 3] [3, 1] [3, 2]

// time - O(exponential)
// space - O(n)

public class printPermutationsOfX_23 {
    public static void printPermutaitons(int[] a, int x){
        if(a == null || a.length == 0){
            return;
        }
        int[] buffer = new int[x];
        boolean[] isBuffer = new boolean[a.length];
        printAllPermutations(a, buffer, 0, isBuffer);
    }
    public static void printAllPermutations(int[] a, int[] buffer, int bufferIndex, boolean[] isBuffer){
        if(bufferIndex == buffer.length){
            printArray(buffer);
            return;
        }
        for(int i = 0 ; i < a.length ; i++){
            if(!isBuffer[i]){
                buffer[bufferIndex] = a[i];
                isBuffer[i] = true;
                printAllPermutations(a, buffer, bufferIndex + 1, isBuffer);
                isBuffer[i] = false;
            }
        }
    }
    public static void printArray(int[] buffer){
        for(int i = 0 ; i < buffer.length ; i++){
            System.out.print(buffer[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] inputArray = {1,2,3,4,5,6};
        printPermutaitons(inputArray, 3);
    }
}
