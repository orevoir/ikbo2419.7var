package ikbo2419.pr2.mirea;

import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Андрей", "firstmail@mail.ru", 'm');
        System.out.println(author);

        author.setEmail("secondmail@mail.ru");
        System.out.println(author);

        author.setEmail("thirdemail@mail.ru");
        System.out.println(author);
    }
}
