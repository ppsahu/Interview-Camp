// Coin Change Problem: 
// Given a set of coin denominations, print out the different ways 
// you can make a target amount. You can use as many coins of each denomination as you like.
// For example: If coins are [1,2,5] and the target is 5, 
// output will be:[1,1,1,1,1] [1,1,1,2] [1,2,2] [5]

// time - O(n!)
// space - O(target) ~ O(n)

import java.util.ArrayList;

public class coinChange_24 {
    public static void coinExc(int[] coins, int target){
        if(coins == null || coins.length == 0 || target <= 0){
            return;
        }
        pritCombosHelper(coins, target, new ArrayList<Integer>(), 0, 0);
    }
    public static void pritCombosHelper(int[] coins, int target, ArrayList<Integer> buffer, int startIndex, int sum){
        if(sum > target){
            return;
        }
        if(sum == target){
            printArray(buffer);
            return;
        }
        for(int i = startIndex ; i < coins.length ; i++){
            buffer.add(coins[i]);
            pritCombosHelper(coins, target, buffer, i, sum + coins[i]);
            buffer.remove(buffer.get(buffer.size() - 1));
        }
    }
    public static void printArray(ArrayList<Integer> buffer){
        for(int i = 0 ; i < buffer.size() ; i++){
            System.out.print(buffer.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] coins = {1,2,5};
        int target = 5;
        coinExc(coins, target);
    }
}
