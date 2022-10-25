package nl.bioinf.nomi.encapsulation;

import java.time.LocalDate;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Michiel",
                "Noback",
                LocalDate.of(1969, 1, 20),
                30000);
        //emp.setAge(-10);
        System.out.println(emp);
        System.out.println("emp.getAge() = " + emp.getAge());
    }
}
