public class Car {
    String brand;
    String model;
    int make;

    public Car(String brand, String model, int make){
        this.brand= brand;
        this.model= model;
        this.make= make;
    }
    public static void main(String args[]){
        Car camry = new Car ("toyota", "camry",2012);

        camry.driveFast("camry", "xe",2012);

    }
    public void driveFast(String carName, String model, int make){
        System.out.println("this is my first car " + carName + " bought in " + make);
    }



}
