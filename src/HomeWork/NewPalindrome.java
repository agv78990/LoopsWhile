package HomeWork;

public class NewPalindrome {
    public static void main(String[] args) {
        String str="cat";
        String r="";
        int w=str.length();
        for(int e= w-1; e>=0; e--){
            r=r+str.charAt(e);
        }
        if (str.equals(r)){
            System.out.println(str+ "is a palindrome");

        }
        else {
            System.out.println(str+ " not a palindrome string");
        }
    }
}
