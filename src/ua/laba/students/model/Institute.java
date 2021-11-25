package ua.laba.students.model;

import java.util.ArrayList;
import java.util.TreeSet;

public class Institute {
    private final String name;
    private TreeSet<Faculty> faculties;

    public Institute(String name, TreeSet<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public TreeSet<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(TreeSet<Faculty> faculties) {
        this.faculties = faculties;
    }
}
