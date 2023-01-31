package Ex004.V1;

import java.util.ArrayList;
import java.util.List;


public class Repository {    /// БЕЗ   ОБОБЩЕНИЯ  !! МОГУТ БЫТЬ ОШИБКИ
    List<Content> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name); // сделано для демонстрации работы данного репозитория в терминале
    }

    public void add(Content content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public Content get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
