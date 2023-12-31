import java.util.HashMap;

public class fibonacciUsingMap_18 {
    public static int fibonacci(int a, HashMap<Integer, Integer> map){
        if(a == 1 || a == 2){
            return 1;
        }
        if(map.containsKey(a)){
            return map.get(a);
        }
        int result = fibonacci(a - 1, map) + fibonacci(a - 2, map);
        map.put(a, result);
        return result;
    }
    public static void main(String[] args) {
        int input = 6;
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = fibonacci(input, map);
        System.out.print(input + "th element of the fibonacci series is " + result); 
    }
}
