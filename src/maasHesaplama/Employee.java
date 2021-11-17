package maasHesaplama;

public class Employee {
    String name;
    double salary, newSalary;
    int workHours;
    int hireYear;

    double raise;
    double tax;
    double bonus;
    int hireYears;

    Employee(String name, double salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        raiseSalary();
        bonus();
        tax();
    }


    void raiseSalary() {

        this.hireYears = 2021 - this.hireYear;
        if (hireYears < 10) {
            raise = salary * 0.05;
        }
        if (hireYears > 9 && hireYear < 20) {
            raise = salary * 0.1;
        }

        if (hireYears > 19) {
            raise = salary * 0.15;
        }
    }

    void bonus() {
        if (workHours > 40) bonus = (workHours - 40) * 30;
    }

    void tax() {

        if (salary > 1000) tax = this.salary * 0.03;

    }

    String formatString(String format) {
        String indent = String.format("%-42s", "");
        return format + indent.substring(0, indent.length() - format.length()) + ":";
    }


    void printToString() {

        System.out.println("-----------------------------------------");
        System.out.println(formatString("Adı") + this.name);
        System.out.println(formatString("Maaşı") + this.salary + " ₺");
        System.out.println(formatString("Çalışma Saati") + this.workHours);
        System.out.println(formatString("Başlangıç Yılı") + this.hireYear);
        System.out.println(formatString("Vergi") + this.tax + " ₺");
        System.out.println(formatString("Bonus") + this.bonus + " ₺");
        System.out.println(formatString("Maaş Artışı") + this.raise + " ₺");
        System.out.println(formatString("Vergi ve Bonuslar ile birlikte maaş") + (this.salary  + this.bonus + this.raise+ " ₺"));
        System.out.println(formatString("Toplam maaş") + (this.salary - this.tax + this.bonus + this.raise) + " ₺");
    }


}
