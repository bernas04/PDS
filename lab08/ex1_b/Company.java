package ex1_b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    public static User user;

    private List<Employee> emps = new ArrayList<>();

    //public void admitPerson(String name, double salary) {
      //  Employee e = new Employee(name, salary);
        //emps.add(e);
    //}

    public void paySalaries(int month) {
        for (Employee e : emps) {
            BankAccount ba = e.getPerson().getBankAccount();
            ba.deposit(e.getSalary());
        }
    }

    public List<Employee> employees() {
        return Collections.unmodifiableList(emps);
    }

    public void admitEmployee(Person person, int i) {
        Employee e = new Employee(person, i);
        emps.add(e);
    }
}
