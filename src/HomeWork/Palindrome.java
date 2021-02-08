package HomeWork;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here: ");
        String a = sc.next();
        String org = a;
        String rev = "";

        int len = a.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);

        }
        System.out.println(rev);

        if (org.equals(rev)){
            System.out.println(org+ " is a palindrome string");

        }
        else{
            System.out.println(org+ " not a palindrome");
        }



    }

}
