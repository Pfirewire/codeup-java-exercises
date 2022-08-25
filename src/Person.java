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

        //I think this will output:
        //true
        //error
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        //It seems I was wrong and person1 == person2 is in fact false

        //I think this will output:
        //false
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        //I was wrong, I think it's because it's not comparing the Person.name with the '==' but instead the actual Person objects themselves, which can be ==

        //I think this will output:
        //John
        //John
        //John
        //Jane
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        //I don't really know why running person2.setName("Jane"); would change the output of person1.getName() from John to Jane
        //hmmm




    }
}
