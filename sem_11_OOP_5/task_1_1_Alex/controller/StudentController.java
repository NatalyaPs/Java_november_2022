package sem_11_OOP_5.task_1_1_Alex.controller;

import java.util.Scanner;

import sem_11_OOP_5.task_1_1_Alex.model.Student;
import sem_11_OOP_5.task_1_1_Alex.service.StudentService;
import sem_11_OOP_5.task_1_1_Alex.ui.StudentView;

public class StudentController implements UserController {
    // поля: у контроллера всегда есть ссылка на модель (оперирует над моделью) 
    // на вью по классике ссылки нет, но в нашем примере будет
    private StudentService model;
    private StudentView view;

    public StudentController(StudentService model, StudentView view) {
        this.model = model;
        this.view = view;
    }


    @Override
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Загрузить студентов из файла");
            System.out.println("2. Добавить студентa (затем сохранить и загрузить)");
            System.out.println("3. Напечатать всех студентов (сначала нужно загрузить)");
            System.out.println("4. Сохранить студентов");
            System.out.println("5. Выйти из программы");

            int index = scanner.nextInt();

            switch (index) {
                case 1: model.load(); break;
                case 2: model.addUser(new Student(scanner.next(), "Иванов", 20, 1, 4.8f)); break;   // вообще это задача контроллера заполнять, но здесь для примера добавим так
                case 3: view.showUsers(); break;
                case 4: model.save(); break;
                case 5: return; 
            
            
            }
        }
    }

    
}
