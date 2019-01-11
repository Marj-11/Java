package week8.RobomimeEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RobomimReader {
    private Sensor sensor = new Sensor();

    public void decrypt() {
        FileReader fileReader = new FileReader();
        List<String> asLines = fileReader.asLines("week8/RobomimeEx/robomime.txt");
        List<String> tricks = new ArrayList<>();
        for (String asLine : asLines) {
            Optional<String> trick = sensor.getDecryptedTrick(asLine);

            if (trick.isPresent()) {
                tricks.add(trick.get());
            }
        }
        display(tricks);
    }
    private static void display(List<String> tricks) {
        for (String trick : tricks) {
            System.out.println(trick);
        }
    }
}