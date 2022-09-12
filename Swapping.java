
public class Swapping {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("Before swapping values are : " +a+ " " +b);
        
        //1st way- using third variable
        /*t = a;
        a = b;
        b = t;*/


        //2nd way- using - and + operator and without using third variable
        // here a & b values should not be zero
        /*a = a+b;    //10 + 20 = 30(a) 
        b = a-b;    //30 - 20 = 10(b)
        a = a-b;    //30 - 10 = 20(a)
        //Now a= 20 and b = 10*/


        // 3rd way - using * and / operator
        // here a & b values should not be zero
        /*a = a* b;
        b = a/ b;
        a = a/b;*/



        // 3rd way - using xor operator(^)
        // here a & b values should not be zero
        /*a = a ^ b;
        b = a ^ b;
        a = a ^ b;*/


        // 4rt way - single statement
        b = a + b -(a = b);  //right to left execution
        /* b= 20 & a = b so a = 20 
           then a + b = 10 + 20 =30
           then  30 - (20) =10 so b =10 & a = 20
        */
        System.out.println("After swapping values are : " +a+ " " +b);
    }
}
