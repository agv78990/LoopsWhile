public class Toys {
    String type;
    String name;
    String age;

    public Toys(String type, String name, String age){
        this.type=type;
        this.name=name;
        this.age=age;

        System.out.println( " my collection of toys");

    }

    public static void main(String args[]){
        Toys vtech= new Toys("bikes","yoyo"," 18 months");
        Toys fisherPrice= new Toys("activity table", "funTime"," 2 years");
        vtech.toddler("great","very much", "absolutely no", "yoyo");
        System.out.println("This is funn. i might love java");
        fisherPrice.toddler("less","not much", "yes","mobile");
    }

    public void toddler(String activity, String busy, String mess, String name){
        System.out.println("This toys "+ name + "  has  activity  "+ activity+",   keeps them busy "+ busy+"  with mess "+ mess+".");
    }
}
