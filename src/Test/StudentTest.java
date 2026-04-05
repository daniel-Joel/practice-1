package Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("张三","男",23));
        list.add(new Student("李四","男",26));
        list.add(new Student("王梅","女",25));

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
