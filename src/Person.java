public class Person {
    private String name;

    public Person() {
        this("Unnamed");
    }
    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("This is a message for %s.%n", this.name);
    }



    public static void main(String[] args) {
        Person p1 = new Person("Steve");
        p1.sayHello();
        p1.setName("Tuco");
        p1.sayHello();
        Person p2 = new Person();
        p2.sayHello();
    }
}
