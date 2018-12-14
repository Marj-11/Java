package week6.ex2;

public class ConeIceCream extends IceCream{

    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public void eat() {
        System.out.println("The " + getFlavor() + " with " + getTopping() + " is licked");
    }


}


