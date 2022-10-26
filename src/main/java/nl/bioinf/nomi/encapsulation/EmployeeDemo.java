package nl.bioinf.nomi.encapsulation;

import nl.bioinf.nomi.inheritance.Manager;

import java.time.LocalDate;
import java.util.*;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Michiel",
                "Noback",
                LocalDate.of(1969, 1, 20),
                30000);
        emp.setSalary(10000);
        //emp.setAge(-10);
//        System.out.println(emp);
//        System.out.println("emp.getAge() = " + emp.getAge());

//        Employee emp2 = new Employee("Michiel", "Noback", null, 30000);
//        System.out.println(emp2.getAge());

        Manager manager = new Manager("Piet",
                "Verdientveel",
                LocalDate.of(1988, 3, 29),
                100000);
//        System.out.println(manager);
        manager.setSalary(110000);
//        System.out.println(manager);

        manager.fireEmployee(emp);


        Set<Employee> employees = new HashSet<>();
        employees.add(emp);
        employees.add(manager);
        Manager manager2 = new Manager("Henk",
                "Jansen",
                LocalDate.of(1977, 12, 1),
                200000,
                employees);
        System.out.println(manager2.getTeam());
        employees.clear();
        System.out.println(manager2.getTeam());

    }
}
