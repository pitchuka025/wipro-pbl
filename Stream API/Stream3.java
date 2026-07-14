import java.util.ArrayList;

class Student {
    private int rollNo;
    private String name;
    private int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }
}

public class Stream3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Rahul", 45));
        students.add(new Student(2, "Asha", 60));
        students.add(new Student(3, "Neha", 55));
        students.add(new Student(4, "Vikram", 40));
        students.add(new Student(5, "Meera", 70));

        long clearedCount = students.stream()
                .filter(s -> s.getMark() >= 50)
                .count();

        System.out.println("Number of students who cleared: " + clearedCount);
    }
}
