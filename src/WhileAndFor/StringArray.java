package WhileAndFor;

public class StringArray {
    public static void main(String[] args) {
        String car[]= new String[3];
        car[0]="BMW";
        car[1]="Audi";
        car[2]="Lexus";

        System.out.println(car.length);



        for( String i:car){
            System.out.println("my car "+ i);
        }




    }

}
