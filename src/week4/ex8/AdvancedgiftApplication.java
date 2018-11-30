package week4.ex8;

import java.util.Optional;

public class AdvancedgiftApplication {

    public static void main(String[] args) {

        Optional<Box> giftBox = Optional.empty();
        System.out.println("Gift: " + giftBox);

        Box box = new Box("Robotoy");
        System.out.println("Gift: " + Optional.of(box));

        Boolean isTherePresent = box.equals(box);
        if(isTherePresent){
            System.out.println("There is a present in the gift box");
        }

        System.out.println("The gift is a " + box);
    }
}
