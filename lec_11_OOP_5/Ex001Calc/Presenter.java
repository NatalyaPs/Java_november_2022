package Ex001Calc;

public class Presenter {   // Presenter знает, что будет работать с view и model
    View view;   // здесь на уровне абстракций: какая-то view ... наперед неизвестная
    Model model;

    public Presenter(Model m, View v) {   // принимаем в конструкторе конкретные модел и вью
        model = m;
        view = v;
    }

    public void buttonClick(){    // кнопка
        int a = view.getValue("a: ");   // получаем значение
        int b = view.getValue("b: ");
        model.setX(a);                   // презентер связывает данные из вью с данными, которые кладем в модель
        model.setY(b);
        int result = model.result();                // получаем рез-т
        view.print(result, "Sum: ");     // данные из модели переходят во вью  (см. рисунок)
    }
}
