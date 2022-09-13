import java.util.Scanner;

// Largest Of 3 Numbers 

public class LargestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("Enter third number : ");
        int c = sc.nextInt();

        // 1st way

        if(a>b && a>c){
            System.out.println("a is Largest Number");
        }if (b>a && b>c) {
            System.out.println("b is Largest Number ");
        } else {
            System.out.println("c is Largest Number");
        }

        //2nd way

        
    }
}
