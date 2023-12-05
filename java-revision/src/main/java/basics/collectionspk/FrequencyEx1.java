package basics.collectionspk;

import java.util.Collections;
import java.util.List;

public class FrequencyEx1 {


    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 6, 4, 3);
        // number of times the element is repeated in the collection.

        int freq = Collections.frequency(list1, 7);
        System.out.println(freq);

    }
}
