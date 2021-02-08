package WhileAndFor;

public class DemoForeach {
    public static void main(String[] args) {
        int a[]= new int[6];
        a[0]=12;
        a[1]=423;
        a[2]=2423;
        a[3]=65;
        a[4]=765;

        for (int i:a){
            System.out.println("value "+ i);
        }

        String cars[]= new String[5];
        cars[0]="bmw";
        cars[1]="Audi";
        cars[2]="lexus";

        for( String i:cars){
            System.out.println("these are cars " + i);

        }


        String names[]={" huma", " ferhan", " monir", "sadika"};

        for(String i: names){
            System.out.println("names of students "+ i);

        }
        System.out.println(names.length);


    }





}
