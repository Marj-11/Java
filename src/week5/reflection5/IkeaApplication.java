package week5.reflection5;

public class IkeaApplication {
    public static void main(String[] args) {

        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable tvTable = tvTableBuilder.build();

        System.out.println("TvTable: " + tvTable);

    }
}
