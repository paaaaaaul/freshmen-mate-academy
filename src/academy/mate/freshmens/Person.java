package academy.mate.freshmens;

public class Person {

/*
   class Person is made, because and Student and Professor are both have
   name, lastname and etc values.

   just made to store values, that mentioned earlier for keeping less
   code at the other classes.

*/
    // создаем переменные класса Student

    String name;
    String lastanme;
    int age;
    String gender;

    //default конструктор
    public Person() {
    }

    //конструктор
    public Person(String name, String lastanme, int age, String gender) {
        this.name = name;
        this.lastanme = lastanme;
        this.age = age;
        this.gender = gender;
    }
}
