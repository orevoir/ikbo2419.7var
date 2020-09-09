package ikbo2419.pr1.mirea;
import java.lang.*;
public class threeTests{
    public static void main(String[] args){
        Dog d1 = new Dog("Rex", 2);
        Dog d2 = new Dog("Lexxy", 7);
        Dog d3 = new Dog("Asya");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        System.out.println('\n');

        Ball b1 = new Ball("Pink", 22);
        Ball b2 = new Ball("Green", 17);
        System.out.println(b1);
        System.out.println(b2);

        System.out.println('\n');

        Book bo1 = new Book("Pushkin", 1832);
        Book bo2 = new Book("Musk", 2018);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
