package sem_09_OOP_3;

class Reflection_REAL_Student {
    public static void main(String[] args) {  
        
        Class[] interfaces = Student.class.getInterfaces();  // получаем все наследованные интерфейсы, возвращаем массив классов
        for (Class _interface : interfaces) {
            System.out.println(_interface.getName());  // sem_09_OOP_3.Marker   в консоли.  так мы узнали, что в классе Студент содержится маркер
        }
    }
}

interface Marker {  // создаем маркерный интерфейс
}

class Student implements Marker {

    public Student() {
    }

}