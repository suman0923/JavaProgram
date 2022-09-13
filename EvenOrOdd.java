//Even or odd in a number

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 1234;
        int even_num = 0;
        int odd_num = 0;

        while(num >0){
            int rem = num % 10;       //last number is reminder
        if(num%2 == 0){               //completly divided by 2
            even_num++;               //increase the even number
        }else                         //or
        {
            odd_num++;                //increase the odd number
        }
        num = num/10;                 //last number will eleminated
        }
        System.out.println("Even Number of : " +even_num);
        System.out.println("Odd Number of  :  " + odd_num);
    }
}
