package basics.array;

import static java.lang.StringTemplate.RAW;

public class VarargsExample1 {


    public static void main(String[] args) {

        m1();
        m1(1);
        m1(2, 3, 7, 4, 5, 4);

        m2(1, 2, 3, 4, 5);

    }

    static private void m1(int... a) {
        for (int y : a) {
            System.out.println(STR."y value \{y}");
        }
        System.out.println(STR." a length: \{a.length}");
    }


    //  m2(int[]... x) //  OK
    //  m2(int... val, int... x) // doesn't compile
    //  m2(String/ char or any other datatype... val, int... x) // doesn't compile
    //  m2(int... []x) // doesn't compile

    // following is OK. varargs should be end of the parameter of function.
    // first value will be assigned to int in this case and others if provided assigned to x
    static private void m2(int val, int... x) {
        var str1 = RAW."val is \{val}";
        System.out.println(STR.process(str1));

        for (int i : x) {
            StringTemplate str2 = RAW."the value of i in x \{i}";
            System.out.println(STR.process(str2));
        }
    }


}
