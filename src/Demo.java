public class Demo {

    public static void main(String[] args) {
        use(32,535);
divide(34,6);
    into(43435,34534534);

        System.out.println();
    }

     public static int use(int a, int b){
        int sum=a+b;
        System.out.println("this is add  "+ sum);
        return sum;
    }
     public static int divide(int x, int u){
        int div=x%u;
        System.out.println(div);
        return div;
     }

     public static int into(int a,int b){
        int multiply=a*b;
        System.out.println(multiply);

        return multiply;
     }


}
