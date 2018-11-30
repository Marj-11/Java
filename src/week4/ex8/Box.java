package week4.ex8;

public class Box {

    private String content;

    public Box(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "content=" + content;
    }
}
