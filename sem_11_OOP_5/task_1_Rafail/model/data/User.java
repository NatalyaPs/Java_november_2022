/*Создайте три класса в пакете data: User, Teacher, Student. 
User содержит поля, общие для студента и преподавателя. 
Student и Teacher добавляют поля, специфичные для этих классов. 
Из соображений времени не делайте класс Teacher и связанные с ним классы.

Создайте два класса в пакете util: DataWriter и DataReader. 
Они позволяют сохранить в файл коллекцию студентов и преподавателей, а также загрузить их из файлов.

Создайте в пакете service: интерфейс DataService и два детских класса: StudentService и TeacherService. 
Сервис скрывает в себе коллекцию объектов. Интерфейс содержит операции:
добавить нового студента или учителя
сохранить всех в файл
загрузить всех из файла
*/

package sem_11_OOP_5.task_1_Rafail.model.data;

public abstract class User {
    private String firstName;
    private String lastName;
    private String nameOfUniversity;
    
    public User(String firstName, String lastName, String nameOfUniversity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nameOfUniversity = nameOfUniversity;
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + ", " + nameOfUniversity;
    }

    

    
}
