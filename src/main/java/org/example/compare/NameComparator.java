package org.example.compare;

import java.util.Comparator;

////This class will implement comparator to sort students based on their Names.
public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
    // Compare the names of two students
        return o1.getName().compareTo(o2.getName());
    }
}
