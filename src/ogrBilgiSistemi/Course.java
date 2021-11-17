package ogrBilgiSistemi;

public class Course {

    String name;
    int code;
    String prefix;
    double note;
    String teacher;


    void Course(int code,String name,String prefix,double note ) {
        this.name = name;
        this.code = code;
        this.prefix=prefix;
        this.note=note;
    System.out.println(code+" "+prefix + " " +name+" "+" "+ note);
    }

    void addTeacher(String teacher) {
        this.teacher = teacher;
    }

    void printTeacher(String teacher) {
        this.teacher=teacher;
        System.out.println("Kursun öğretmeni " + teacher);
    }
}
