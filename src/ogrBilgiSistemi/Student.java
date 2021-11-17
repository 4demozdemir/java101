package ogrBilgiSistemi;

public class Student {
    String name;
    int stuNo;
    String classes;
    int mat;
    int kimya;
    int biyoloji;
    double avarage;
    String isPass;

    public void student(int stuNo, String name, String classes) {
        this.stuNo = stuNo;
        this.name = name;
        this.classes = classes;
        System.out.println(stuNo+" "+name + " " +classes+" ");
    }

    public Student() {

    }


    public void addBulkExamNote(int mat, int kimya, int biyoloji) {
        if (mat>=0 && mat<=100)
            this.mat=mat;
        if (kimya>=0 && kimya<=100)
            this.kimya=kimya;
        if (biyoloji>=0 && biyoloji<=100)
            this.biyoloji=biyoloji;
    }

    public void isPass() {

    }

    public void calcAvarage() {

    }

    public void printNote() {

    }
}
