package week5.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wardrobe implements Furniture {

    List<String> parts = new ArrayList<>();


    @Override
    public void add(String part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        return "" + parts;
    }

    //    For this you will need the getParts method in the Wardrobe class.
    public List<String> getParts() {
        return parts;
    }
}
