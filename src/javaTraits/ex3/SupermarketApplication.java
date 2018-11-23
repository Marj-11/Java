package javaTraits.ex3;

public class SupermarketApplication {

    public static void main(String[] args) {

        Double number = new Double(2.33);

        NumberCorrector corrector = new NumberCorrector();

        System.out.println(corrector.correct(number));

    }
}
