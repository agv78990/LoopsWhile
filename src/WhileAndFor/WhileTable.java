package WhileAndFor;

public class WhileTable {

    public static void main(String[] args) {
        System.out.println("This is multiplication table of 2");
        table(1, 2);
        System.out.println("This is table of 6");
        System.out.println("    ");
        table(1, 6);
        System.out.println("table of 7");
        table(1, 7);
        System.out.println("table of 11");
        table(1, 11);
        newtable(1, 566);
        System.out.println("i dont know");

    }

    public static int table(int i, int tableof) {

        while (i <= 10) {
            int z = i * tableof;
            System.out.println(tableof + "*" + i + "=" + z);
            i++;
        }
        return tableof;
    }

    public static int newtable(int a, int num) {
        while (a <= 10) ;
        {
            int z = a * num;

            System.out.println("this is new " + z);
            a++;
            return num;
        }
    }
}


