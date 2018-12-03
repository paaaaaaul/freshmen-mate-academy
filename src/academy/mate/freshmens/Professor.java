package academy.mate.freshmens;

import java.util.ArrayList;

public class Professor extends Person {

    // обавляем переменную "научная степень"
    String academicDegree;

    // создаем конструктор, который дополняет конструктор класса Person
    public Professor(String name, String lastanme, int age, String gender, String academicDegree) {
        super(name, lastanme, age, gender);
        this.academicDegree = academicDegree;

    }
    // объявляем ArrayList'ы, в которых будем хранить присутствующих и отсутствующих студентов
    ArrayList<String> present = new ArrayList<>();
    ArrayList<String> absent = new ArrayList<>();

    public void muster(ArrayList<Student> obj) {
        for (Student election : obj) {
            // просверяем список на наличие в нем объектов и имен
            if (obj == null && name == null)  {
                System.out.println("No presence - no scholarship");
            } else {
                // узнаем, есть ли студент в аудитории (выводим в консоль имя, фамилию, статус)
                System.out.println("Is " + election.name + " " + election.lastanme + " is present today? - " + election.isPresent);
            }
            //добавляем в соответствующие,объявленные ранеее, ArrayList'ы присутствующих и отсутствующих студентов
            if (election.isPresent) {
                present.add(election.name);
            } else {
                absent.add(election.name);
            }
        }

        // проверяем, число студентов, которые присутствуют (множественное или нет)
        // + выводим в консоль их кол-во
        if (present.size() == 1) {
            System.out.println("Present: " + present.size() + " person");
        } else {
            System.out.println("Present: " + present.size() + " persons");
        }

        // проверяем, число студентов, которые отсутствуют (множественное или нет)
        // + выводим в консоль их кол-во
        if (absent.size() == 1) {
            System.out.println("Absent: " + absent.size() + " person");
        } else {
            System.out.println("Absent: " + absent.size() + " persons");
        }

        // сумма студентов
        System.out.println("Group size is: " + (present.size() + absent.size()));
    }
}
