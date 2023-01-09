import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rudal_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rudal_2 extends Actor
{
    /**
     * Act - do whatever the Rudal_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void gerak()
    {
        setLocation(getX(),getY()-5);
        if(getY()<10){
            getWorld().removeObject(this);
        }else{
            cek_kena();
        }
    }
    
    public void cek_kena(){
        if(isTouching(Musuh_2.class))
        {
            getWorld().addObject(new Ledakan1(), getX(), getY());
            Latar m= (Latar)getWorld();
            m.addScore(20);
            
            Greenfoot.playSound("explosion.wav");
            removeTouching(Musuh_2.class);
            getWorld().removeObject(this);
        }
    }
    
    public void act() 
    {
        gerak();
    }    
}
