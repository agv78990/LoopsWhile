public class While {

    public static void main(String[] args) {
        int attempt = 1;
        while (attempt <= 6) {
            System.out.println("keep trying, trial no " + attempt);
            attempt++;
        }
        System.out.println("lock phone. attempt acceded");

        dial(13);

    }


    public static int dial(int a) {

        while (a <= 20) {
            System.out.println("this is a serial no " + a);
            a++;
        }
        return a;
    }
}
