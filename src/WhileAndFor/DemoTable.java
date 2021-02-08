package WhileAndFor;

public class DemoTable {

    public static void main(String[] args) {

        table(1,2);


    }
      public static int table(int a, int tableOf){
          while (a <= 10) {
                int z=a*tableOf;
              System.out.println("table 2*" + a+ "=" + z);
              a++;
          }
          return tableOf;
      }


}
