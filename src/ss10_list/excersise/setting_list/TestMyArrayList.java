package ss10_list.excersise.setting_list;

import ss10_list.excersise.setting_list.MyArrayList;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Nghĩa");
        Student b = new Student(2, "Tài");
        Student c = new Student(3, "Định");
        Student d = new Student(4, "Tuấn");
        Student e = new Student(5, "Tú");
        Student f = new Student(6, "Đức");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();

        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
//        studentMyArrayList.add(f,4);
        studentMyArrayList.size();
//        System.out.println(studentMyArrayList.size());
//        System.out.println(studentMyArrayList.get(2).getName());
        newMyArrayList = studentMyArrayList.clone();
        Student student = newMyArrayList.remove(1);
        System.out.println(student.getName());

    }
}
