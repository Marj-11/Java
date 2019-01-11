package week8.RobomimeEx;

public class HashtagDecryptor implements Decryptor {
    @Override
    public String decriptor(String line) {
        line = line.replace("#", "");
        line = line.replace("robomime", "");
        return line;
    }
    @Override
    public Boolean isThere(String line) {
        return line.contains("#");
    }
}