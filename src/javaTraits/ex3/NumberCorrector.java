package javaTraits.ex3;



public class NumberCorrector {

    public Integer correct(Double number) {

        number = Math.abs(number);
        number = Math.floor(number);

        return number.intValue();



    }
}
