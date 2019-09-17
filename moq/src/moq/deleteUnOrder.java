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
public class deleteUnOrder {
    UnOrderedArray a;
    LinearSearch s;

    public deleteUnOrder(UnOrderedArray a) {
        this.a = a;
        s=new LinearSearch(a);
    }
    
    public boolean delete(int value)
    {
     if(a.getNumberOFElement()==0)
         return false ;
     else 
     {
         
        int find=s.search(value);
        if(find ==-1)
            return false;
        else
            for(int i=find;i<a.getNumberOFElement();i++)
            {
                swap(a.getA(),i,i+1);
                 
            }
         a.setNumberOFElement(a.getNumberOFElement()-1); 
        return true;
        
     }
    }
    private void swap (long a[],int x,int y)
    {
        a[x]=a[y];
    }
            
}
