public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Piash";
        p1.age = 27;
        System.out.println(p1.name + " " + p1.age);

        Person p2 = new Person();
        p2.name = "Ashraful";
        p2.age= 28;
        System.out.println(p2.name + " " + p2.age);

        Person p3 = new Person(30 , "Ashraful Haque Piash");
        System.out.println(p3.name + " " + "is" + p3.age + " years old");

        p1.walk();
        p2.eat();
        p1.walk(5);
        p2.eat(3);
        System.out.println(Person.count);
    }
}
class Person{
    String name;
    int age;
    static int count;

    public Person(){
        count ++;
        System.out.println("Creating object");
    }
    public Person(int age, String name){
        this();
       this.age = age;
       this.name = name;

    }

    void walk(){
        System.out.println(name + " is walking");
    }
    void eat(){
        System.out.println(name + " is eating");
    }
    void walk(int steps){
        System.out.println(name + " walked "+ steps + " steps");
    }
    void eat(int amount){
        System.out.println(name + " eats " + amount + "  gram");

    }

}