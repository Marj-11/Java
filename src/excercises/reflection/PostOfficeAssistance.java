package excercises.reflection;

public class PostOfficeAssistance {

    public void stamp(Letter letter){
        letter.stamp();
    }

    public void send(Letter letter){
        if (letter.isStamped()){
            System.out.println("I will");

        }
    }

}
