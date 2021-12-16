package ua.laba.students.process;

import ua.laba.students.model.Faculty;
import ua.laba.students.model.Institute;
import ua.laba.students.model.Student;

import java.util.*;

public class RectorialDepartment {

    private final Institute institute;

    //создаем институт по умолчанию
    public RectorialDepartment() {
        institute = init();
    }

    //передаем информацию об институте
    public RectorialDepartment(Institute institute) {
        this.institute = institute;
    }

    //подсчет студентов в институте
    public int amountOfStudentsInInstitute() {
        int amount = 0;
        for (Faculty faculty : institute.getFaculties()) {
            amount += faculty.getStudents()
                             .size();
        }
        return amount;
    }

    //найти первый из списка факультет с наибольшим количеством студентов
    public Faculty findFacultyWithMaxSizeStudents() {
        Faculty faculty = null;
        int amount = 0;
        for (Iterator i = institute.getFaculties()
                                   .iterator(); i.hasNext(); ) {
            Object elem = i.next();
            Faculty $faculty = (Faculty) elem;
            if($faculty.compareTo(amount) >= 1){
                faculty = $faculty;
                amount = $faculty.getStudents()
                                 .size();
            }
//            if($faculty.getStudents().size() > amount){
//                faculty = $faculty;
//                amount = $faculty.getStudents()
//                                 .size();
//            }
        }
        return faculty;
    }

    //найти студентом с оценкой от 95 до 100
    public TreeSet<Student> maxMark() {
        TreeSet<Student> students = new TreeSet<>();
        Iterator<Faculty> IFaculties = institute.getFaculties()
                                                .iterator();

        while (IFaculties.hasNext()) {
            Faculty faculty = IFaculties.next();
            Iterator<Student> IStudents = faculty.getStudents()
                                                 .iterator();
            while (IStudents.hasNext()) {
                Student student = IStudents.next();
                if(new StudentCompare().compare(student, student) == 1) {
                    students.add(student);
                }
//                if (student.getAverageMark() >= 95 && student.getAverageMark() <= 100)
//                    students.add(student);
            }
        }
        return students;
    }

    //институт по умолчанию
    private static Institute init() {

        return new Institute("Национальный технический университет Украины " +
                "\"Киевский политехнический институт имени Игоря Сикорского\"",
                new TreeSet<>(
                        Arrays.asList(
                                new Faculty("Факультет социологии и права",
                                        new TreeSet<>(
                                                Arrays.asList(
                                                        new Student("Петров Петр Петрович", 1000 + (int) (Math.random() * 1000), 85),
                                                        new Student("Федаров Федр Федарович", 1000 + (int) (Math.random() * 1000), 98),
                                                        new Student("Анновна Анна Генадеевна", 1000 + (int) (Math.random() * 1000), 75),
                                                        new Student("Максимов Максим Максимович", 1000 + (int) (Math.random() * 1000), 55),
                                                        new Student("Александров Александр Алексеевич", 1000 + (int) (Math.random() * 1000), 92),
                                                        new Student("Владимеров Владимер Владимерович", 1000 + (int) (Math.random() * 1000), 75)
                                                )
                                        )
                                ),
                                new Faculty("Факультет прикладной математики",
                                        new TreeSet<>(
                                                Arrays.asList(
                                                        new Student("Петров Петр Петрович", 1000 + (int) (Math.random() * 1000), 95),
                                                        new Student("Федаров Федр Федарович", 1000 + (int) (Math.random() * 1000), 100),
                                                        new Student("Анновна Анна Генадеевна", 1000 + (int) (Math.random() * 1000), 64),
                                                        new Student("Максимов Максим Максимович", 1000 + (int) (Math.random() * 1000), 82),
                                                        new Student("Александров Александр Алексеевич", 1000 + (int) (Math.random() * 1000), 93),
                                                        new Student("Владимеров Владимер Владимерович", 1000 + (int) (Math.random() * 1000), 91),
                                                        new Student("Гвоздь Алла Владимеровна", 1000 + (int) (Math.random() * 1000), 100),
                                                        new Student("Алпеев Роман Викторович", 1000 + (int) (Math.random() * 1000), 99)
                                                )
                                        )
                                ),
                                new Faculty("Факультет информатики и вычислительной техники",
                                        new TreeSet<>(
                                                Arrays.asList(
                                                        new Student("Петров Петр Петрович", 1000 + (int) (Math.random() * 1000), 88),
                                                        new Student("Федаров Федр Федарович", 1000 + (int) (Math.random() * 1000), 96),
                                                        new Student("Анновна Анна Генадеевна", 1000 + (int) (Math.random() * 1000), 84),
                                                        new Student("Максимов Максим Максимович", 1000 + (int) (Math.random() * 1000), 95),
                                                        new Student("Александров Александр Алексеевич", 1000 + (int) (Math.random() * 1000), 88),
                                                        new Student("Владимеров Владимер Владимерович", 1000 + (int) (Math.random() * 1000), 100),
                                                        new Student("Гвоздь Алла Владимеровна", 1000 + (int) (Math.random() * 1000), 99),
                                                        new Student("Алпеев Роман Викторович", 1000 + (int) (Math.random() * 1000), 97),
                                                        new Student("Версацкий Игорь Афонасович", 1000 + (int) (Math.random() * 1000), 78)
                                                )
                                        )
                                )
                        )
                )
        );
    }

    //вернуть информацию об институте
    public Institute getInstitute() {
        return institute;
    }
}
