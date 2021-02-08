package WhileAndFor;

public class ArrayDemo {


    public static void main(String[] args) {
        int a[]= new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        System.out.println("print from index "+ a[0]);


        for( int i=1; i<=4; i++){
            System.out.println("this is for loop "+ a[i]
            );
        }



    }


}
