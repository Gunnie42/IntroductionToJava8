package firstproject;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Gunter on 1/04/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
        //System.in.read();
    }

    private void run() {
        Person m = new Person();
        m.setFirstName("Sonia");
        m.setLastName("Merckx");

        Person p = new Person();
        p.setFirstName("Gunter");
        p.setLastName("Goossens");
        p.setMother(m);


        System.out.println(p.getFullName() + "; Age: " + p.getAge());

        p.setAge(21);

        System.out.println(p.getFullName() +
                "; Age: " + p.getAge() +
                "; Mother:" + p.getMother().getFullName());

        System.out.println(p.getFullName().equalsIgnoreCase("gunter Goossens"));
        System.out.println(p.getFullName().startsWith("Gunter"));

        String s = "Dog";
        String s2 = s;
        s = "DOG";
        System.out.println(s2);

        double d2 = 3.142;
        int i2 = (int) d2;

        for (int i = 0; i < 40; i++) {
            System.out.println(Math.random());
        }

        int i = 0;

        try {
            i = Integer.parseInt("452");
        } catch (NumberFormatException e){
            System.out.println("input Format is wrong");
        }

        int[] ages = {200, 14,22,37,5, 1, 67};
        System.out.println(Arrays.toString(ages));
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        System.out.println(p);
        System.out.println(m);

        System.out.println(ages[1]);

        double ave = 0;
        for (int j=0; j<ages.length; j++){
            ave += ages[j];
        }
        ave = ave / ages.length;

        System.out.println(ave);

        char[] letters = {'a','f','l','A','z','m'};

        System.out.println(Arrays.toString(letters));
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));


        System.out.println(ages[16]);

    }
}
