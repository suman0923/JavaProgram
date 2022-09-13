//Sum of digits in a number

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while(num >0){                //checking value num is greater then to 0
            sum = sum + num%10;       // sum = 0 + 4   (num%10 meas 4(last digit))
            num = num/10;             // num = 1234/10 (last num eliminated)
                                      //so num is 123 then go condition checking
        }
        System.out.println("Sum of digits in a number : " +sum);
    }
}
