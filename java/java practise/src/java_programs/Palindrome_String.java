package java_programs;

public class Palindrome_String {
    public static void main(String[] args) {
        String  str="radar", reversestr="";
        int strlength = str.length();
        for (int i = (strlength-1); i>=0; --i) {
            reversestr = reversestr + str.charAt(i);


        }if (str.toLowerCase().equals(reversestr.toLowerCase())){
            System.out.println(str+"is a palindrome");
        }else {
            System.out.println(str+"is not a palindome");
        }

    }
}
