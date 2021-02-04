public class Cuisine {
    String type;
    String region;
    String staple;



    public Cuisine(String type, String region, String staple){
        this.type=type;
        this.region=region;
        this.staple=staple;
    }

    public static void main(String[]args){
        Cuisine indian=new Cuisine("hyderabadi","india","mutton");
        Cuisine chinese=new Cuisine("asian","china", "rice");
        System.out.println("All about biryani in india");
        indian.biryani("highly","very high","mughal");

        System.out.println("All about biryani in china");
        chinese.biryani("less","hot","unknown");

    }

    public void biryani(String famous, String spicyLevel, String origin){
        System.out.println("Biryani is "+ famous+ " famous and has a spice level of "+ spicyLevel+ " which originated from "+ origin+ " era");
    }
}
