package Methods;

public class OddEvenMethod {
    public static void main(String[] args) {
        int number = 6;
        IdNumber(number);

    }

public static void IdNumber(int number){
        if(number%2==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
}
}
