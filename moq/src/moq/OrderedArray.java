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
public class OrderedArray {
     private long[]a;
   private int NumberOFElement;
    
    public OrderedArray(int n)
    {
    a=new long [n];
    NumberOFElement=0;
    }

    public void setNumberOFElement(int NumberOFElement) {
        this.NumberOFElement = NumberOFElement;
    }

    public void setA(long[] a) {
        this.a = a;
    }
    
   
   

    public int getNumberOFElement() {
        return NumberOFElement;
    }

    public long[] getA() {
        return a;
    }

}
