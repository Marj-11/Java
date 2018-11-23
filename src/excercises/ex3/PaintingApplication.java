package excercises.ex3;

public class PaintingApplication {
    public static void main(String[] args) {



        Derek derek = new Derek();
        Tool tool = new Tool("Screwdriver");
        System.out.println("Hi Dereke, can you hang the painting for me please?!");
        derek.hangPainting();


        Tool tool1 = new Tool("Hammer");
        System.out.println("Here you go! the Hammer!");
        derek.setTool(tool1);
        derek.hangPainting();


    }
}
