public class Example {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal", 10000, false);

        Human rahul = new Human(23, "Rahul", 15000, true);


    }

    void fun() {
        greeting();
    }

    void greeting() {
        System.out.println("Hello World");
    }
}

class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
