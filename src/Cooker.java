public class Cooker {
    String shape;
    String size;
    String composition;


    public Cooker(String shape, String size, String composition){
        this.shape=shape;
        this.size=size;
        this.composition=composition;
    }


    public static void main(String args[]){
        Cooker round= new Cooker("round","3L","steel");

        round.cook("khichdi","salt and turmeric", "boring");
        System.out.println("this is to show you asif");

    }

    public void cook(String name,String spices, String liking){
        System.out.println("I made "+ name+ " in my new cooker and added "+ spices+ " to it. it is "+ liking + "  for me. But asif loves it.");
    }
}
