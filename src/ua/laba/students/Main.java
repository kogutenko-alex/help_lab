package ua.laba.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Institute institute = init();
        System.out.println("Общая численость университета " + institute.getName() + " состовляет " + amountOfStudentsInInstitute(institute));
        System.out.println("");
        Faculty faculty = findFacultyWithMaxSizeStudents(institute);
        System.out.println("Факультет с наибольшим количеством учащихся это \"" + faculty.getName() + "\", где количество состовляет " + faculty.getStudents().size());
        System.out.println("");
        System.out.println("Список студентов с максимальным балом:");
        for(Student student : maxMark(institute)) {
            System.out.println(student);
        }
    }

    private static int amountOfStudentsInInstitute(Institute institute) {
        int amount = 0;
        for (Faculty faculty : institute.getFaculties()) {
            amount += faculty.getStudents().size();
        }
        return amount;
    }

    private static Faculty findFacultyWithMaxSizeStudents (Institute institute) {
        Faculty faculty = null;
        int amount = 0;
        for (Iterator i = institute.getFaculties().iterator(); i.hasNext();) {
            Object elem = i.next();
            Faculty $faculty = (Faculty) elem;
            if($faculty.getStudents().size() > amount) {
                faculty = $faculty;
                amount = $faculty.getStudents().size();
            }
        }
        return faculty;
    }

    private static ArrayList<Student> maxMark(Institute institute) {
        ArrayList<Student> students = new ArrayList<>();
        Iterator<Faculty> IFaculties = institute.getFaculties().iterator();
        while (IFaculties.hasNext()) {
            Faculty faculty = IFaculties.next();
            Iterator<Student> IStudents = faculty.getStudents().iterator();
            while (IStudents.hasNext()) {
                Student student = IStudents.next();
                if (student.getAverageMark() >= 95 && student.getAverageMark() <= 100)
                    students.add(student);
            }
        }
        return students;
    }

    private static Institute init () {

        return new Institute("Национальный технический университет Украины " +
                "\"Киевский политехнический институт имени Игоря Сикорского\"",
                new ArrayList<>(
                        Arrays.asList(
                                new Faculty("Факультет социологии и права",
                                        new ArrayList<>(
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
                                        new ArrayList<>(
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
                                        new ArrayList<>(
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
}
