package week6.ex1;

public class HotAirBalloonApplication {
    public static void main(String[] args) {

        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        System.out.println("SmallBalloon --");
        smallBalloon.liftUp();
        smallBalloon.land();

        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        System.out.println("BigBalloon --");
        bigBalloon.liftUp();
        bigBalloon.land();

        System.out.println("Small --");
        HotAirBalloon small=smallBalloon;
        small.liftUp();
        small.land();

        System.out.println("Big --");
        HotAirBalloon big=smallBalloon;
        big.liftUp();
        big.land();



    }
}
