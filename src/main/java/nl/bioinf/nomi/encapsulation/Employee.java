package nl.bioinf.nomi.encapsulation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Employee {
    private final LocalDate birthday;
    private String firstName;
    private String lastName;
//    private int age;
    private double salary;

    public Employee(String firstName, String lastName, LocalDate birthday, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }

    public String getLastName() {
        return lastName;
    }

//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public long getAge() {
        LocalDate now = LocalDate.now();
        return ChronoUnit.MONTHS.between(birthday, now);
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

//    public void birthDay(){
//        this.age++;
//    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        if (salary < 0) throw new IllegalArgumentException("Negative salary: " + salary);

        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + getAge() +
                ", salary=" + salary +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(birthday, employee.birthday) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthday, firstName, lastName, salary);
    }
}
