package week4.ex7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {
    public static void main(String[] args) {

        Map<Integer, List<Topic>> index = new HashMap<>();
        System.out.println(index);

        Integer chapterOne = 1;
        Integer chapterTwo = 2;

        Topic chapterOneTitle = new Topic("connecting");
        Topic chapterTwoTitle = new Topic("positive things");
        Topic chapterThreeTitle = new Topic("ecologic economy");

        List<Topic> topics1 = new ArrayList<>();
        topics1.add(chapterOneTitle);

        List<Topic> topics2 = new ArrayList<>();
        topics2.add(chapterTwoTitle);
        topics2.add(chapterThreeTitle);

        index.put(chapterOne, topics1);
        index.put(chapterTwo, topics2);
        System.out.println(index);

        System.out.println("Index keys: " + index.keySet());
        System.out.println("Index value: " + index.values());
        System.out.println("Index entry sets: "+ index.entrySet());
        System.out.println("Index: " + index);

        Boolean isPageNumberExist = index.containsKey(1);
        if(isPageNumberExist){
            System.out.println("The page number 1 exists as key");
        }
        System.out.println("The topics in page number 2 are " + topics2);
        System.out.println("Index size: " + index.size());

    }
}
