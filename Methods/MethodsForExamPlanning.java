
import java.util.Scanner;

/**
 *
 * @author KraptuKrait
 */
public class MethodsForExamPlanning {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] hours_mo = {1, 2, 3, 4};
        String[] teachers_mo = {"Johnson", "Smith", "Williams", "Brown"};
        String[] subjects_mo = {"SPORT", "Spanish", "English", "Computer Science"};
        String[] rooms_mo = {"Room 101", "Room 204", "Room 315", "Room 420"};
        boolean[] exam_mo = {false, false, false, false};

        displaySchedule(hours_mo, teachers_mo, subjects_mo, rooms_mo, exam_mo);

        System.out.print("When should the class have an exam on Monday?: ");
        int inputHour = input.nextInt();

        enterExam(inputHour, hours_mo, exam_mo);

        displaySchedule(hours_mo, teachers_mo, subjects_mo, rooms_mo, exam_mo);
    }

    public static void displaySchedule(int[] hours, String[] teachers, String[] subjects, String[] rooms, boolean[] exams) {
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(hours[i] + " hour | Teacher: " + teachers[i] + " | Subject: " + subjects[i] + " | Room: " + rooms[i] + " | Exam: " + exams[i]);
        }
    }

    public static boolean[] enterExam(int inputHour, int[] hours, boolean[] exams) {
        for (int j = 0; j < hours.length; j++) {
            if (inputHour == hours[j]) {
                exams[j] = true;
            }
        }
        return exams;
    }

}
