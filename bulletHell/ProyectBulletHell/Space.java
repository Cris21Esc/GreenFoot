import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    
    private Counter theCounter;
    
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 750, 1);
        addObject(new Rocket(), 240, 650);
        addObject(new Counter(), 40, 340);
    }
    public Counter getCounter()
    {
        return theCounter;
    }
}
