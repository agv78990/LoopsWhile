package WhileAndFor;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class WhileLoop {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 9) {
            System.out.println("keep on knocking the door " + a + " time");
            a++;

        }
        System.out.println("stop now.");

        alarm(1);
    }

    public static int alarm(int x) {
        while (x <= 9) {
            System.out.println("you can sleep. its still " + x);
            x++;

        }
        System.out.println("wake up its now " + x);
        return x;


    }
}
