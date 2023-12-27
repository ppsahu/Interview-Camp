// You are given an array of integers. Rearrange the array so that all zeroes are at
// the beginning of the array.
// For example,a = [4,2,0,1,0,3,0] -> [0,0,0,4,1,2,3]

// time - O(n)
// space - O(1)

public class zeroesToBeginning {
    public static int[] moveZeroes(int[] a){
        if(a.length <= 1){
            return a;
        }
        int boundary = 0;
        int swapInd = boundary;
        while(swapInd < a.length){
            if(a[swapInd] == 0){
                int temp = a[boundary];
                a[boundary] = a[swapInd];
                a[swapInd] = temp;
                boundary++;
            }
            swapInd++;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] inputArray = {};
        int[] resultArray = moveZeroes(inputArray);
        if(resultArray.length == 0){
            System.out.print("Empty input array");
        }
        else{
            for(int i = 0 ; i < resultArray.length ; i++){
                System.out.print(resultArray[i] + " ");
            }
        }
    }
}
