package week5.ex6;

public class IkeaApplication {
    public static void main(String[] args) {

        WardobeBuilder wardobeBuilder = new WardobeBuilder();
        Wardrobe wardrobe = wardobeBuilder.build();

        System.out.println(wardrobe);


    }
}
