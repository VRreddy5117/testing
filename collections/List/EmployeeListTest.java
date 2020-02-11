package com.collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeListTest {

    public static void main(String[] args) {
        //List<Employee> emp = new ArrayList<Employee>(); // Best choice for retraival operations
        List<Employee> emp = new LinkedList<>(); //Best choice for insertion operation
        emp.add(new Employee(101, "Modiji", 10000.00));
        emp.add(new Employee(103, "Ramana", 20000.00));
        emp.add(new Employee(104, "Krish", 60000.00));
        emp.add(new Employee(102, "Arjun", 30000.00));
        emp.add(new Employee(106, "Bhishma", 50000.00));

        for (Employee empList : emp){
            System.out.println(empList);
        }

        System.out.println("Get Record Based on index : "+emp.get(2));

        System.out.println("############# Remove Record Based on the index ##############");
        emp.remove(2);

        for (Employee empList : emp){
            System.out.println(empList);
        }

        System.out.println("############# Add Record Based on the index ##############");
        emp.add(2, new Employee(105, "Yudhishtar", 70000.00));
        for (Employee empList : emp){
            System.out.println(empList);
        }
    }

}
