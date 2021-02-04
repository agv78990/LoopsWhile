public class Movies {
    public static void main(String[] args) {
        magical("narnia","huma", 2008);
        magical("enchanted", "unknown", 2006);
        action("dabbang", "tere mast do nain", "salmanKhan");


    }

    public static void magical(String name, String actor, int date){
        System.out.println("i love this movie "+ name+"  it has my childhood memories from "+ date);

    }
     public static void action(String name, String song, String actor){

         System.out.println("this is a movie "+ name);

     }

}
