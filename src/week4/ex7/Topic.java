package week4.ex7;

public class Topic {
    private String text;

    public Topic(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "text='" + text;
    }
}
