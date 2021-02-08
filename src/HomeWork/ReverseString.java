package HomeWork;

public class ReverseString {


    public static void main(String[] args) {
        String a = "huma";
        String rev = "";

        int len = a.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }
        System.out.println("reversed : " + rev);


        String z = "great";
        String n = "";

        int l = z.length();
        for (int i=l-1; i>=0; i--) {

          n=n+ z.charAt(i);
        }
        System.out.println("reversed :"+ n);


        String s="hey";
        String w="";
        int le=s.length();
        for(int v=le-1; v>=0; v--){
            w=w+s.charAt(v);
        }
        System.out.println("reversed: "+ w);
    }
}
