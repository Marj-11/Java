package javaTraits.ex1;


public class ScreenApplication {

    public static void main(String[] args) {

        Customer customer = new Customer("Marj", "Business");
        Screen screen = new Screen();

        screen.display(customer);

    }
}
