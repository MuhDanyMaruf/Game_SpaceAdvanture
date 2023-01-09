import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nyawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nyawa extends Actor
{
    /**
     * Act - do whatever the nyawa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void gerak()
    {
        setLocation(getX(), getY()+1);
        if(getY()>500){
            setLocation(Greenfoot.getRandomNumber(400),
            Greenfoot.getRandomNumber(25));
        }
    }
    
    public void nyawa()
    {
         if (isTouching(Pesawat.class))
        {
            Latar w= (Latar)getWorld();
            w.updatenyawa(+1);
            getWorld().removeObject(this);
        }
        
    }
    
    public void act()
    {
        gerak();
    }
}
