package Classes.SalaryCalculator;

import java.sql.Date;

public class Employee {

    String name;
    String lastName;
    int workHours;
    int hireYear;
    int bonus;
    double raiseSalary;
    double salary;
    double tax;

    Employee(String name, String lastName, double salary, int workHours, int hireYear) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = 0;
        this.bonus = 0;
        this.raiseSalary = 0;

    }

    public void tax() {
        if (this.salary >= 1000) {
            this.tax = this.salary * 0.03;
        }

    }

    public void bonus() {
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
        }
    }

    public void raiseSalary() {
        int wYear = 2021 - this.hireYear;

        if (wYear < 10) {
            this.raiseSalary = this.salary * 0.05;
        } else if (wYear > 9 && wYear < 20) {
            this.raiseSalary = this.salary * 0.10;
        } else {
            this.raiseSalary = this.salary * 0.15;
        }

    }

    @Override
    public String toString() {
        tax();
        bonus();
        raiseSalary();

        return " Adı : '" + this.name + " " + this.lastName + "'" + "\n Maaşı : '" + this.salary + "'"
                + "\n Çalışma Saati : '" + this.workHours + "'" + "\n Başlangıç Yılı : '" + this.hireYear + "'"
                + "\n Vergi : '" + this.tax + "'" + "\n Bonus : '" + this.bonus + "'" + "\n Maaş Artışı :  '"
                + this.raiseSalary + "'" + "\n Vergi ve Bonuslar ile birlikte maaş : '"
                + (this.bonus - this.tax + this.salary) + "'" + "\n Toplam Maaş :  '" + (this.raiseSalary + this.salary)
                + "'";
    }

}
