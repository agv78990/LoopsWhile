package WhileAndFor;

public class NewArray {

    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int sum=0;
          int into =1;
        for (int i:a){
            System.out.println("new notation "+ i);
            sum=sum+i;

            into=sum*i;
            System.out.println("sum "+ sum+ " into "+ into);
            System.out.println(a.length);
        }

    }


}
