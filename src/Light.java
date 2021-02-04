public class Light {


    int weight;
    String color;
    int length;
    String shape;
    int radius;


    public Light(int weight, String color, int length, String shape, int radius){
        this.weight = weight;
        this.color = color;
        this.length = length;
        this.shape = shape;
        this.radius = radius;
        System.out.println("You are inside Light Factory");
    }

    public static void main(String args[]){
        System.out.println("This is my first java application");

        Light myTableLight = new Light(100, "Black", 7, "round", 2);
        Light myLivingRoomLight = new Light(70,"White",4, "oval", 1);

        myTableLight.turnOnLights("MyTableLight");
        myLivingRoomLight.turnOnLights("MyLivingRoomLight");
    }
    public void turnOnLights(String lightName){

        System.out.println("Light turned on " + lightName );
    }
}

