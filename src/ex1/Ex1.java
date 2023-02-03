package ex1;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Name> list = new ArrayList<>();

        Name n1 = new Name("김");
        Name n2 = new Name("이");
        Name n3 = new Name("나");

        list.add(n1);
        list.add(n2);
        list.add(n3);

        for(Name e : list){
            System.out.println(e);
        }
    }
}

class Name{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}