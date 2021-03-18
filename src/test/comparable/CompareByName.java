package test.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareByName {
    public static void main(String[] args) {
        List<Dog> listDog = new ArrayList<>();
        listDog.add(new Dog("a",12));
        listDog.add(new Dog("d",18));
        listDog.add(new Dog("b",10));
        Collections.sort(listDog);
        for (Dog dog:listDog) {
            System.out.println(dog.toString());
        }
        Collections.sort(listDog,new Dog());
        for (Dog a :listDog) {
            System.out.println(a.getName() + ":" + a.getAge() + ", " +
                    "");
        }
    }
}
