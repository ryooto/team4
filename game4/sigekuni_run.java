import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sigekuni_run here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sigekuni_run extends Actor
{  private int  y=100;
   private double g = 0;
     public void act() 
    {
        //Add your action code here.
        g+=0.03;
        y+=g;
        setLocation(100,y);
        setRotation((int)(g * 16));
        if( Greenfoot.isKeyDown( "space" ) )
        {
                g=-1.3;
        }
    }
}