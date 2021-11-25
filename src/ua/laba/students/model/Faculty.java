package ua.laba.students.model;

import java.util.ArrayList;
import java.util.TreeSet;

public class Faculty implements Comparable<Integer> {
    private final String name;
    private TreeSet<Student> students;

    public Faculty(String name, TreeSet<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public TreeSet<Student> getStudents() {
        return students;
    }

    public void setStudents(TreeSet<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", studentsAmount=" + students.size() +
                '}';
    }

    @Override
    public int compareTo(Integer amount) {
        Integer s1 = getStudents().size();
        return s1 - amount;
    }
}
