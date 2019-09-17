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
public class LinearSearch {
    UnOrderedArray z;
    
    public LinearSearch(UnOrderedArray z) {
        this.z=z;
    }
    
    public int search(long value )
    {
    for(int i=0;i<z.getNumberOFElement();i++)
    {
    if (z.getA()[i]==value)
        return i;
    }
    return -1;
    }
    
}
