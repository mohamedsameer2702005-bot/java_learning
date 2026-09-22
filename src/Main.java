import java.util.*;

public class Main {
    public static void main(String[] args) {
        String name;
        int total = 0;

        int[] marks = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name");
        name = sc.nextLine();

        System.out.println("enter your marks");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double gpa = (double) total / marks.length;

        System.out.println(name);
        System.out.println(gpa);
        System.out.println(Arrays.toString(marks));

        String[] subjects = {"Subject 1", "Subject 2", "Subject 3", "Subject 4", "Subject 5"};
        for (int i = 0; i < marks.length; i++) {
            String grade = getGrade(marks[i]);
            System.out.println(subjects[i] + ": " + marks[i] + " - " + grade);
        }

        String overallGrade = getGrade((int)gpa);
        System.out.println("Overall: " + gpa + " - " + overallGrade);
    }

    static String getGrade(int mark) {
        if (mark > 90) return "A";
        else if (mark > 80)
             return "B";
        else if (mark > 70)
             return "C";
        else if (mark > 60)
             return "D";
        else if (mark > 50)
             return "E";
        else
             return "Fail";
        
    }
}

