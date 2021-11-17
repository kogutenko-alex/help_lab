package ua.laba.students;

import java.util.ArrayList;

public class Faculty {
    private final String name;
    private ArrayList<Student> students;

    public Faculty(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", studentsAmount=" + students.size() +
                '}';
    }
}
