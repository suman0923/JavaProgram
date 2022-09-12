public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCD";
        String rev = "";

        // 1st way-- using + (string concatination) operator

        /*int len = str.length();                     //length of String

        for(int i = len-1; i>=0; i--){
            rev = rev+str.charAt(i);                //index start from 0
        }*/

        // 1st way-- using charactor Array

        char a[] = str.toCharArray();
        int len = a.length;

        for(int i=len-1; i>=0; i--){
            rev = rev + a[i];
        }
        System.out.println("Reversed Number is : " +rev);
    }
}
