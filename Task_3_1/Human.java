package Task_3_1;


public abstract class Human {

    @Override
    public String toString() {
        return String.format("%s %s", fn, ln);
    }

    int id;
    int age;
    String fn;
    String ln;

    Human mom;
    Human dad;
}

class Dad extends Human {
    public Dad() {
        super();
    }

}

class Mom extends Human {
    public Mom() {
        super();
    }

}

class Child extends Human {
    public Child() {
        super();
    }
}

class Grandson extends Human {
    public Grandson() {
        super();
    }
}
