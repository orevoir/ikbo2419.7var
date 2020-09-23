package ikbo2419.pr2.mirea;

import java.lang.*;
public class Author {
    private String name;
    private String Email;
    private char gender;

    public Author (String name, String Email, char gender) {
        this.name = name;
        setEmail(Email);
        this.gender = gender;
    }
    public String getname() {
        return name;
    }
    public char getgender() {
        return gender;
    }

    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String toString() {
                return getname() + " (" + getgender() + ") - " + getEmail();
    }
}
