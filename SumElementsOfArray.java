public class SumElementsOfArray {
    public static void main(String[] args) {
        int a[] = {2, 5, 7, 9, 6};
        int sum = 0;

        //first way
        /*for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }*/

        //second way- enhanced for loop(for each loop)
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println("Sum of element in Array : " +sum);
    }
}
