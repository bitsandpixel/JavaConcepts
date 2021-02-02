package myjava.oops.misc.recursion;

/**
 * @author vishnu
 */
public class Numbers {

    public static void main(String[] args) {

//        System.out.printf("%d - %d - %d : %b%n", addIteration(1, 10),
//                addRecursion(1, 10),
//                addRecursionEnd(10),
//                addIteration(1, 10) == addRecursion(1, 10));
//        char x='b';
//        String y="vishnu";
//        System.out.println(x+"--"+y);
//        System.out.println(printThis(x,y));
        //polymorphism, static, final
        Numbers number = new PositiveNumbers();
        PositiveNumbers posNumber = new PositiveNumbers();
        System.out.println(number.addIteration(1, 10));
        System.out.println("res: " + number.addRecursionRes(1, 10));
//        Numbers number = new PositiveNumbers();
//        Numbers number = new PositiveNumbers();
        System.out.println(number.getClass().getSimpleName());
        System.out.println(posNumber.addRecursion(1, 10, 20));
//        System.out.println(number.addRecursion(1, 10, 20));//error
        System.out.println(number.addIteration(1, 10, 20));
        PositiveNumbers pos = new PositiveNumbers();
        pos.addRecursion(1, 10);

        //Recursion factorial
        System.out.println("fact of 0:" + number.fact(0));
        System.out.println("fact of 1:" + number.fact(1));
        System.out.println("fact of 2:" + number.fact(2));
        System.out.println("fact of 3:" + number.fact(3));
        System.out.println("fact of 4:" + number.fact(4));
        System.out.println("fact of 5:" + number.fact(5));
//        System.out.println("fact of -1:" + number.fact(-1));
//        System.out.println("fact of -10:" + number.fact(-10));s
        System.out.println("");

        System.out.println("fib of 0:" + number.fib(0));
        System.out.println("fib of 1:" + number.fib(1));
        System.out.println("fib of 2:" + number.fib(2));
        System.out.println("fib of 3:" + number.fib(3));
        System.out.println("fib of 4:" + number.fib(4));
        System.out.println("fib of 5:" + number.fib(5));
        System.out.println("fib of 12:" + number.fib(12));

    }

    public Numbers() {
        System.out.println("default super hit");
    }

    public static String printThis(Object x, Object y) {
        x = "vishnu";
        y = 9;
        return x + "--" + y;
    }

    public static final boolean REUSABLE = false;

    public int addIteration(int start, int end) {
        int add = 0;
        for (int j = start; j <= end; j++) {
            add += j;
        }
        return add;
    }

    public int addIteration(int start, int end, int except) {
        assert false;

        System.out.println("hit add");
        return 0;
//        int add = 0;
//        for (int j = start; j <= end; j++) {
//            add += j;
//        }
//        return add;
    }

    public final int addRecursion(int start, int end) {
        if (start == end) {
            return start;
        } else {
            return end + addRecursion(start, end - 1);
        }
    }

    public final int addRecursionRes(int start, int end) {
        int res = 0;
        if (start == end) {
            res = start;
        } else {
            res = end + addRecursion(start, end - 1);
        }
        return res;
    }

    private static int addRecursionEnd(int limit) {
//        int add = 0;
        if (limit != 1) {
            return limit + addRecursionEnd(limit - 1);
        } else {
//            add += limit;
            return 1;
        }
    }

    public int factRes(int num) {
        int res = 0;
        if (num >= 0) {
            if (num == 1 || num == 0) {
                res = 1;
            } else {
                res = num * factRes(num - 1);
            }
        }
        return res;
    }

    public int fact(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }

    public int fib(int num) {
        if (num > 1) {
            return (fib(num - 1) + fib(num - 2));
        } else {
            return (num);
        }
    }

}
