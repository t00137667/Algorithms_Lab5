public class Recursion {
    public static int myPow(int x, int y){
        if (y ==0){
            return 1;
        }
        else {
            //x raised to power of y equals x multiplied by itself y times
            x = x * myPow(x, y-1);
            return x;
        }
    }

    public static String reverse(String str){
        int length = str.length();
        if (length == 0){
            return "";
        }
        else {
            char letter = str.charAt(0);
            //System.out.println(letter);
            String newStr = str.substring(1);
            //System.out.println(newStr);

            String fullStr = reverse(newStr) + letter;
            return fullStr;
        }
    }
}
