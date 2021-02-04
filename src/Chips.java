public class Chips {
    String flavor;
    String packing;

    public Chips(String flavor, String packing){
        this.flavor=flavor;
        this.packing=packing;
    }
    public static void main(String args[]){
        Chips lays= new Chips("onion", "bag");
        Chips pringles= new Chips("cheese", "cardboard");
        lays.crunchy("lays","awesome","yes","onion");
        pringles.crunchy("pringles","good", "yes", "cheese");

    }
    public void crunchy(String name, String liking, String halal, String flavor){
        System.out.println(name+ "   is  "+ liking+ "  is also "+ halal+ " with " +flavor);
    }
}
