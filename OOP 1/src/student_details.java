public class student_details {
    public static void main(String[] args) {
        Student kunal = new Student();
        System.out.println(kunal.rno);

    }
}


class Student {
    int rno;
    String name;
    float marks;

    // student
    Student () {
        this.rno = 13;
        this.name = "Kunal Kusumame";
        this.marks = 88.8f;
    }
}