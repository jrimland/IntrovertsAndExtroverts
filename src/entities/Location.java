/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author jrimland
 */
public class Location {
    private int xPos;
    private int yPos;
    private int numCustomers;
    
    public volatile float delegate;

    public void incrementCustomers()
    {
        delegate = .666f;
    }

    public void decrementCustomers()
    {
        
    }
    
    public int getNumCustomers()
    {
        return this.numCustomers;
    }
    
}
