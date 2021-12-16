package ua.laba.students.process;

import ua.laba.students.model.Student;

import java.util.Comparator;

public class StudentCompare implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getAverageMark() >= 95 && student2.getAverageMark() <= 100) return 1;
        else if(student1.getAverageMark() <= 95 && student2.getAverageMark() >= 100) return -1;
        else return 0;
    }
}
