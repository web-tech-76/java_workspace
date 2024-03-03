package basics.classes;

import static java.lang.StringTemplate.RAW;

public class SimpleClass {

    int index = 0;

    // order is initializing block , constructor and main method...

    {
        index = 100;
        System.out.println(STR."initializing block for instance \{index}");
    }

    public SimpleClass() {
        this.index = 200;
    }


    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();
        StringTemplate str1 = RAW."main method index value -> \{simpleClass.index}";
        System.out.println(STR.process(str1));
    }

}
