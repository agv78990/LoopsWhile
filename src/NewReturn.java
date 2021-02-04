public class NewReturn {
    public static void main(String[] args) {
       add(2,3);
       minus(32342,543545463);
       div(6986,686786875);
    }
    public static int add(int a, int b){
        int c =a+b;
        System.out.println("sum: "+ c);
        return c;
    }
    public static int minus(int a,int b){
        int d=a-b;
        System.out.println("minus:"+ d);
        return d;
    }

    public static int div(int a, int b){
        int c=a%b;
        System.out.println("this is division: "+ c);
        return c;
    }






}
