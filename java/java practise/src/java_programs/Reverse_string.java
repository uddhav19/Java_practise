package java_programs;

public class Reverse_string {

     void reverseString(String str){

     }
    public static void main(String[] args) {


        String str = "uddhav";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);
    }
}
