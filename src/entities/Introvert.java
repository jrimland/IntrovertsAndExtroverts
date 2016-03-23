package entities;

/**
 *
 * @author jrimland
 */
public class Introvert extends Customer {
    public Introvert()
    {
        
    }
    
    public boolean needToMove(int numNeighbors)
    {
        if (numNeighbors > 2) // what if they dont have any children?
            return true;
        else
            return false;
    }
    
}
