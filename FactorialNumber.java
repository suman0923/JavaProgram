public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        long factorial = 1;
        for(int i=1; i<=num; i++){
            factorial = factorial * i;        //1*2*3*4*5
        }
        System.out.println("Factorial of Number : " +factorial);
    }
}
