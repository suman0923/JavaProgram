public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 13;
        int count = 0;

        if(num>1)                           //13 is greater then 1  =true
        {
            for(int i=1; i<=num; i++)        //i=1, i<=13 true so
            {
                if(num%i == 0){              //13%i == 0 if true so
                    count++;                   //count value increase ,1
                }
            }
            if(count == 2){                  //if count value 2, condition true
                System.out.println("Number is Prime.");
            }else{
                System.out.println("Number is Not Prime.");
            }
            
        }
        System.out.println("Number is Not Prime.");
    }
}
