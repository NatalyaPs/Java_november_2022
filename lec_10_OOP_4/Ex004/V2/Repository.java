package Ex004.V2;

import java.util.ArrayList;
import java.util.List;


public class Repository<T> {    //   используем обобщения <T>, ч.б. не было ошибок
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T content) {   //   Т   , т.к. не знаем, какой будет тип (в V1 был Content)
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {    //   Т   , т.к. не знаем, какой будет тип (в V1 был Content)  
        return ds.get(index);
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
