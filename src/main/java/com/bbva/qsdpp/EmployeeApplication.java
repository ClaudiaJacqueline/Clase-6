package com.bbva.qsdpp;

public class EmployeeApplication {

    public static void main(String[] args) {

    Employee employee = new Employee(5);
    GobEmployee gobEmployee = new GobEmployee(10_000);
    PepsicoEmployee PepsicoEmploye = new PepsicoEmployee(15_000);
    BbvaEmployee bbvaEmployee = new BbvaEmployee(20_000);

    System.out.println(employee.cobrarBono());
    System.out.println(GobEmployee.cobrarBono());
    System.out.println(PepsicoEmployee.cobrarBono());
    System.out.println(BbvaEmployee.cobrarBono());

//    Employee poliGobEmp = GobEmployee;
    }

}
   