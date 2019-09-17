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
public class BinarySearch {
  OrderedArray z;
    
    public BinarySearch(OrderedArray z) {
        this.z=z;
    }
    
    public int search(long value )
    {
        int lower=0;
        int upper=z.getNumberOFElement()-1;
        while(true)
        {
            int mid=(lower+upper)/2;
            if(value==z.getA()[mid])
                return mid;
            else if(lower>upper)
                return -1;
            else
            {if(value>z.getA()[mid])
                    lower=mid+1;
                else
                    upper=mid-1;}
     
    
    }
    
    
    }
}
