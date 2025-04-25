package views;

import models.Persona;

public class ViewConsole {
    
    public void printArray(Persona[] personas){
        
        for (Persona e : personas) {
            System.out.println(e);
        }
    }
}
