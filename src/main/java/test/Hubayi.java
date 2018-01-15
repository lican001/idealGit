package main.java.test;

import com.Person;

public class Hubayi {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(23);
        person.setName("哈哈");
        System.out.println(person.getAge()+person.getName());
        System.out.println("I for you");
    }
}
