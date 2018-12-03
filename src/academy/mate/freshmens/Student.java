package academy.mate.freshmens;

public class Student extends Person {

    // responsibilityLevel is gonna be from 1 to infinity, because life aint fair,
    // all freshmens came from different schools (we asume), and, according to
    // the characteristic paper, that every new student have we can't tell who
    // is more responsible
    //
    // (place for meme *you can not simply tell freshmens responsibility level*)

    // создаем переменные класса Student
    String name;
    String lastanme;
    int age;
    String gender;
    int responsibilityLevel;
    int leadersipAbilities;
    boolean isPresent;

    // default конструктор
    public Student() {
    }

    //конструктор
    public Student(String name, String lastanme, int age, String gender, int responsibilityLevel, int leadersipAbilities, boolean isPresent) {
        this.name = name;
        this.lastanme = lastanme;
        this.age = age;
        this.gender = gender;
        this.responsibilityLevel = responsibilityLevel;
        this.leadersipAbilities = leadersipAbilities;
        this.isPresent = isPresent;
    }

    //метод toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastanme='" + lastanme + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", responsibilityLevel=" + responsibilityLevel +
                ", leadersipAbilities=" + leadersipAbilities +
                '}';
    }

    //выбор старосты
    public void selectHeadman() {
        // selection of the headman
        //числа взяты случайно
        if (responsibilityLevel > 120 && leadersipAbilities > 130 && leadersipAbilities < 140) {
            System.out.println("Hey, " + this.name + " " + this.lastanme + " is a headman!!! Cheers");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        } else if (responsibilityLevel > 140 && leadersipAbilities > 150) {
            System.out.println("Hey, " + this.name + " " + this.lastanme + " is a headman!!! Cheers");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        } else if (responsibilityLevel < 100 && responsibilityLevel > 100) {
            System.out.println("Seems like " + this.name + " " + this.lastanme + " is responsible enough to be a headmen. We'll see.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        } else if (responsibilityLevel < 0 && responsibilityLevel < 0) {
            System.out.println("There's literally nobody can be a headmen, so let a professor make a choice in a few weeks.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
    }
}
