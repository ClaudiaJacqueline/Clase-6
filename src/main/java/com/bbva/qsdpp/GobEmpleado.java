package com.bbva.qsdpp;//package com.bbva.employee;

public class GobEmployee extends Employee{

       public GobEmployee(int aBonus){
       super(aBonus);
       }

       @Override
       public int cobrarBono(){
          System.out.printl("Como empleado de gobierno mi bono es: " + getBono());
          return getBono();
       }

}
