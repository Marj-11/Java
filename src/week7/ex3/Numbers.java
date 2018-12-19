package week7.ex3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {

    public List<Integer> list = Arrays.asList(1,5,4,6,3,2,7,9,8,11,10,13,12);

    public  List<Integer> list2(){
        Collections.sort(list);
        return list;
    }







}
