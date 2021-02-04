public class Tv {
    String brand;
    String size;
    String color;

    public Tv( String brand, String size, String color){
        this.brand=brand;
        this.size=size;
        this.color=color;
    }

    public static void main(String args[]){
        Tv LG= new Tv("LG", "60inch", "silver" );
        LG.watchMovies("life of pie", 120, 8);

    }
    public void  watchMovies(String movieName, int duration, int ratings){
    System.out.println( movieName + " this is a must watch");
}
}
