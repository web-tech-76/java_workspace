package basics.streams.lambda.collectors;

import java.util.List;

import static java.util.stream.Collectors.*;

public class CollectorMappingExample1 {

    public static void main(String[] args) {

        List<String> strList = List.of("AAA", "bb", "123", "abc456");

        List<Integer> list1 = strList
                .stream()
                .collect(mapping(
                        value -> value.length(),
                        toList()
                ));

        System.out.println(list1);

        List<String> list2 = strList.stream()
                .collect(mapping(
                        val -> val,
                        filtering(v -> v.length() > 2,
                                toList())

                ));

        System.out.println(list2);


    }

}
