package Methods;

public class ReverseNegativeNumber {
    public static void main(String args[]) {
        int input = 5678;
        int output = reverseNegativeNumber(5678);
        System.out.println("Input : " + input + " Output : " + output);
    }

    /*
     * Java method to reverse an integer value. there are couple of
     * corner cases
     * which this method doesn't handle e.g. integer overflow.
     */
    public static int reverseNegativeNumber(int number) {
        boolean isNegative = number < 0 ? true : false;
        if(isNegative){
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;

        while (number >= 1) {
            lastDigit = number % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // get rid of last digit
        }

        return isNegative == true? reverse*-1 : reverse;
    }

}



