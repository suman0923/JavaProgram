public class FabonacciSeries {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        System.out.print(n1+ " " +n2); //print 0  1
        for(int i = 2; i<10; i++)      //i=2<10 true
        {
            sum = n1 + n2;             //sum = 0+1 =1
            System.out.print(" " +sum);   //print 0  1   1
            n1 = n2;                      //n1 = 1(n2)
            n2 = sum;                     //n2 = 1(sum)
        }
    }
}
