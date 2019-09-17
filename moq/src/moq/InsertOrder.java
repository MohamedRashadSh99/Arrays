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
public class InsertOrder {
      OrderedArray a;
    public InsertOrder(OrderedArray a) {
        this.a=a;
    }
    
    public boolean insert(int value)
    {
        if(a.getNumberOFElement()!=a.getA().length)
        {int i;
        for(i=0;i<a.getNumberOFElement();i++)
        {
            
            if(a.getA()[i]>value||a.getA()[i]==value)
            {
                break;}
        }
        if(a.getA()[i]==value)
            return false;
        else
        {a.setNumberOFElement(a.getNumberOFElement()+1);
        for(int j=a.getNumberOFElement()-1;j>i;j--)
        {
           swap(a.getA(),j,j-1);
        }
        put(a.getA(),i,value);
       
            return true;
        }
        }
        else 
            return false;
    }
      private void swap (long a[],int x,int y)
    {
        a[x]=a[y];
    }
        private void put (long a[],int x,int y)
    {
        a[x]=y;
    }
      
}
