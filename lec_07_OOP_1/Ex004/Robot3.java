package lec_07_OOP_1.Ex004;

import java.util.ArrayList;

public class Robot3 {

    enum State {  // состояние: вкл, выкл (enum - состояние)
        On, Off
    }

    // добавили пару статических полей
    private static int defaultIndex;  //создаем дефолтный индекс для нумерации
    private static ArrayList<String> names; // создаем коллекцию имен

    // статический инициализатор
    static {
        defaultIndex = 1; // начальный индекс
        names = new ArrayList<String>();
    }

    /** Уровень робота */
    private int level;

    /** Имя робота */
    private String name;

    /**состояние  */   // см выше  -> enun State
    private State state;

    /**
     * Создание робота. Конструктор
     * 
     * @param name  Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    private Robot3(String name, int level) {  // private - скрываем от пользователя. Тогда ниже в конструкторах для пользователя будет возможность либо указать одно имя или вообще без параметров. Система все сделает сама
        System.out.println(Character.isDigit(name.charAt(0)));
        if ((name.isEmpty() // если имя пустое
                || Character.isDigit(name.charAt(0))) // или начинается с цифры
                || Robot3.names.indexOf(name) != -1)  // или было задано раннее

        {   // тогда придумаем дефолтное имя
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {  // или имя пользователя
            this.name = name;
        }

        Robot3.names.add(this.name);    // и добавляем это(см выше) имя в коллекцию
        this.level = level;    // инициализация уровня
        this.state = State.Off;    // инициал-я начального состояния. по умолчанию выкл.

    }

    // #region другие конструкторы
    // но это нерпавильно, т.к. практически повторяют, но с малейшими изменениями. Ниже этих примеров смотрим

    // public Robot3(String name)    // для примера конструктор, что имя робота имеет только 1 аргумент
    // {
    // if ((name.isEmpty()
    // || Character.isDigit(name.charAt(0)))
    // || Robot3.names.indexOf(name) == -1)

    // { this.name = String.format("DefaultName_%d", defaultIndex++); }
    // else { this.name = name; }

    // Robot3.names.add(this.name);
    // this.level = 1;            //  отличие
    // this.state = State.Off;
    // }

    // public Robot3()      // или конструктор без параметров
    // {
    // this.name = String.format("DefaultName_%d", defaultIndex++);  // по умолчанию сразу присваивается дефолтное имя
    // Robot3.names.add(this.name);
    // this.level = 1;     // автоматически 
    // this.state = State.Off;
    // }

    // #endregion

    // #region правильные конструкторы

    public Robot3(String name) {  // конструктор с одним параметром вызывает имеющийся конструктор с 2мя аргументами
        this(name, 1);
    }

    public Robot3() { // конструктор без параметров, который вызывает конструктор с 1 параметром
        this(""); // вызывая в качестве аргумента пустую строку
    }

    // #endregion

    // Методы вкл\выкл подсистем

    public void power() {
        if (this.state == State.Off) { // если с-ма выключена,
            this.powerOn();  // нужно вызвать логику включения
            this.state = State.On;  // и поменять состояние нат то, что робот включен
        } else {
            this.powerOff(); // если робот включен, то выключаем
            this.state = State.Off;
        }
        System.out.println();
    }

    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    /** Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /** Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /** Приветствие */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /** Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /** Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /** Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /** Работа */
    public void work() {
        if (this.state == State.On) {     // если включено
            System.out.println("Working...");    // то работаем
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d\n", this.name, this.level);
    }
}
