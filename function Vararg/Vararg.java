public class Vararg {
    public static int add(int ... args) {
        int x = 0;

        for (int i : args)
            x += i;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3, 4)); // Result: 9
        System.out.println(add(new int[] {2, 3, 4})); // Result: 9
        System.out.println(add()); // Result: 0
    }
}
