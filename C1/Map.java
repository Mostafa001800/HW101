package C1;

import C1.Pair;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public class Map<T> {
    protected List<Pair> list = new ArrayList<>();

    public Map() {
    }

    public void addList(Pair pair) {
        boolean test = false;
        for (Pair pair1 : list) {
            if (pair1.getKey() == pair.getKey()) {
                test = true;
            }
        }
        if (test == false) {
            list.add(pair);
            System.out.println("success");
        } else {
            System.out.println("error");
        }
    }

    public void sub(Pair pair) {
        list.remove(pair);
    }

    public void search(T t) {
        for (Pair pair1 : list) {
            if (pair1.getKey() == t) {
                System.out.println("Object : " + pair1.getObj() + "     key    : " + pair1.getKey());
            }

        }
    }
    public boolean equals(List li){
       boolean e= list.equals(li);
        return e;
    }
    public void assign(Map map){
        list=map.getList();
    }

    @Override
    public String toString() {
        String A = "";
        for (Pair pair : list) {
            A = A + " " + pair.getKey() + "  " + pair.getObj() + "\n";
        }
        return A;
    }
}