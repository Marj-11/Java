package excercises.ex2;

public class DoorApplication {

    public static void main(String[] args) {
        Door door = new Door(11);
        Key key = new Key();

        key.open(door);
    }



}
