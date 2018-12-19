package week4.ex6;

public class Item {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name='" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return name != null ? name.equals(item.name) : item.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
