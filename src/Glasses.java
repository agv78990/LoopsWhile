public class Glasses {
    String brand;
    String color;

    public Glasses(String brand, String color){
        this.brand=brand;
        this.color=color;
    }

    public static void main(String[] args) {
        Glasses shades= new Glasses("chanel","blue");
        shades.niceShade("max",300);
        shades.coolColor("black", "RayBan");
    }

    public void niceShade(String comfort, int price){
        System.out.println("These glasses provide comfort level  "+ comfort+ " with price "+ price );
    }

    public void coolColor(String color, String brand){
        System.out.println(brand+"  has a variety of colors but  "+ color+"  is my fav.");

    }


}
