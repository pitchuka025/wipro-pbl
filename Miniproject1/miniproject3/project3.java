import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

public class project3 {
    static Student data[] = new Student[10];

    public project3() {
        // initialize
        data[0] = new Student("A1", new int[] {72, 73, 74});
        data[1] = new Student("B1", new int[] {75, 76, 77});
        data[2] = new Student("C1", new int[] {99, 99, 99});
        data[3] = new Student("C3", new int[] {100, 100, 99});
        data[4] = new Student("B2", new int[] {13, 88, 13});
        data[5] = new Student("C3", new int[] {14, 14, 99});
        data[6] = new Student("A2", new int[] {77, 55, 12});
        data[7] = new Student(null, new int[] {13, 88, 13});
        data[8] = new Student("A2", null);
        data[9] = null;
    }

    public static void main(String[] args) {
        project3 pm = new project3();
        StudentReport report = new StudentReport();

        if (args.length != 1) {
            System.out.println("Please provide the student index (0-9) as a command-line argument.");
            return;
        }

        int selectedIndex;
        try {
            selectedIndex = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid index. Please enter an integer between 0 and 9.");
            return;
        }

        if (selectedIndex < 0 || selectedIndex >= data.length) {
            System.out.println("Index out of range. Please select an index between 0 and " + (data.length - 1) + ".");
            return;
        }

        try {
            String result = report.validate(data[selectedIndex]);
            if ("VALID".equals(result)) {
                String grade = report.findGrades(data[selectedIndex]);
                System.out.println("Grade for student at index " + selectedIndex + " = " + grade);
            }
        } catch (NullStudentObjectException | NullNameException | NullMarksArrayException e) {
            e.printStackTrace();
        }
    }
}