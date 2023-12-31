// Given an array of integers, print all combinations of size X.

// time - O(2^n) - exponential
// space - O(x) ~ O(combination size)

public class printComboOfX_20 {
    public static void printCombos(int[] a, int x){
        if(a == null || a.length == 0 || x > a.length){
            return;
        }
        int[] buffer = new int[x];
        printCombosHelper(a, buffer, 0, 0);
    }
    public static void printCombosHelper(int[] a, int[] buffer, int startIndex, int bufferIndex){
        if(bufferIndex == buffer.length){
            printArray(buffer);
            return;
        }
        if(startIndex == a.length){
            return;
        }
        for(int i = startIndex ; i < a.length ; i++){
            buffer[bufferIndex] = a[i];
            printCombosHelper(a, buffer, i + 1, bufferIndex + 1);
        }
    }
    public static void printArray(int[] a){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5,6};
        int combo_no = 3;
        printCombos(inputArray, combo_no);
    }
}
