package testproject;

public class Lesson5Cat {  //класс

    /* String name; // строчное значение
    String color;
    int age; // численное значение

    public Lesson5Cat(){ // ПУСТОЙ КОНСТРУКТОР. Чтобы не выдавало ошибку, если создан уже заполненный

    }

    public void voice(){
        System.out.println("Myau");
    }

    public String toString(){ // метод который возьмет класс кота и превратит иго в одну строку
        // возвращаемый тип String, значит нужен return
        return "Name is = " + name + " color is " + color + " age is " + age;

    }

    public static void main(String[] args) {
        Lesson5Cat lesson5Cat = new Lesson5Cat(); // в памяти зарезервировались место, для значений  name color age
        lesson5Cat.name = "Barsik"; //lesson5Cat.setName после инкапсуляции можно изменить
        lesson5Cat.setColor("black");
        lesson5Cat.setAge(2);

        lesson5Cat.voice();
        System.out.println(lesson5Cat.toString());

// создать нового кота
        Lesson5Cat lessonCat2 = new Lesson5Cat("Murzik", "white", 5);
        lessonCat2.voice();
        System.out.println(lessonCat2.toString());
    }
    // ИНКАПСУЛЯЦИЯ
        public void setName(String name){    // ИНКАПСУЛЯЦИЯ. возвращает значение
            this.name = name;
        }
        public String getName(){
        return name;
        }
        public void setColor(String color){    // ИНКАПСУЛЯЦИЯ нужно задать значение
        this.color = color;
        }
        public String getColor(){
        return color;
        }
        public int getAge(){
        return age;
        }
        public void setAge(int age){
       if (age >= 0) this.age = age;
        }



    // конструктор это метод который тоже называется как класс и не имеет
    // возвращаемого типа
   public Lesson5Cat(String name, String color, int age){
        this.name = name; // this это ссылка
        this.color = color;
        this.age = age;
   } // после создания данного конструктора нельзя использовать конструктор пустой по умолчанию
}
//ПОРЯДОК
// 0. main
//1. создается конструктор В КЛАССЕ.
//2. создается обьект
//3. методы
     */ // заметки с лекции

    /*private int id; // int переменная
    private String name; //переменная
    private String position; // переменная
    private int age; // переменная
    public Lesson5Cat(int id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }
    public void info() { //метод info выводим информацию в консоль
        System.out.println("id: " + id + "; Имя пользователя: " + name+ "; Должность: " + position + "; Возраст: " + age);
    }
    public void changePosition(String position) { // метод changePosition изменять должность
        this.position = position;
        System.out.println("Пользователь " + name + " получил новую должность: "
                + position);
    }*/
    /*String name;
    String color;
    int age;
public static void main(String[] args) {

    //Имя_класса имя_переменной = new Имя_класса();
    Lesson5Cat cat1 = new Lesson5Cat(); // создание обьекта cat1
    Lesson5Cat cat2 = new Lesson5Cat(); // создание 2го обьекта cat2
    cat1.name = "Barsik"; //Операция-точка служит для доступа к полям и методам объекта по его имени
    cat1.color = "White";
    cat1.age = 4;
    cat2.name = "Murzik";
    cat2.color = "Black";
    cat2.age = 6;
    System.out.println("Кот1 имя: " + cat1.name +  " цвет: " + cat1.color  +  " возраст " + cat1.age);
    System.out.println("Кот2 имя: " + cat2.name +  " цвет: " + cat2.color  +  " возраст " + cat2.age);
}
// создание обьектов:
    // -  создается переменная.  применяется оператор new
    // - создать и положить обьект в выделенную часть памяти*/ // заметки без конструктора

    private String name;
    private String color;
    private int age;

    public  Lesson5Cat (String name, String color, int age) {

        this.name = name;
        this.color = color;
        this.age = age;

        //не может быть нескольких конструкторов с одним и тем же
        //набором аргументов.
    }
    public void SetAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }
    public int getAge(){ // Геттер позволяет узнать содержимое поля, его тип совпадает с типом поля для которого он создан
        return age;
    }

    public void setName(String name) { //Сеттер используется для изменения значения поля, имеет тип void
        this.name = name;
    }
    public String getName(){
        return name;
    }
}


    
    



