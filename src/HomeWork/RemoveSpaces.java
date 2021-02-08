package HomeWork;

public class RemoveSpaces {
    public static void main(String[] args) {
        String a="Lets try to     remove    spaces";
        System.out.println("with space:"+ a);
        a=a.replaceAll("\\s","");
        System.out.println("without spaces : "+ a);



        String b=" hey    there";
        System.out.println("with : "+ b);
        String c=b.replaceAll("\\s","");
        System.out.println("without: "+ c);



        String x=" ok , it seems   im good";
        System.out.println(x);
        x=x.replaceAll("\\s","");
        System.out.println("good: "+ x);



    }




}
