package week6.ex2;

public class CupIceCream extends IceCream{

    public CupIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public void eat() {
        System.out.println("The " + getFlavor() + " ice-cream with " + getTopping() + " is eaten with a spoon");
    }
}
