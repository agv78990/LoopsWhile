package WhileAndFor;

public class DoWhile {

    public static void main(String[] args) {
        doo(20);
        odd(1);
        checking(1);

    }

       public static int doo(int i){
        do{
            System.out.println("it will run without reading the condition "+i);
            i++;
        }
        while(i<=10);
        return i;

    }

    public static int odd(int a){
        do {
            System.out.println("these are odd numbers "+ a);
            a+=2;
        } while(a<=10);
        return a;
    }


    public static int checking(int a) {
        while (a <= 10) {
            System.out.println("odd numbers " + a);
            a += 2;

        }
        return a;
    }




}
