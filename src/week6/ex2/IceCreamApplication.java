package week6.ex2;

public class IceCreamApplication {
    public static void main(String[] args) {

        ConeIceCream cone =  new ConeIceCream("Chocolate", "Oreo");
        CupIceCream cup = new CupIceCream("Vanilla", "Cookies");

        cone.eat();
        cup.eat();

    }
}
