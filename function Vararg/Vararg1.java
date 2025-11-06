public class Vararg1 {
    public static int add_mult(int y ,int ... args) {
        int x = 0;

        for (int i : args)
            x += i;
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(add_mult(2, 3, 4)); // Result: 14
        System.out.println(add_mult(2)); // Result: 0
    }
}
