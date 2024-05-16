import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String dob;
    private String address;
    private String gender;

    public Student(String name, String dob, String address, String gender) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
    }

    @Override
    protected void finalize() {
        System.out.println("Student " + name + " has been garbage collected.");
    }
}

public class Q7 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Alice", "2000-01-01", "123 Main St", "Female"));
        studentList.add(new Student("Bob", "1999-03-15", "456 Elm St", "Male"));

        for (int i = 0; i < 1_000_000; i++) {
            studentList.add(new Student("Temp" + i, "2000-01-01", "Temp Address", "Unknown"));
        }

        System.gc();

        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Total memory: " + totalMemory + " bytes");
        System.out.println("Used memory: " + usedMemory + " bytes");
        System.out.println("Free memory: " + freeMemory + " bytes");
    }
}
