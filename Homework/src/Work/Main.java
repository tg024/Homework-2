package Work;

public class Main {
    public static void main(String[] args) {
        //Exercise 1

        String name = "temo";
        int number_1 = 23;
        float fl_1 = 5.4f;
        boolean bln_1 = true;
        char chr_1 = 'T';

        System.out.println(name);
        System.out.println(number_1);
        System.out.println(fl_1);
        System.out.println(bln_1);
        System.out.println(chr_1);

        //Exercise 2

        int a = 32;
        int b = 12;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Exercise 3

        int x = 20;

        System.out.println(x > 3 && x < 44);
        System.out.println(x < 7 || x > 13);
        System.out.println(!(x > 10 && x < 30));

        //Exercise 4

        int dateOfBirth = 2001;
        int currentYear = 2021;
        int myAge = currentYear - dateOfBirth;

        System.out.println(("ჩემი დაბადების წელია" + " " + dateOfBirth) + "," + " " + ("ჩემი ასაკია" + " " + myAge + " " + "წელი."));
    }
}
