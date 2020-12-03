package ikbo2419.pr6.mirea;

import java.util.Arrays;
import java.lang.*;

public class student implements Comparable<student> {

    protected final String name;
    protected final Integer iD;
    protected final Integer points;

    public student(String name, int iD, int points) {
        this.name = name;
        this.iD = iD;
        this.points = points;
    }

    public int compareTo(student o) {
        return this.iD.compareTo(o.iD);
    }

    public String toString() {
        return "Student: " + this.name + ". ID: " + this.iD + ". Points: " + this.points + ".";
    }
}
