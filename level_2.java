import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level_2 extends level
{
    /**
     * Act - do whatever the level_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.start(); 
            Greenfoot.setWorld(new Latar_2());
            Greenfoot.playSound("backsound.mp3");  
        }
    }
}
