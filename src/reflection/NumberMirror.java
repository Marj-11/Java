package reflection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberMirror {

    public Integer mirror (Integer number) {

        public Integer mirror(Integer number) {
            List<String> numbers = separate(number);
            Collections.reverse(numbers);
            String reversed = String.join("", numbers);
            return Integer.valueOf(reversed);
        }

        private List<String> separate(Integer number) {
            String string = number.toString();
            String[] split = string.split("");
            List<String> immutableNumbers = Arrays.asList(split);
            List<String> mutableNumbers = new ArrayList<>(immutableNumbers);
            return mutableNumbers;
        }
    }

}
