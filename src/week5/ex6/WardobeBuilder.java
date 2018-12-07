package week5.ex6;

import java.util.Arrays;
import java.util.List;

public class WardobeBuilder {

    public List<Step> steps = Arrays.asList(new AddSide(), new AddSide(), new AddBottom(), new AddTop(), new AddBack(),
            new AddShelf(), new AddShelf(), new AddShelf(), new AddShelf(), new AddShelf(), new AddShelf()
            , new AddShelf(), new AddShelf(), new AddDoor(), new AddDoor());

    public Wardrobe build(){
        Wardrobe wardrobe = new Wardrobe();
        for (Step step : steps) {
           step.perform(wardrobe);

        }
        return wardrobe;
    }
}
