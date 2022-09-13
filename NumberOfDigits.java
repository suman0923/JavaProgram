public class NumberOfDigits {
    public static void main(String[] args) {
        int num = 123456;
        int count = 0;
        while(num > 0){
            num = num/10;         //last number is eleminate
            count++;              //1
                                  //2.....6
        }
        System.out.println("Number of digits is : " +count);
    }
}
