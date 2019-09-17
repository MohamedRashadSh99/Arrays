/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moq;

/**
 *
 * @author pc
 */
public class InsertUnOrder {
       UnOrderedArray a;
    public InsertUnOrder(UnOrderedArray a) {
        this.a=a;
    }
    
    public boolean insert(int value)
    {
        if(a.getNumberOFElement()==a.getA().length)
            return false;
        else
            a.getA()[a.getNumberOFElement()]=value;
        a.setNumberOFElement(a.getNumberOFElement()+1);
            return true;
    }
}
