/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moq;

import javafx.scene.control.Label;

/**
 *
 * @author pc
 */
public class displayU {
     UnOrderedArray a;
    
    public displayU(UnOrderedArray a) {
        this.a = a;
    }
    
     public void prin(Label msg)
    {
       String va="UnOrdered Array:";
        for(int i=0;i<a.getNumberOFElement();i++)
    {
        va+=",";
        va+=a.getA()[i];
    }
        
        msg.setText(va);
  
    }
}
