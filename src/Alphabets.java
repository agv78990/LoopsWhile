public class Alphabets {
    String type;
    int letters;
    String method;


    public Alphabets(String type, int letters, String method){
        this.type=type;
        this.letters=letters;
        this.method=method;
    }
    public static void main(String[]args){
        Alphabets cursive=new Alphabets("mixed",26,"cursive");
        Alphabets hindi=new Alphabets("one",30,"running");


        System.out.println("My work in english language");

        cursive.letters("formal","short", "only purpose");
        cursive.poems("narrative","huma");
        System.out.println("       ");
        System.out.println("my work in english language");

        hindi.letters("essay","long", "detailed");
        hindi.poems("rhymed","asif");

    }

    public void letters(String format, String lenght, String description){
        System.out.println("i wrote letter in  "+ format+ " style and whose lenght was "+ lenght+ " and had  "+ description+ " description");
    }


    public void poems(String type, String author) {
        System.out.println("I love poems which are  " + type + "  written by " + author);
    }
}

