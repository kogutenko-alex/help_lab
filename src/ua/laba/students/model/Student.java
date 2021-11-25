package ua.laba.students.model;

import java.util.Comparator;

public class Student implements Comparator<Student>{
    private final String name;
    private final int gradeBookNumber;
    private final int averageMark;

    public Student(String name, int gradeBookNumber, int averageMark) {
        this.name = name;
        this.gradeBookNumber = gradeBookNumber;
        if(averageMark <= 100 && averageMark >= 60) {
            this.averageMark = averageMark;
        } else this.averageMark = 60;
    }

    public String getName() {
        return name;
    }

    public int getGradeBookNumber() {
        return gradeBookNumber;
    }

    public int getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return  String.format("%d %-35s %d", gradeBookNumber, name, averageMark);
    }

    /*
    Я не знал как лучше переопределить данную функцию
    Этот вариант не хороший но как я вижу лучший
     */
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.averageMark >= 95 && student2.averageMark <= 100) return 1;
        else if(student1.averageMark <= 95 && student2.averageMark >= 100) return -1;
        else return 0;
    }
}
