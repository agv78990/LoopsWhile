package WhileAndFor;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Prac {
    public static void main(String[] args) {
        System.out.println("this is not nice");
        mutiple(1,4);
        System.out.println("ok im good now");

    }
     public static int mutiple(int a, int num){
        while(a<=10){
            int z=a*num;
            System.out.println("Multiple of 4* "+ a+ "=" + z);
            a++;

        }
         return num;
     }



}
