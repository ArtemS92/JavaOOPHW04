package Task_3_1;

import java.util.ArrayList;
import java.util.List;

public class Tree <T extends Human>{
    List<T> ds;

    private String fn;
    private String ln;

    public Tree(String fn,String ln) {
        this.ds = new ArrayList<>();
        this.fn = fn;
        this.ln = ln;
        System.out.printf("\n  >>  Дети %s %s \n",fn,ln);
    }

    public void add(T human) {
        ds.add(human);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }
}
