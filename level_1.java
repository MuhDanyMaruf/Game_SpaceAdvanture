import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level_1 extends World
{

    /**
     * Constructor for objects of class level_1.
     * 
     */
    public level_1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(new Latar());
            Greenfoot.playSound("backsound.mp3");
        }
    }
}
