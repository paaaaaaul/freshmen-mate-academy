Программа freshmens

Чтобы запустить прграмму, нужно открыть ее в среде разработчика (Intellij Idea, Eclipse, etc), открыть файл FirstDayOfTheGroupDecisions.java и нажать кнопку Run (в среде Intellij Idea сочетание клавиш Ctrl + Shift + F10).

Функции программы:
 - выбор старосты (из списка студентов);
 - проверка наличия или отсутствия студента;
 - вывод числа присутствующих/отсуствующих/общего колличества.

Программа состоит из 4х классов: FirstDayOfTheGroupDecisions, Student, Person, Professor.

Класс FirstDayOfTheGroupDecisions содержит main метод, в нем находятся данные для объектов классов Student и Professor. Из этого класса вызываются методы, с помощью которых выбирается староста (код метода находится в классе Student) и метод, с помощью которого производится перекличка/выводится на экран колличество присутствующих/отсутствующих/всего студентов в группе.

Класс Student содержит основные переменные (имя, фамилия, возраст, пол, уровень отвественности, лидерскиекачества, присутствие/отсутствие), два конструктора, метод toString(), метод selectHeadman(), с помощью которого в консоль выводится выбранный староста (реализовано на if'ах).

Класс Person создан для того, чтобы не делать дополнительные поля у классов Student и Professor (наследование).

Класс Professor содержит дополняющие класс Person переменные, конструктор, два ArrayList'а, метод muster, который проверяет на наличие студента (с помощью foreach + if), так же выводит на экран количество присутствующих/отсутствующих студентов (в единственном и множественном числе), а там же общее колличество. 

По ходу выполнения программы, на взгляд автора, достаточно комментариев, чтобы базово понять, где именно в программе происходят те или иные процессы.

Из очевидных нюансов (околоБагов) программы можно выделить такие:
- класс Person используется только в классе Professor;
- можно было бы вынести из main метода в отдельный класс добавление объектов классов Student и Professor;

Эти и другие изменения автор планирует внести в ближайшее время.

Приятного пользования программой. 

По всем вопросам можно обращаться на почту paaaaaaaaul13(at)gmail(dot)com

**Вывод программы должен выглядеть таким образом:
  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Hey, Linus Benedict Torvalds is a headman!!! Cheers
  
  ----------------------------------------------
  Is George Washington is present today? - false
  Is Franklin Pierce is present today? - false
  Is Abraham Lincoln is present today? - false
  Is Benjamin Harrison is present today? - false
  Is Richard Nixon is present today? - false
  Is Jimmy Carter is present today? - true
  Is George Bush is present today? - true
  Is Barack Obama is present today? - true
  Is Linus Benedict Torvalds is present today? - true
  Is William Henry Gates is present today? - true
  Present: 5 persons
  Absent: 5 persons
  Group size is: 10
  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
