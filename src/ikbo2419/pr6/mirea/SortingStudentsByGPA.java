package ikbo2419.pr6.mirea;

import java.util.Arrays;
import java.lang.*;

public class SortingStudentsByGPA extends student implements Comparable<student> {

    public SortingStudentsByGPA(String name, int iD, int points) {
        super(name, iD, points);
    }

    public int compareTo(student o) {
        return this.points.compareTo(o.points);
    }
}
