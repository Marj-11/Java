package week4.ex5;

public class Grocery {

    private String name;


    public Grocery(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name=" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grocery grocery = (Grocery) o;

        return name.equals(grocery.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
