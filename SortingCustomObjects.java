import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int grade;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.grade, other.grade);
    }
    
    @Override
    public String toString() {
        return name + ": " + grade;
    }
}

public class SortingCustomObjects {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 85));
        students.add(new Student("Charlie", 95));
        
        Collections.sort(students);
        System.out.println("Sorted students by grade: " + students);
    }
}
