package javaTraits.ex4;

public class hackerApplication {

    public static void main(String[] args) {

      String string = new String("Hello Marj");

      Messenger messenger = new Messenger("string","string");

      messenger.send(string);
      messenger.recieve(string);
    }

}
