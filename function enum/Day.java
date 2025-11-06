public class Day {
    enum DayName { MO, TU, WE, TH, FR, SA, SU }

    public static void main(String[] args) {
        try {
            System.out.println(DayName.valueOf("MO"));
            System.out.println(DayName.valueOf("ED"));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
