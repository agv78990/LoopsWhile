public class Cultures {
    String name;
    String state;

    String language;


    public Cultures (String name, String state,  String language) {
     this.name = name;
        this.state = state;
        this.language = language;
    }


    public static void main(String[] args) {
        System.out.println("India has a varied and diverse culture ");
        Cultures south= new Cultures("kerela", "south","kannad");
        south.region("tamil", "kannad");

        }

        public void region(String state, String name){
            System.out.println("this is a south state  "+ state);

    }

}
