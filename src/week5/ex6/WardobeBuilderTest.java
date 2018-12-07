package week5.ex6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WardobeBuilderTest {

   // In order to create a meaningful test, create a list of string manually with exactly the right parts in the right order.
   // Then you can test that both lists have the same size and that they are exactly the same.

    List<String> testParts = Arrays.asList("Side", "Side", "bottom", "top", "back", "shelf",
            "shelf", "shelf", "shelf","shelf", "shelf", "shelf", "shelf", "door", "door");

    WardobeBuilder wardobeBuilder = new WardobeBuilder();

    @Test
    void buildTestSize() {
        Wardrobe wardrobe = wardobeBuilder.build();
        Assertions.assertEquals(testParts.size(), wardrobe.getParts().size(), "Size of the list is different");
    }

    @Test
    void buildTestParts() {
        Wardrobe wardrobe = wardobeBuilder.build();
        Assertions.assertEquals(testParts, wardrobe.getParts(), "Contents of the list are different");
    }



}