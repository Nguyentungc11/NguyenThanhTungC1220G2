package bai12_java_collection_framework.thuc_hanh.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompare {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("C",34,"Quảng Nam"));
        studentList.add(new Student("D",23,"Quảng Bình"));
        studentList.add(new Student("A",45,"Quảng Trị"));
        studentList.add(new Student("F",16,"Quảng Ngãi"));
        studentList.add(new Student("B",25,"Quảng Ninh"));
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("Comparator________________________");
        Collections.sort(studentList,new CompareByAge());
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
}
