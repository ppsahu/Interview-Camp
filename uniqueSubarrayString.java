// Given a String, find the longest substring with unique characters.
// For example: "whatwhywhere" --> "atwhy"

// time - O(n)
// space - O(2) ~ O(1)

import java.util.HashMap;

public class uniqueSubarrayString {
    public static int[] findUnique(String str){
        if(str.isEmpty()){
            return null;
        }
        if(str.length() == 1){
            int ans[] = new int[2];
            ans[0] = 0;
            ans[1] = 0;
            return ans;
        }
        int start = 0;
        int end = 0;
        int maxLength = Integer.MIN_VALUE;
        int[] ans = new int[2];
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(str.charAt(0), 0);
        while(end < str.length() - 1){
            end++;
            if(map.containsKey(str.charAt(end)) && map.get(str.charAt(end)) >= start){
                start = map.get(str.charAt(end)) + 1;
            }
            map.put(str.charAt(end), end);
            
            if(end - start + 1 > maxLength){
                maxLength = end - start + 1;
                ans[0] = start;
                ans[1] = end;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String inputString = "whatwhywhere";
        int[] resultArray = findUnique(inputString);
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
