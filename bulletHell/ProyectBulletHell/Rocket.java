import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Space ship which shoots at asteroids.
 * 
 * @author Davin McCall
 */
public class Rocket  extends Actor
{
    private int shotTimer = 0;

    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rocket()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() -50, image.getHeight()-50);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-1);
        }
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+1);
        }
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-1, getY());
        }
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+1, getY());
        }
        if (shotTimer > 0) {
            shotTimer = shotTimer - 1;
        }
        else if (Greenfoot.isKeyDown("space")) {
            getWorld().addObject(new Shot(this), getX(), getY());
            shotTimer = 200; // delay next shot
        }
    }

}
