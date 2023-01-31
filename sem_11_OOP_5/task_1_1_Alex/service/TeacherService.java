package sem_11_OOP_5.task_1_1_Alex.service;

import java.util.ArrayList;
import java.util.List;

import sem_11_OOP_5.task_1_1_Alex.model.Teacher;

public class TeacherService implements DataService<Teacher> {

    private List<Teacher> teachers = new ArrayList<>();   // здесь поле! это важно. Тичеры добавляются в эту коллекцию


    public List<Teacher> getUsers() {  // сделали заглушку для TeacherView. Как надо - см StudentService
        return null;
    }

    

    @Override
    public void addUser(Teacher user) {   // оставили заглушкии
        // TODO Auto-generated method stub
        
    }

    @Override
    public void save() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void load() {
        // TODO Auto-generated method stub
        
    }
    
}
