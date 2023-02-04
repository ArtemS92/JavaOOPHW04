package Task_3_1;

import java.util.ArrayList;
import java.util.List;

public class Genealogy {

    public static void main(String[] args) {
        //отец h12
        Dad h1 = new Dad();
        h1.id = 1;
        h1.fn = "Игорь";
        h1.ln = "Петров";
        h1.age = 44;

        //сын от h1
        Child h12 = new Child();
        h12.id = 2;
        h12.fn = "Саша";
        h12.ln = "Петров";
        h12.age = 22;

        //сын от h1
        Child h13 = new Child();
        h13.id = 5;
        h13.fn = "Максим";
        h13.ln = "Петров";
        h13.age = 8;

        //мама h12
        Mom h3 = new Mom();
        h3.id = 3;
        h3.fn = "Света";
        h3.ln = "Иванова";
        h3.age = 40;

        //внук от h1 (сын h12)
        Grandson h22 = new Grandson();
        h22.id = 4;
        h22.fn = "Петя";
        h22.ln = "Петров";
        h22.age = 3;

        //родители
        h13.dad = h1;
        h13.mom = h3;
        h22.dad = h13;

        //дети
        Tree<Child> h1Childs = new Tree<>(h1.fn, h1.ln);
        h1Childs.add(h12);
        h1Childs.add(h13);

        for (int index = 0; index < h1Childs.count(); index++) {
            System.out.println(h1Childs.get(index));
        }
        System.out.println();



        Age old = (n, m) -> (n > m);
        if (old.isOlder(h1.age, h22.age)) {
            System.out.printf("%s старше %s", h1.fn, h22.fn);
            System.out.println();
        }
        if (!old.isOlder(h13.age, h3.age)) {
            System.out.printf("%s младше %s", h13.fn, h3.fn);
            System.out.println();
        }
    }
}

