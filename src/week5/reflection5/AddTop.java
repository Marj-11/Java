package week5.reflection5;

import week5.ex6.Furniture;
import week5.ex6.Step;

public class AddTop implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("Top");
    }
}
