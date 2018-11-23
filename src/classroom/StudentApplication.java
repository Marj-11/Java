package classroom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;




public class StudentApplication {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sahar");
        names.add("Ahmad");
        names.add("Marj");


        Collections.shuffle(names);

        System.out.println(names);
    }

}
