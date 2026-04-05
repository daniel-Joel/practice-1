package Test;

import java.util.ArrayList;

public class TeacherTest {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(new Teacher("燕双鹰","数学","打篮球"));
        list.add(new Teacher("超人强","体育","踢足球"));
        list.add(new Teacher("刘玄德","语文","吟诗作曲"));

        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
