public class Bottle {
    String color;
    String brand;
    int price;

    public Bottle( String color, String brand, int price){
        this.color=color;
        this.brand= brand;
        this.price=price;}

        public static void main(String args[]) {
            Bottle water = new Bottle("purple", "contigo", 10);
            water.straw("purple", "elliptic", "contigo");
            System.out.println("its a wine bottle"  );
        }

         public void straw(String color, String shape, String brand){
        System.out.println("I like my bottle which is " + color+ " in color and "+ shape + " in shape");
    }




}
