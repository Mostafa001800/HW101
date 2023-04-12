package C1;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Pair<T,E> {
    private T key;
    private E obj;

    public Pair() {
    }

    public Pair(T key, E obj) {
        this.key = key;
        this.obj = obj;
    }
}