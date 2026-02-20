package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runTasks();
    }

    public static void runTasks() {
        Healthplan plan1 = new Healthplan(1, "A Sigorta", Plan.BASIC);
        Healthplan plan2 = new Healthplan(2, "B Sigorta", Plan.PREMIUM);

        String[] healthplans = new String[3];
        Employee employee = new Employee(101, "Ali Yılmaz", "ali@test.com", "1234", healthplans);

        employee.addHealthPlan(0, plan1.getName());
        employee.addHealthPlan(1, plan2.getName());
        employee.addHealthPlan(1, "Z Sigorta");

        String[] developers = new String[2];
        Company company = new Company(1, "Tech Corp", 50000, developers);

        company.addEmployee(0, employee.getFullName());

        System.out.println(plan1);
        System.out.println(employee);
        System.out.println(company);
    }
}