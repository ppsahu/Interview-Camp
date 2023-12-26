public class reverseTraversal{
    public static int[] cloneEvenInteger(int[] a){
        int end = a.length;
        int i = findLastNumber(a);
        while(i >= 0){
            if(a[i] % 2 == 0){
                a[--end] = a[i];
            }
            a[--end] = a[i];
            i--;
        }
        return a;
    }
    public static int findLastNumber(int[] a){
        int i = a.length - 1;
        while(i >= 0 && a[i] == -1){
            i--;
        }
        return i;
    }
    public static void main(String[] args) {
        int[] inputArray = {2, 4, 1, 0, 3, -1, -1, -1};
        int[] resultArray = cloneEvenInteger(inputArray);
        for(int i = 0 ; i < resultArray.length ; i++){
            System.out.print(resultArray[i] + " ");
        }
    }
}

