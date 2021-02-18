package entities;

/**
 *
 * @author jrimland
 */
public class Introvert extends Customer { 
    public String stuff;  
    public Introvert()
    {
       
    }
    
    public boolean needToMove(int numNeighbors)
    {
        if (numNeighbors > 3)
            return true;
        else
            return false;
    }
    
}
