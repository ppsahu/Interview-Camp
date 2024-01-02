// Phone Number Mnemonics: Given an N digit phone number, 
// print all the strings that canbe made from that phone number. 
// Since 1 and 0 don't correspond to any characters, ignorethem.
// For example:213 => AD, AE, AF, BD, BE, BF, CE, CE, CF
// 456 => GJM, GJN, GJO, GKM, GKN, GKO,.. etc.

// time - O(4^n)
// space - O(n)

public class phono_no_mnemonics_21{
    public static void printCombos(int[]a){
        if(a == null || a.length == 0){
            return;
        }
        char[] buffer = new char[a.length];
        printCombosHelper(a, buffer, 0, 0);
    } 
    public static void printCombosHelper(int[] a, char[] buffer, int aIndex, int bufferIndex){
        if(bufferIndex >= buffer.length || aIndex >= a.length){
            printArray(buffer, bufferIndex);
            return;
        }
        char[] letters = getLetters(a[aIndex]);
        if(letters.length == 0){
            printCombosHelper(a, buffer, aIndex + 1, bufferIndex + 1);
        }
        for(char letter : letters){
            buffer[bufferIndex] = letter;
            printCombosHelper(a, buffer, aIndex + 1, bufferIndex + 1);
        }
    }
    public static char[] getLetters(int x){
        switch (x) {
            case 0:
                return new char[]{};
            case 1:
                return new char[]{};
            case 2:
                return new char[]{'a', 'b', 'c'};
            case 3:
                return new char[]{'d', 'e', 'f'};
            case 4:
                return new char[]{'g', 'h', 'i'};
            case 5:
                return new char[]{'j', 'k', 'l'};
            case 6:
                return new char[]{'m', 'n', 'o'};
            case 7:
                return new char[]{'p', 'q', 'r', 's'};
            case 8:
                return new char[]{'t', 'u', 'v'};
            case 9:
                return new char[]{'w', 'x', 'y', 'z'};
        }
        throw new IllegalArgumentException("Invalid Digit " + x);
    }
    public static void printArray(char[] buffer, int bufferIndex){
        for(int i = 0 ; i < bufferIndex ; i++){
            System.out.print(buffer[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] inputArray = {4,5,6};
        printCombos(inputArray);
    }
}