package com.bbva.qsdpp;

public class BbvaEmployee extends Employee{

public BbvaEmployee(int aBonus){
       super(aBonus);
       }

       @Override
       public int cobrarBono(){
          System.out.printl("Como empleado de BBVA mi bono es: " + getBono());
          return getBono();
       }

}
