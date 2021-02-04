import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary){
       this.id=id;
       this.name=name;
       this.salary=salary;
    }




    public static void main(String args[]) {
        Employee emp1 = new Employee(1, "Huma", 5000);

        Employee emp2 = new Employee(2, "Ferhan", 9000);

        Employee emp3 = new Employee(3, "Monir", 10000);

        Employee emp4 = new Employee(4, "Sadika", 000);
emp1.makeMoney("Huma",1,5000);
emp2.makeMoney("asif", 3, 2000);


    }
    public void makeMoney(String employeeName, int id, int salary){
        System.out.println(employeeName + " is here to earn  " + salary + "  with id  " + id   );


    }

}










    /*  myTableLight.turnOnLights("MyTableLight");
        myLivingRoomLight.turnOnLights("MyLivingRoomLight");
    }
    public void turnOnLights(String lightName){

        System.out.println("Light turned on " + lightName );
    }
    * */
