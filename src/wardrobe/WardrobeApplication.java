package wardrobe;

public class WardrobeApplication {

    public static void main(String[] args) {

        Person marj = new Person("Marj");
        Person Ahmad = new Person("Marj");
        Person john = new Person("John");
        Cloth jeans = new Cloth("Jeans");
        Cloth underwear = new Cloth("Underwear");
        Cloth hat = new Cloth("hat");

        marj.wear(hat);
        john.wear(hat);
        marj.sayWhatIWear();
        marj.sayWhatIWear();
        john.sayWhatIWear();



    }


}
