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

        p1.walk();
        p2.eat();
        p1.walk(5);
    }
}
class Person{
    String name;
    int age;

    void walk(){
        System.out.println(name + " is walking");
    }
    void eat(){
        System.out.println(name + " is eating");
    }
    void walk(int steps){
        System.out.println(name + " walked "+ steps + " steps");

    }

}