// Given a sorted array in non-decreasing order, 
// return an array of squares of each number, 
// also in non-decreasing order. For example:
// [-4,-2,-1,0,3,5] -> [0,1,4,9,16,25]

// time - O(n)
// space - O(n)
public class returnSquares {
    public static int[] returnSquare(int[] a){
        int start = 0;
        int end = a.length - 1;
        int[] ans = new int[a.length];
        int endIndex = ans.length - 1;
        while (start <= end) {
            int leftSquare = a[start] * a[start];
            int rightSquare = a[end] * a[end];
            if(leftSquare > rightSquare){
                ans[endIndex] = leftSquare;
                start++;
            }
            else{
                ans[endIndex] = rightSquare;
                end--;
            }
            endIndex--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] inputArray = {-4,-2,-1,0,3,5};
        int[] resultArray = returnSquare(inputArray);
        for(int i = 0 ; i < resultArray.length ; i++){
            System.out.print(resultArray[i] + " ");
        }
    }
}
