package nl.bioinf.nomi.inheritance;

import nl.bioinf.nomi.encapsulation.Employee;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Manager extends Employee {
    Set<Employee> team = new HashSet<>();

    public Manager(String firstName, String lastName, LocalDate birthday, double salary) {
        super(firstName, lastName, birthday, salary);
    }

    public Manager(String firstName,
                   String lastName,
                   LocalDate birthday,
                   double salary,
                   Set<Employee> team) {
        super(firstName, lastName, birthday, salary);
        //this.team = team; //VERY BAD
        this.team.addAll(team);
    }

    public Set<Employee> getTeam() {
        return team;
    }

    @Override
    public void setSalary(double salary) {
        if (salary < getSalary()) {
            throw new IllegalArgumentException("Cannot lower salary of manager!");
        }
        super.setSalary(salary);
    }

    public void fireEmployee(Employee employee) {
        employee.setSalary(0);
    }

    public void addTeamMember(Employee employee) {
        this.team.add(employee);
    }
    //    @Override
//    public String toString() {
//        return "Manager{" +
//                "firstName='" + getFirstName() + '\'' +
//                ", lastName='" + getLastName() + '\'' +
//                ", age=" + getAge() +
//                ", salary=" + getSalary() +
//                '}';
//    }
}
