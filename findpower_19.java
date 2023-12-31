// Implement a function to calculate X^N. Both X and N can be positiveor negative. 
// You can assume that overflow doesn't happen.

// time - O(log n)
// space - O(1)

public class findpower_19{
    public static float power(int x, int n){
        if (x == 0 && n <= 0) {        
            throw new ArithmeticException("undefined");    
        }
        float result = posPower(Math.abs(x), Math.abs(n));
        if(n < 0){
            result = 1 / result;
        }
        if(x < 0 && n % 2 != 0){
            result = -1 * result;
        }
        return result;
    }
    public static int posPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int halfPower = posPower(x, n/2);
        if(n % 2 == 0){
            return halfPower * halfPower;
        }
        else{
            return x * halfPower * halfPower;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int power = 0;
        float result = power(x, power);
        System.out.print(result); 
    }
}