

    public class Phone {
        // iphone, samsung, lg are phones in the market
        // these phones above are the objects of that phone class

        // properties of the phones (state of the phone)
        String brand;
        String model;
        String color;
        int price;

        // constructor --> builder --> same name as class name
        public Phone(String brand, String model, String color, int price){
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.price = price;
            System.out.println("i am in the phone factory");
        }

        public static void main(String[] args) {
            // these are the objects of the phone class
            Phone iphone = new Phone("apple", "12 pro max", "blue", 1100);
            Phone android = new Phone("samsung", "s20", "bronze", 800);

            iphone.sendtext("iphone pro max 12","apple", 200);
           iphone.makecall(236817246, "ferhan");
           android.sendtext("s20", "samsung", 1500);
           android.makecall(698990798,"asif");

            System.out.println(" ");
        }

            public void sendtext(String phonename, String model, int price) {
                System.out.println("this is my phone  " + phonename + "with price " + price);
            }
            public void makecall( int phonenumber, String name){
                System.out.println("call this "+  phonenumber+ " whose name is " + name);

            }



        }


