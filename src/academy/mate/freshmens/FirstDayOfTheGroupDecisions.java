package academy.mate.freshmens;

import java.util.ArrayList;

public class FirstDayOfTheGroupDecisions {
    public static void main(String[] args) {

        // создаем ArrayList, в котором будем хнанить все объекты класса Student
        ArrayList<Student> group = new ArrayList<Student>();
        // доабвляем объекты класса Student в ArrayList, заполняем все поля в соответствии с требуемыми у конструктора параметрами
        group.add(new Student("George", "Washington", 67, "male", 10, 100, false));
        group.add(new Student("Franklin", "Pierce", 64, "male", 15, 19, false));
        group.add(new Student("Abraham", "Lincoln", 56, "male", 20, 89, false));
        group.add(new Student("Benjamin", "Harrison", 67, "male", 40, 50, false));
        group.add(new Student("Richard", "Nixon", 81, "male", 1, 1, false));
        group.add(new Student("Jimmy", "Carter", 94, "male", 90, 40, true));
        group.add(new Student("George", "Bush", 72, "male", 77, 65, true));
        group.add(new Student("Barack", "Obama", 57, "male", 111, 101, true));
        group.add(new Student("Linus Benedict", "Torvalds", 48, "male", 150, 160, true));
        group.add(new Student("William Henry", "Gates", 67, "male", 110, 110, true));

        // с помощью цикла foreach проходим по ArrayList и выбираем старосту по двум показателям:
        // responsibilityLevel - уровень ответственности и leadersipAbilities - лидерские способности
        // (оба показателя взяты случайно, совпадения с реальными личностями невозможны)
        for (Student headman : group ) {
            headman.selectHeadman();
        }

        // заполняем все поля в соответствии с требуемыми у конструктора параметрами для класса Professor
        Professor gud = new Professor("Albert","Einstein",76,"male","doctorate degrees in science, medicine and philosophy");
        // вызываем метод muster (перекличка), результаты метода выводятся в консоль
        gud.muster(group);

        // конец программы
    }
}
