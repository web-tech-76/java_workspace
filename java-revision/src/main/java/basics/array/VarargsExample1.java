package basics.array;

public class VarargsExample1 {


    public static void main(String[] args) {

        m1();
        m1(1);
        m1(2, 3, 7, 4, 5, 4);

        m2(1, 2, 3, 4, 5);

    }

    static private void m1(int... a) {
        for (int y : a) {
            System.out.println("y value " + y);
        }
        System.out.println(" a length: " + a.length);
    }

    // following is OK. varargs should be end of the parameter of function.
    // first value will be assigned to int in this case and others if provided assigned to x
    static private void m2(int val, int... x) {

    }

    private void arrayEx() {
        int[][][] z = {{{1, 2, 3}}, {{4, 5}}, {null}, null};

        // System.out.println(z.length);

        //System.out.println(z[0].length);

        // System.out.println("z[i] -> " + z[0][0][0]);

        //int [] x = new int[-1];

//        int [] x1, x2;
//
//        x1 = new int[2];
//        //x2 =10; // doesn't work as x2 is also array
//        x2 = new int[3];
//

        //int x1[], x2; // x1 is array and x2 is int;


    }

    //  m2(int[]... x) //  OK

    //  m2(int... val, int... x) // doesn't compile
    //  m2(String/ char or any other datatype... val, int... x) // doesn't compile
    //  m2(int... []x) // doesn't compile

}
