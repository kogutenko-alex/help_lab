package ua.laba.students;

import ua.laba.students.model.Faculty;
import ua.laba.students.model.Student;
import ua.laba.students.process.RectorialDepartment;

public class Main {
    public static void main(String[] args) {
        /**
         *   Создаем дефолтный набор института
         *   (см. конструктор без параметров @ua.laba.students.process.ProcessExecutor)
         */
        RectorialDepartment rectorial = new RectorialDepartment();
        System.out.println("Общая численость университета " + rectorial.getInstitute().getName()
                + " состовляет " + rectorial.amountOfStudentsInInstitute());
        System.out.println("");
        Faculty faculty = rectorial.findFacultyWithMaxSizeStudents();
        System.out.println("Факультет с наибольшим количеством учащихся это \"" +
                faculty.getName() + "\", где количество состовляет " +
                faculty.getStudents().size());
        System.out.println("");
        System.out.println("Список студентов с максимальным балом:");
        for(Student student : rectorial.maxMark()) {
            System.out.println(student);
        }
    }
}
