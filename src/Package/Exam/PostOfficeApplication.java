package Package.Exam;
import java.util.ArrayList;
import java.util.List;

public class PostOfficeApplication {
    public static void main(String[] args) {

        Letter letter = new Letter("Fake address 123");
        PostOfficeAssistant assistant = new PostOfficeAssistant();
        assistant.stamp(letter);
        assistant.send(letter);


        List<Letter> letters = new ArrayList<>();
        letters.add(new Letter("Mengergasse 51"));
        letters.add(new Letter("Mengergasse 52"));
        letters.add(new Letter("Mengergasse 54"));


        Postman postman = new Postman(letters);
        postman.deliver();
    }

}
