public class Flight {
    String company;
    String destination;
    String zone;
    int price;

    public Flight( String company, String destination, String zone, int price){
        this.company=company;
        this.destination=destination;
        this.zone=zone;
        this.price=price;
        System.out.println("all about my travel");
    }
    public static void main(String[]args){
    Flight boeing377= new Flight("emirates","india", "business",5000);
    boeing377.easyJourney("emirates","dubai", 4);

    }

    public void easyJourney(String company, String arrival, int rating){
        System.out.println("Flying in  "+ company+ " was fun. " + arrival +"  was a great place to be.");
    }




}
