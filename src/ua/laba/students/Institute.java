package ua.laba.students;

import java.util.ArrayList;

public class Institute {
    private final String name;
    private ArrayList<Faculty> faculties;

    public Institute(String name, ArrayList<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }
}
