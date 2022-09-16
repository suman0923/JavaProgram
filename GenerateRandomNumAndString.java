import java.util.Random;

public class GenerateRandomNumAndString {
    public static void main(String[] args) {
        Random rand = new Random();                      //class of util package
        
        int rand_int = rand.nextInt(50);          //50 is bound of number 
        
        System.out.println(rand_int);

        // for double
        
        double rand_dbl = rand.nextDouble();
        System.out.println(rand_dbl);
    }
}
