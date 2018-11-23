package excercises.ex1;

public class Article {

    private String text;
    private String title;

    public Article(String text, String title) {
        this.text = text;
        this.title = title;
    }
    public String getText() {
        return text;
    }
    public String getTitle() {
        return title;
    }
}
