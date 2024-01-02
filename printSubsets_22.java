// Given an array of integers A, 
// print all its subsets.
// For example:Input:​ [1, 2, 3]
// Output:[] [1] [2] [3] [1, 2] [1, 3] [2, 3] [1, 2, 3]

// time - O(exponential)
// space - O(n)

public class printSubsets_22 {
    public static void printSubsets(int[] a){
        if(a == null || a.length == 0){
            return;
        }
        int[] buffer = new int[a.length];
        printAllSubsets(a, buffer, 0, 0);
    }
    public static void printAllSubsets(int[] a, int[] buffer, int aIndex, int bufferIndex){
        printArray(buffer, bufferIndex);
        if(bufferIndex >= buffer.length){
            return;
        }
        if(aIndex >= a.length){
            return;
        }
        for(int i = aIndex ; i < a.length ; i++){
            buffer[bufferIndex] = a[i];
            printAllSubsets(a, buffer, i + 1, bufferIndex + 1);
        }
    }
    public static void printArray(int[] buffer, int bufferIndex){
        if(bufferIndex == 0){
            System.out.print("[Empty array]");
        }
        for(int i = 0 ; i < bufferIndex ; i++){
            System.out.print(buffer[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] inputArray = {3,5,6};
        printSubsets(inputArray);
    }
}
