package nl.bioinf.nomi.encapsulation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Employee {
    private int ID;
    private LocalDate birthday;
    private String firstName;
    private String lastName;
//    private int age;
    private double salary;

    public Employee(String firstName, String lastName, LocalDate birthday, double salary) {
        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastName);
        //Objects.requireNonNull(birthday);

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, LocalDate birthday) {
        this(firstName, lastName, birthday, 0);
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
        if (birthday == null) {
            System.err.println("age was mnot present for ");
            return -1;
        }
        LocalDate now = LocalDate.now();
        return ChronoUnit.YEARS.between(birthday, now);
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

    public void setSalary(double salary) {
        if (salary < 0) throw new IllegalArgumentException("Negative salary: " + salary);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
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

        return ID == employee.ID;
    }

    @Override
    public int hashCode() {
        return ID;
    }
}
