package practisebikin;


import lists.classes.Employee;

import java.util.List;

public class ArrayList
{
    public static void main(String[] args) {
        List<Employee> employeeList = new java.util.ArrayList();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        System.out.println(employeeList.get(0));

    }
}
