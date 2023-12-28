import java.util.HashMap;

public class prefixSumtoX {
    public static int[] findSumX(int[] a, int target){
        if(a == null || a.length == 0){
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = a[0];
        map.put(sum, 0);
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int ind = 1;
        while(ind < a.length){
            sum = sum + a[ind];
            if(sum == target){
                ans[0] = 0;
                ans[1] = ind;
                break;
            }
            if(map.containsKey(sum - target)){
                ans[0] = map.get(sum - target) + 1;
                ans[1] = ind;
                break;
            }
            map.put(sum, ind);
            ind++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] inputArray = {2,4,-2,1,-3,5,-3};
        int[] resultArray = findSumX(inputArray, 35);
        if(resultArray == null){
            System.out.print("Empty input array");
        }
        else{
            for(int i = 0 ; i < resultArray.length ; i++){
                if(resultArray[i] == -1){
                    System.out.print("Subarray not available");
                    break;
                }
                System.out.print(resultArray[i] + " ");
            }
        }
    }
}
