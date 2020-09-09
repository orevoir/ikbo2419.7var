package ikbo2419.pr1.mirea;

import java.lang.*;
public class Book {
    private String Author;
    private int Year;
    public Book(String n, int a){
        Author = n;
        Year = a;
    }
    public Book(String n){
        Author = n;
        Year = 0;

    }
    public Book(){
        Author = "Purple";
        Year = 1994;
    }
    public void setYear(int Year) {
        this.Year = Year;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public String toString(){
        return this.Author+", Year "+this.Year;
    }
}
