package Lecture1_Abstractions.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentRepo {
    private final Map<String, Student> studentByName;

    public StudentRepo() {
        this.studentByName = new HashMap<>();
    }

    public void create(Student student) {
        studentByName.putIfAbsent(student.getName(), student);
    }

    public Student get(String name) {
        return studentByName.get(name);
    }
}
