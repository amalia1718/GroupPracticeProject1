package Methods;

public class SwapTwoVariablesWithoutTheThirdOne {

    public static void main(String[] args) {


            int x = 10;
            int y = 5;
            x = x + y;//adds the values of x and y assigns the sum to a
            y = x - y;//substract new value of y from the value new value of x
            x = x - y;//substract the new value of y from the new value of y
            System.out.println("After swapping:"
                    + " x = " + x + ", y = " + y);


}

}
