package com.bbva.qsdpp;

public class PepsicoEmployee extends Employee{

public PepsicoEmployee(int aBonus){
       super(aBonus);
       }

       @Override
       public int cobrarBono(){
          System.out.printl("Como empleado de pepsico mi bono es: " + getBono());
          return getBono();
       }

}
