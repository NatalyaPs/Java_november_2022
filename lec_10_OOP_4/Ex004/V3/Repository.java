package Ex004.V3;

import java.util.ArrayList;
import java.util.List;


public class Repository<T extends Content> {   //  <T extends Content>  -  для того, ч.б. нельзя было добавлять расширения других типов !!! Т в иерархии НИЖЕ Контента
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
