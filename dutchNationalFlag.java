// You're given a list of Marbles. 
// Each marble can have one of 3 colors (Red, White or Blue).
// Arrange the marbles in order of the colors (Red -> White -> Blue).
// Colors are represented as follows:0 - Red1 - White2 - Blue

public class dutchNationalFlag {
    public static int[] dutchFlag(int[] a){
        if(a.length <= 1){
            return a;
        }
        int startBound = 0;
        int endBound = a.length - 1;
        int i = 0;
        while(i <= endBound){
            if(a[i] == 0){
                int temp =  a[i];
                a[i] = a[startBound];
                a[startBound] = temp;
                startBound++;
                i++;
            }
            else if(a[i] == 2){
                int temp = a[i];
                a[i] = a[endBound];
                a[endBound] = temp;
                endBound--;
            }
            else if(a[i] == 1){
                i++;
            }
            else{
                System.out.println("Unknown color - cannot form dutch national flag");
                break;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] inputArray = {0,1,2,0,1,2,0,2,1};
        int[] resultArray = dutchFlag(inputArray);
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
