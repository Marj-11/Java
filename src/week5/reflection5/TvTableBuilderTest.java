package week5.reflection5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week5.ex6.WardobeBuilder;
import week5.ex6.Wardrobe;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TvTableBuilderTest {

    List<String> testParts = Arrays.asList("Leg", "Leg", "Leg", "Leg", "Shelf", "Top");

    TvTableBuilder tvTableBuilder = new TvTableBuilder();

    @Test
    void buildTestSize() {
         TvTable tvTable= tvTableBuilder.build();
        Assertions.assertEquals(testParts.size(), tvTable.getParts().size(), "Size of the list is different");
    }

    @Test
    void buildTestParts() {
        TvTable tvTable = tvTableBuilder.build();
        Assertions.assertEquals(testParts, tvTable.getParts(), "Contents of the list are different");
    }
}