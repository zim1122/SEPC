class Person {
    public String name = "John";
    private int age = 25;
    protected String address = "Dhaka";

    public void showAge() {
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Name: " + p.name);
        p.showAge();
        System.out.println("Address: " + p.address);
    }
}

