package week5.ex5;

public class Joker implements Villain {

    private Integer lives = 10;

    @Override
    public void weaken(String name) {
        lives--;
        if(lives == 0){
            System.out.println("You all defeated me! But I will be back!");
        }else {
            System.out.println("Damn you, " + name  + "! You managed to weaken me!");
        }
        }

    }
